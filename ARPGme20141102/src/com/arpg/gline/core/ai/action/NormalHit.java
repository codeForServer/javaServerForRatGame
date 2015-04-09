package com.arpg.gline.core.ai.action;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.gameserver.module.npc.entity.NpcBaseEntity;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * ��������Ϊ(��򵥵ı�������Ϊ)
 * 
 * ��������Ϊ�ڱ�������ʱ��Ѫ���ﵽһ��ֵʱ������˺��ı���,
 * �˺����ʺ�Ѫ����ʱд��,�Ժ�������NPC�ֶΣ���NPC�ֶ�����,
 * ������Ϊ�ڱ�������ʱ�򲻻�������������(�磺�������ﹲѪ��)�������¼�(��򵥵��˺���������).
 * ע������Ϊֻ���𱻹�����һЩ����������ı������Ŀ�����
 */
public class NormalHit implements ActionAll
{
	private NpcBaseEntity npcEntity;//NPCʵ��

	public void action(SupAI ai, PlayerEntity roleEntity, int harm) 
	{
		npcEntity = ai.getNpcEntity(); //�õ�NPCʵ��
		
		int hp = ai.getNpcEntity().getInitHp();//�õ�NPC���Ѫ��
		
		npcEntity.setHp(npcEntity.getHp() - harm);//�۳�NPCѪ��
		
		//�жϹ���Ѫ���Ƿ����0����һ�㡱����¹���ѪС�� ����0��ʱ����֤������������
		if(npcEntity.getHp() > 0)
		{								
			float f = npcEntity.getHp()/hp;
			//����Ѫ������һ��ֵ��ʱ�򣬹�����������
			if(f <= 0.5)
			{
				ai.setMultiple(0.5f);
			}
		}
	}
	
}
