package com.arpg.gline.core.ai.action;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * NPC��ֹ��ǰ������Ϊ
 * ����������ģ�ֹֻͣNPC��ǰ�ƶ�
 * �����ʱ���
 *
 */
public class NormalStop implements ActionAll 
{
	//@SuppressWarnings("unused")
	//private AiMoveUtil moveUtil = AiMoveUtil.getInstance();
	
	@SuppressWarnings("unused")
	public void action(SupAI ai, PlayerEntity roleEntity, int harm) 
	{
		//if(ai.getNpcEntity().getTargetPoint().equals(ai.getNpcEntity().getLastPoint())) return ;
		
		long time = System.currentTimeMillis()/1000;//�õ���ǰ����
		
		//����ٶ�������ʱ���ߵ�·��
		
		//�����������Ǻ�̨����·������������귢�͸�ǰ̨(��)
		//����ǰ̨����·������̨��֤����ֻ��֤���ڳ���������֪ͨǰ̨��
		
	}

}
