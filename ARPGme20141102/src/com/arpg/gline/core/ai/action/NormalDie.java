package com.arpg.gline.core.ai.action;


import util.RandomUtil;

import com.arpg.gline.core.ai.NpcStore;
import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.gameserver.module.npc.entity.NpcBaseEntity;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;
import com.arpg.gline.gameserver.scence.ScenceEntity;

/**
 * ����������Ϊ
 * 
 * ������򵥵�������Ϊ��ֻ�߱���¼����ʱ������ù���Ϊ����״̬��֪ͨǰ̨.
 * ע������ֻ���������������򵥲��������߱���������������NPC��
 */
public class NormalDie implements ActionAll
{
	private NpcBaseEntity npcEntity;
	private ScenceEntity sceneEntity;
	
	public void action(SupAI ai, PlayerEntity roleEntity, int harm) {
		npcEntity = ai.getNpcEntity();//�õ�npc
		
		if(npcEntity.getHp() < 0)//����С��0 ������
		{
			//npcEntity.setLiveStatus(ParameterKey.STATUS_DIE);
			
			//ˢ��ʱ��
			int revivetime = npcEntity.getTimeMin() + RandomUtil.IntFromZero(npcEntity.getTimeMax());
			
			ai.setReviveTime(System.currentTimeMillis() + (long)revivetime);
			
			if(npcEntity.getSelectedRoleList()!=null)npcEntity.getSelectedRoleList().clear();//���ǰѡ�д�NPC���������
			
			//��ȡ����
			sceneEntity = NpcStore.sceneMap.get(npcEntity.getCurrMapID());
			
			if(sceneEntity != null)
			{
				sceneEntity.getNpcs().remove(Integer.valueOf(npcEntity.getRoleId()));
			}
			//��������֪ͨǰ̨(��)
			
			
			//������(��)
			
		}
		
	}
}
