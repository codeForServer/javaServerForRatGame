package com.arpg.gline.core.ai;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import util.RandomUtil;

import com.arpg.gline.core.ai.entity.NpcBornEntity;
import com.arpg.gline.gameserver.module.npc.entity.NpcBaseEntity;
import com.arpg.gline.gameserver.scence.ScenceEntity;

/**
 * �ڳ����д���NPC
 *
 */
public class NpcLoad 
{
	private ActionCreat actionCreat = ActionCreat.getInstance();
	private Logger logger = Logger.getLogger(NpcLoad.class);
	/**
	 * ��ʼ������NPC
	 */
	public void sceneNpcLoad()
	{
		Map<Integer, ScenceEntity> sceneMap = NpcStore.sceneMap;//��������
		
		HashMap<Integer, NpcBornList> npcBornMap = NpcStore.npcBornMap;//NPC��������
		
		HashMap<Integer, NpcBaseEntity> npcMap = NpcStore.npcMap;//NPC����

		NpcBornList npcBornList = null;//��ͼˢ�µ�LIST
		
		ScenceEntity sceneEntity = null;//����ʵ��
		
		for(Entry<Integer, ScenceEntity> e : sceneMap.entrySet())
		{
			sceneEntity = e.getValue();
			
			if(sceneEntity.getMapType() == 2)//2Ϊ������ͼ,������ͼ�ڳ�ʼ����ʱ���ü������
			{
				continue;
			}
			
			npcBornList = npcBornMap.get(e.getKey());
		
			
			if(npcBornList != null)
			{
				this.addNpcScene(sceneEntity, npcBornList, npcMap);//��NPC���볡��
			}
		}
	}
	
	
	/**
	 * �������NPC
	 * 
	 * ��npc�������ɶ�Ӧ��npc
	 */
	public void addNpcScene(ScenceEntity sceneEntity,NpcBornList npcBornList,HashMap<Integer, NpcBaseEntity> npcMap)
	{
		NpcBornEntity npcBornEntity = null;//NPC�����ʵ��
		NpcBaseEntity npcBaseEntity = null;//NPCʵ��
		NpcBaseEntity npcBaseCloneEntity = null;//��¡�Ժ��NPCʵ��
		
		List<Integer> npcs =  sceneEntity.getNpcs();
		
		
		{
			for(int i = 0 ; i < npcBornList.size() ; i++)
			{
				npcBornEntity = npcBornList.get(i);
				
				if(npcBornEntity == null)
				{
					continue;
				}
				
				npcBaseEntity = npcMap.get(npcBornEntity.getNpcId());
				
				if(npcBaseEntity == null)
				{
					logger.info("����ϵͳ��û��NPC:"+npcBornEntity.getNpcId());
					continue;
				}
				
				//��ȡnpc��Ѳ�߷�Χ��������Сx���;
				for(int j = 0 ; j < npcBornEntity.getNumber() ; j++)
				{
					npcBaseCloneEntity = npcBaseEntity.clone();
					
					//��npc��Ѳ�߷�Χ�ڣ������npc��������
					int x = npcBornEntity.getX() + RandomUtil.IntFromZero(npcBaseEntity.getPatrolRange());
					int y = npcBornEntity.getY() + RandomUtil.IntFromZero(npcBaseEntity.getPatrolRange());
					
					//��NPC���븳����Ϊ
					this.aiInit(npcBaseCloneEntity,sceneEntity.getId(), x, y);
					
					npcs.add(npcBaseCloneEntity.getRoleId());//��NPC���볡����
					
					NpcStore.npcArray.put(npcBaseCloneEntity.getRoleId(), npcBaseCloneEntity);
				}
			}
		}
	}
	
	/**
	 * ��NPC���븳����Ϊ
	 */
	public void aiInit(NpcBaseEntity npcBaseCloneEntity,int mapId,int x,int y)
	{
		npcBaseCloneEntity.setRoleId(NpcStore.getSystemIndexId());
		
		npcBaseCloneEntity.setInitX(x);
		
		npcBaseCloneEntity.setInitY(y);
		
		npcBaseCloneEntity.setCurrMapID(mapId);
	
		SupAI ai = new SubAi(actionCreat.creatAction().get("NormalDie"), 
								actionCreat.creatAction().get("NormalMove"), 
								actionCreat.creatAction().get("NormalGuard"), 
								actionCreat.creatAction().get("NormalHit"), 
								actionCreat.creatAction().get("NormalAttack"), 
								actionCreat.creatAction().get("NormalHatred"), 
								actionCreat.creatAction().get("NormalFindTarger"), 
								actionCreat.creatAction().get("NormalTargerDie"), 
								actionCreat.creatAction().get("NormalStop"));
		
		ai.setNpcEntity(npcBaseCloneEntity);
		
		ai.setaId(NpcStore.getAiSystemId());
		
		npcBaseCloneEntity.setNpcAiId(ai.getaId());
		
		ai.init();//AI��ʼ��
	}
}
