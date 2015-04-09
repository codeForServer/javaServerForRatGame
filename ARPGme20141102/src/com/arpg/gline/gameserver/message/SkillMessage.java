package com.arpg.gline.gameserver.message;

import netWork.proxy.SkillProxy;

import com.arpg.gline.gameserver.controller.ControllerModel;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;
import com.arpg.gline.gameserver.module.skill.entity.PlayerSkillEntity;
import com.arpg.gline.gameserver.module.skill.entity.SkillEntity;

/**
 * 技能消息发送
 * @author 杜祥
 * @date 2012-10-30
 */
public class SkillMessage extends SendManager
{

	/**
	 * 
	 * 发送技能学习命令
	 * @param player
	 * @param entity		技能实体
	 * @create	2012-11-5	欧阳
	 */
	public static void GC_LEARN_SKILL(PlayerEntity player, SkillEntity entity)
	{
		//send(player.getClient(), createBuffer128(), ControllerModel.SKILLMODEL, SkillProxy.GC_LEARN_SKILL, 
				//entity.getId(), entity.getEffectId(), entity.getLevel(), entity.gainEqLv(), entity.getExp());
	}
	
	/**
	 * 初始化加载玩家技能
	 * @param player		玩家
	 * @param entity		玩家技能实体
	 * @create	2012-11-12	欧阳
	 */
	public static void GC_INIT_SKILL(PlayerEntity player, PlayerSkillEntity entity)
	{
		send(player.getClient(), createBuffer512(), ControllerModel.SKILLMODEL, SkillProxy.GC_INIT_SKILL, entity.getMap());
	}
}
