package com.arpg.gline.gameserver.controller;

import java.util.List;

import netBase.util.GameClient;
import netWork.proxy.FightProxy;

import com.arpg.gline.gameserver.module.fight.FightLogic;
import com.commons.network.modulecore.IController;
import com.commons.network.modulecore.MethodAnnotation;
import com.commons.network.modulecore.model.CommandModel;

/**
 * 战斗控制器
 * @author 杜祥
 * @date 2012-10-30
 */
public class FightController implements IController
{

	@Override
	public List<CommandModel> getCommands()
	{
		return FightProxy.DATA_MODE();
	}
	
	/**
	 * 施放技能
	 * @param client				玩家连接
	 * @param id					攻击的目标ID
	 * @param type					目标的类型
	 * @param skillId				技能ID
	 * @param x						攻击的X坐标
	 * @param y						攻击的Y坐标
	 * @create 2012-11-1
	 */
	@MethodAnnotation(key = FightProxy.CG_CAST_SKILL)
	public void castSkill(GameClient client, double id, int type, int skillId, int x, int y, int attackType)
	{
		FightLogic.newInstance().castSkill(client.getPlayer(), (long)id, type, skillId, x, y, attackType);
	}
	
}
