package com.arpg.gline.core.ai.action;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.core.ai.Inteface.ActionAll;

import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * NPC������Ϊ
 */
public class NormalAttack implements ActionAll 
{
	public void action(SupAI ai, PlayerEntity roleEntity, int harm) 
	{
		roleEntity.setHp(roleEntity.getHp() - harm);
		System.out.println("��ͨ����:"+roleEntity.getRoleId()+"���:"+harm);
		
	}
}
