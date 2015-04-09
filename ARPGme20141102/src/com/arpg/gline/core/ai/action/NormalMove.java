package com.arpg.gline.core.ai.action;


import util.RandomUtil;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.gameserver.module.npc.entity.NpcBaseEntity;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * AI�ƶ���Ϊ
 * NPC�򵥵��ƶ���Ѳ����Ϊ,���߱���б�¹���
 * 
 */
public class NormalMove implements ActionAll
{
	//private AiMoveUtil moveUtil = AiMoveUtil.getInstance();
	 //�ƶ���Ϊ
	public void action(SupAI ai, PlayerEntity roleEntity, int harm) 
	{
		NpcBaseEntity npcEntity = ai.getNpcEntity();
		//û���ƶ���ʱ��
		if(!ai.isFightStatus())
		{
			if(ai.getNpcEntity().getLastx() == ai.getNpcEntity().getTargetx())//�Ƿ��ܼ����˶�
			{
				long time = System.currentTimeMillis()/1000;
				
				if(time < ai.getStartStopMove())return ;//��������,���Ѳ��·��
				
				int[] xx = new int[10];
						//ai.getMapAnalyzer().patrolMove(npcEntity.getTargetx(), npcEntity.getTargety());//������ ��С��Ѳ�߷�Χ
				
				int x = 0;
				
				//����NPC Ѳ�ߵķ�Χ
				if(npcEntity.getTargetx() - xx[0] > xx[1] - npcEntity.getTargetx())
				{
					x = npcEntity.getTargetx() - npcEntity.getPatrolRange() < xx[0] ? xx[0] : npcEntity.getTargetx() - npcEntity.getPatrolRange();
					
				}else
				{
					x = npcEntity.getTargetx() + npcEntity.getPatrolRange() > xx[1] ? xx[1] : npcEntity.getTargetx() + npcEntity.getPatrolRange();
				}
				npcEntity.setTargetx(x);
				
				//֪ͨǰ̨NPC��ʼ�ƶ�(��)
				
				ai.setMoveTime(time);//��������ʱ��
				ai.setStartStopMove(0);//����ͣ��ʱ��
			}
			else//�ж�ʱ���Ƿ���
			{
				long time = System.currentTimeMillis()/1000;
				
				int moveTime = (int)ai.getMoveTime();
				
				int x = 0;
						//moveUtil.move(npcEntity.getInitSpeed(), (int)(time - moveTime));//����涨ʱ�������ߵľ���
				
				if(ai.getNpcEntity().getLastx() > ai.getNpcEntity().getTargetx())//���������ƶ�
				{
					if(ai.getNpcEntity().getTargetx() + x >= ai.getNpcEntity().getLastx())
					{
						ai.getNpcEntity().setLastx(ai.getNpcEntity().getTargetx());
						ai.getNpcEntity().setLasty(ai.getNpcEntity().getTargety());
						ai.setStartStopMove(time + npcEntity.getStopTimeMin() + RandomUtil.IntFromZero(npcEntity.getStopTimeMax()));//����NPCͣ�ٵ���ʱ��
						ai.setMoveTime(0);
					}
				}
				else//�ұ��ƶ�
				{
					if(ai.getNpcEntity().getLastx() + x >= ai.getNpcEntity().getTargetx())
					{
						ai.getNpcEntity().setLastx(ai.getNpcEntity().getTargetx());
						ai.getNpcEntity().setLasty(ai.getNpcEntity().getTargety());
						ai.setStartStopMove(time + npcEntity.getStopTimeMin() + RandomUtil.IntFromZero(npcEntity.getStopTimeMax()));//����NPCͣ�ٵ���ʱ��
						ai.setMoveTime(0);
					}
				}
				return;
			}
		}
		else
		{
			if(npcEntity.getRoleStatus().isDizzy() && ai.getNpcEntity().getLastx() != ai.getNpcEntity().getTargetx())//��ѣ״̬
			{
				ai.getStop().action(ai, null, 0);//ֹͣ��ǰ����
				return;
			}
			if(npcEntity.getRoleStatus().isStopMove() && ai.getNpcEntity().getLastx() != ai.getNpcEntity().getTargetx())//ֹͣ״̬
			{
				ai.getStop().action(ai , null, 0);//ֹͣ��ǰ����
				return;
			}
			int time = (int)(System.currentTimeMillis()/1000);
			int x = 0;
					//moveUtil.move(npcEntity.getInitSpeed(), (int)(time - ai.getMoveTime()));
			/**
			 * ���ʱ������Ƿ��ҵ�Ŀ�ĵ�
			 * ��Ϊ�ڲ��ı�Ŀ��λ�õ�����£�����Ҫ����Ƿ��Ѿ���Ŀ��λ��
			 */
			if(ai.getNpcEntity().getLastx() != ai.getNpcEntity().getTargetx())
			{
				if(ai.getNpcEntity().getLastx() > ai.getNpcEntity().getTargetx())//���������ƶ�
				{
					if(ai.getNpcEntity().getTargetx() + x >= ai.getNpcEntity().getLastx())
					{
						ai.getNpcEntity().setLastx(ai.getNpcEntity().getTargetx());
						ai.getNpcEntity().setLasty(ai.getNpcEntity().getTargety());
						ai.setMoveTime(0);
					}
				}
				else//�ұ��ƶ�
				{
					if(ai.getNpcEntity().getLastx() + x >= ai.getNpcEntity().getTargetx())
					{
						ai.getNpcEntity().setLastx(ai.getNpcEntity().getTargetx());
						ai.getNpcEntity().setLasty(ai.getNpcEntity().getTargety());
						ai.setMoveTime(0);
					}
				}
			}
			if(!ai.isChangeMove())return;
			
			if(ai.getNpcEntity().getLastx() != ai.getNpcEntity().getTargetx())
			{
				/**
				 * ����ϴκͱ�����겻һ��Ļ�  ��˵�����ƶ�.
				 * ���ƶ�״̬��ʱ�����ı�����·���Ļ���Ҫ������ϴ����ߵ��ĵط�,
				 * Ȼ������������·��.
				 */
				if(ai.getNpcEntity().getLastx() > ai.getNpcEntity().getTargetx())
				{
					ai.getNpcEntity().setTargetx(ai.getNpcEntity().getLastx() - x);//����Ŀ�����
				}
				else
				{
					ai.getNpcEntity().setTargetx(ai.getNpcEntity().getLastx() + x);//����Ŀ�����
				}
				ai.getNpcEntity().setLastx(ai.getNpcEntity().getTargetx());//������ʼ���
			}
			int[] xy = ai.getRoleLocation();//��ȡҪ�ƶ������
			
			npcEntity.setTargetx(xy[0]);//Ŀ�����
			
			//֪ͨǰ̨��ʼ�ƶ�(��)
			
			ai.setMoveTime(System.currentTimeMillis()/1000);//���ÿ�ʼ�ƶ�ʱ��
			
			ai.setStartStopMove(0);//����ͣ��ʱ��
			
			ai.setChangeMove(false);//����Ϊ��겻��Ҫ�ı�״̬
		}
	}
	
}
