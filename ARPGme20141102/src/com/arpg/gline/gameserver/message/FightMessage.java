package com.arpg.gline.gameserver.message;

import java.util.Collection;
import java.util.List;

import netWork.proxy.FightProxy;

import com.arpg.gline.gameserver.controller.ControllerModel;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * 战斗消息发送
 * @author 杜祥
 * @date 2012-10-30
 */
public class FightMessage extends SendManager
{
	/**
	 * 施放技能返回
	 * @param player			玩家实体
	 * @param state				状态
	 * @create 2012-11-1 杜祥
	 */
	public static void GC_CAST_SKILL(PlayerEntity player, int state)
	{
		sendResult(player, createBuffer(30), ControllerModel.FIGHTMODEL, FightProxy.GC_CAST_SKILL, state);
	}
	
	
	/**
	 * 单体技能推送信息
	 * @param playerList		玩家集合
	 * @param playerId			施放技能者的ID
	 * @param type				施放技能者的类型
	 * @param skillId			技能ID
	 * @param targetId			目标ID
	 * @param Ttype				目标类型
	 * @param harm				伤害值
	 * @param miss				是否命中
	 * @param crit				普通、暴击、格挡
	 * @create 2012-11-8 杜祥
	 */
	public static void GC_SINGLE_SKILL(Collection<PlayerEntity> playerList, long playerId, int type, int skillId, long targetId, int typeGet, int harm, int miss, int crit)
	{
		//sends(playerList, createBuffer128(), ControllerModel.FIGHTMODEL, FightProxy.GC_SINGLE_SKILL, playerId, type, skillId, targetId, typeGet, harm, miss, crit);
	}
	
	
	
	/**
	 * 群体技能推送信息
	 * @param playerList			玩家集合
	 * @param playerId				施放技能者ID
	 * @param type					施放技能着的类型
	 * @param effectId				技能id
	 * @param x						技能施放的X坐标
	 * @param y						技能施放的Y坐标
	 * @param list					伤害信息
	 * @create 2012-11-10			杜祥
	 */
	//public static void GC_GROUP_SKILL(Collection<PlayerEntity> playerList, long playerId, int type, int effectId, int x, int y, List<HarmModel> list)
	//{
		//sends(playerList, createBuffer(2048), ControllerModel.FIGHTMODEL, FightProxy.GC_GROUP_SKILL, playerId, type, 
			//	effectId, x, y, list);
	//}
	
	/**
	 * 玩家当前状态
	 * @param player			玩家
	 * @param state				状态
	 */
	public static void GC_FIGHT_STATE(PlayerEntity player, int state)
	{
		//sends(player, createBuffer(30), ControllerModel.FIGHTMODEL, FightProxy.GC_FIGHT_STATE, state);
	}
}
