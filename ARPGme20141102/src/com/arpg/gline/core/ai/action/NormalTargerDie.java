package com.arpg.gline.core.ai.action;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import netBase.World;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * AIĿ��������Ϊ
 */
public class NormalTargerDie implements ActionAll 
{
	
	public void action(SupAI ai, PlayerEntity roleEntity, int harm) {
		ConcurrentHashMap<Integer, Integer> hashMap = ai.getHatredList();
		
		PlayerEntity playEntity = null;
		
		for(Entry<Integer, Integer> e : hashMap.entrySet())//����������ˣ����Ҵӳ���б������
		{
			playEntity = World.newInstance().getChannel(e.getKey()).getPlayer();
			if(playEntity == null)
			{
				hashMap.remove(e.getKey());
				continue;
			}
			/*if(playEntity.getLiveStatus() == ParameterKey.STATUS_DIE && roleEntity.getRoleId() == playEntity.getRoleId())
			{
				ai.setRole(0);
			}
			if(playEntity.getLiveStatus() == ParameterKey.STATUS_DIE)
			{
				hashMap.remove(e.getKey());
			}*/
		}
		if(ai.getRoleId() == 0 && hashMap.size() == 0)//Ŀ��ȫ����(�ָ�BOSSѪ����ɾ��BOSS����BUFF)
		{
			ai.getStop().action(ai,null,0);
			ai.setFightStatus(false);
			//ai.getNpcEntity().setTargetx(ai.getNpcEntity().getInitX());
			//֪ͨǰ̨
			//---д����ǰ̨�ƶ�������
			ai.setMoveTime(System.currentTimeMillis()/1000);
			return;
		}
		if(ai.getRoleId() == 0)//������Ŀ��
		{
			int roleId = 0;
			
			int hatred = 0;
			
			for(Entry<Integer, Integer> e : hashMap.entrySet())
			{
				if(e.getValue() > hatred)
				{
					hatred = e.getValue();
					roleId = e.getKey();
				}
			}
			ai.setRole(roleId);
		}
		
	}

}
