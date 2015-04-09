package com.arpg.gline.core.ai.action;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.core.ai.Inteface.ActionAll;

import java.util.concurrent.ConcurrentHashMap;

import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * �����Ϊ(��򵥵ĳ����Ϊ)
 * 
 * �����Ϊ�����ҵļ�����ɵĳ��ֵ������Ӧ�ļӼ�
 * �ʺϼ򵥵ĳ��(������ĳЩ���ܶ���޼ӱ�,Ҳ���������κγ�޼���)
 * 
 * ע:����Ϊֻ�����¼��ҳ�޲���,����AI����ս��״̬�͸ı���Ŀ����������߱����������
 */
public class NormalHatred implements ActionAll
{
	//�����Ϊ
	public void action(SupAI ai, PlayerEntity roleEntity, int hard) {
		ConcurrentHashMap<Integer, Integer> hashMap = ai.getHatredList();//�õ�����ĳ���б�
		
		int hatred = 0;//��ǰ��ҵĳ��ֵ
		
		int roleId = roleEntity.getRoleId();//��õ�ǰ��ҵ�ID
		
		if(hashMap.containsKey(roleId))//���Ҹ�����Ƿ����ڳ���б�
		{
			hatred = hashMap.get(roleId) + hard;//�õ���ǰ���ֵ
		}
		else
		{
			hatred = hard;//�õ���ǰ���ֵ
		}
		hashMap.put(roleId, hatred);//������ҵĵ�ǰ��޼������б�
		
		//�жϹ�������Ƿ���Ŀ��(��Ŀ��hashMap.size()�򲻵���0���������0)
		if(hashMap.size() > 1)
		{
			//�жϸ�����Ƿ���ڵ�ǰ��ҵĳ��(�����ڣ���ı�Ŀ��)
			if(hatred > hashMap.get(ai.getRoleId()) && roleId != ai.getRoleId())
			{
				ai.setRole(roleId);//����Ŀ��
			}
		}
		else
		{
			ai.setRole(roleId);//����Ŀ��
			ai.setFightStatus(true);
		}
	}
}
