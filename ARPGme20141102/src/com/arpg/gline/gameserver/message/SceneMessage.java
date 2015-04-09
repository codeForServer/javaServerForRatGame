package com.arpg.gline.gameserver.message;

import java.util.Collection;

import netBase.util.GameClient;
import netWork.proxy.SceneProxy;

import com.arpg.gline.gameserver.controller.ControllerModel;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * 场景发送消息
 * @author 杜祥
 * @date 2012-10-10
 */
public class SceneMessage extends SendManager 
{
	/**
	 * 移动测试命令返回
	 * @param player				玩家实体
	 * @param state					状态
	 * @param list					节点列表
	 * @date 2012-10-23 杜祥
	 */
	//public static void GC_MOVE_TEST(PlayerEntity player, int state, List<Node> list)
	//{
		/*sendsState(player, createBuffer2048(), ControllerModel.SCENEMODEL, SceneProxy.GC_MOVE_TEST, state, list);*/
	//}
	
	/**
	 * 通过传送点切换场景的返回信息
	 * @param player			玩家实体
	 * @param state				命令执行的状态
	 * @create 2012-10-11 杜祥
	 */
	public static void GC_SCENE_POINT(PlayerEntity player, int state)
	{
		//sendResult(player, createBuffer128(), ControllerModel.SCENEMODEL, SceneProxy.GC_SCENE_POINT, state);
	}
	
	
	public static void GC_MOVE(GameClient client, long pid,int x, int y , int toX, int toY)	
	{
			
		send(client,createBuffer(2048), ControllerModel.SCENEMODEL,SceneProxy.CG_MOVE, 
				pid, 123,x,  y ,  toX,  toY);
	}
	
	
	/**
	 * 玩家进入场景获得信息
	 * @param player			玩家实体
	 * @param scene				场景实体
	 * @param playerList		玩家同一屏幕的玩家实体集合
	 * @create 2012-10-11 杜祥
	 *//*
	public static void GC_ENTER_SCENE(PlayerEntity player, SceneEntity scene, Collection<PlayerEntity> playerList, Collection<NpcEntity> npcList)
	{
		sends(player, createBuffer(64 * 1024), ControllerModel.SCENEMODEL, SceneProxy.GC_ENTER_SCENE, scene.getBaseId(), player.getX(), player.getY(), playerList, npcList);
	}*/
	
	
	/**
	 * 通知有人退出场景
	 * @param playerList		需要通知的玩家集合
	 * @param playerId			离开的玩家ID
	 * @create 2012-10-11 杜祥
	 */
	public static void GC_PLAYER_EXIT(Collection<PlayerEntity> playerList, long playerId)
	{
		/*sends(playerList, createBuffer128(), ControllerModel.SCENEMODEL, SceneProxy.GC_PLAYER_EXIT, playerId);*/
	}
	
	
	/**
	 * 通知有人进入场景
	 * @param playerList		需要通知的玩家实体集合
	 * @param player			进入场景的玩家实体
	 * @create 2012-10-11 杜祥
	 * @update	2012-12-13	darren.ouyang
	 */
	public static void GC_PlAYER_ENTER(Collection<PlayerEntity> playerList, PlayerEntity player)
	{
/*		int[] clothes = player.gainEquipContainer().gainClothesIdLv();
		int[] weapons = player.gainEquipContainer().gainWeaponsIdLv();
		sends(playerList, createBuffer128(), ControllerModel.SCENEMODEL, SceneProxy.GC_PlAYER_ENTER, 
				player.getId(), player.getLevel(), player.getProfession(), player.getSex(), player.getName(), player.getHp(), player.getMp(), player.gainHpMax(), player.gainMpMax(), 
				player.getState().isLive() == true ? 0 : 1, player.getX(), player.getY(), clothes[0], 
				clothes[1], weapons[0], weapons[1]);*/
	}
	
	/**
	 * 移动返回
	 * @param player			玩家实体
	 * @param state				状态
	 * @create 2012-10-11 杜祥
	 */
	public static void GC_SCENE_MOVE(PlayerEntity player,int state)
	{
		/*sendsState(player, createBuffer(50), ControllerModel.SCENEMODEL, SceneProxy.GC_SCENE_MOVE, state);*/
	}
	
	/**
	 * 推送玩家的当前位置
	 * @param player			玩家实体
	 * @param x					当前X坐标
	 * @param y					当前Y坐标
	 * @param targetX			目标X坐标
	 * @param targetY			目标Y坐标
	 * @param dir				方向
	 * @create 2012-10-11 杜祥
	 * @update	2012-10-24 杜祥
	 */
	public static void GC_SCENE_LOC(PlayerEntity player, int x, int y, int targetX,int targetY,int dir)
	{
		/*sends(player, createBuffer(30), ControllerModel.SCENEMODEL, SceneProxy.GC_SCENE_LOC, x, y, targetX, targetY, dir);*/
	}
	
	/**
	 * 推送玩家停止移动
	 * @param player			玩家实体
	 * @param x					玩家当前X坐标
	 * @param y					玩家当前Y坐标
	 * @param dir				方向
	 * @create	2012-10-11 杜祥
	 */
	public static void GC_SCENE_STOP(PlayerEntity player, int x, int y, int dir)
	{
		/*sends(player, createBuffer(30), ControllerModel.SCENEMODEL, SceneProxy.GC_SCENE_STOP, x, y, dir);*/
	}
	
	/**
	 * 通知场景玩家某个玩家的当前位置
	 * @param playerList		玩家集合
	 * @param playerId			移动的玩家ID
	 * @param x					当前X坐标
	 * @param y					当前Y坐标
	 * @param targetX			目标X坐标
	 * @param targetY			目标Y坐标
	 * @param direc				方向
	 * @create	2012-10-11 杜祥
	 * @update	2012-10-24 杜祥
	 */
	public static void GC_LOC_SCENE(Collection<PlayerEntity> playerList, long playerId, int x, int y, int targetX, int targetY, int direc)
	{
		/*sends(playerList, createBuffer(50), ControllerModel.SCENEMODEL, SceneProxy.GC_LOC_SCENE	, 
				playerId, x, y, targetX, targetY, direc);*/
	}
	
	/**
	 * 通知场景玩家某个玩家停止移动
	 * @param playerList		玩家集合
	 * @param playerId			移动的玩家ID
	 * @param x					当前X坐标
	 * @param y					当前Y坐标
	 * @param direc				方向
	 * @create	2012-10-11 杜祥
	 * @update	2012-10-24 杜祥
	 */
	public static void GC_STOP_SCENE(Collection<PlayerEntity> playerList, long playerId, int x, int y, int direc)
	{
		/*sends(playerList, createBuffer(50), ControllerModel.SCENEMODEL, SceneProxy.GC_STOP_SCENE, playerId, x, y, direc);*/
	}
	
	/**
	 * 通知场景玩家某个玩家生存状态改变
	 * @param playerList	场景玩家集合
	 * @param playerId		生存状态改变的玩家ID
	 * @param x				当前X坐标
	 * @param y				当前Y坐标
	 * @param state			当前生存状态
	 * @Date 2012-10-22	庄宏晓
	 */
	public static void GC_LIVE_CHANGE(Collection<PlayerEntity> playerList, long playerId, int x, int y, int state, int hp, int mp, int hpMax, int mpMax)
	{
		/*sends(playerList, createBuffer(50), ControllerModel.SCENEMODEL, SceneProxy.GC_LIVE_CHANGE, 
				playerId, x, y, state, hp, mp, hpMax, mpMax);*/
	}
	
	/**
	 * 复活点复活返回结果
	 * @param player	玩家实体
	 * @param result	结果状态
	 * @create 2012-11-23	庄宏晓
	 */
	public static void GC_RESET_REVIVE(PlayerEntity player, int result)
	{
		/*sendsState(player, createBuffer128(), ControllerModel.SCENEMODEL, SceneProxy.GC_RESET_REVIVE, result);*/
	}
	
	/**
	 * 原地复活返回结果
	 * @param player	玩家实体
	 * @param result	结果状态
	 * @Date 2012-10-22	庄宏晓
	 */
	public static void GC_LOCAL_REVIVE(PlayerEntity player, int result)
	{
		/*sendsState(player, createBuffer128(), ControllerModel.SCENEMODEL, SceneProxy.GC_LOCAL_REVIVE, result);*/
	}
	
	
	/**
	 * 移动路径
	 * @param player			玩家实体
	 * @param nodeList			移动路径
	 * @create 2012-10-26 杜祥
	 */
	//public static void GC_MOVE_PATH(Collection<PlayerEntity> player, long playerId, List<Node> nodeList)
	//{
		/*sends(player, createBuffer2048(), ControllerModel.SCENEMODEL, SceneProxy.GC_MOVE_PATH, playerId, nodeList);*/
	//}
	
	
	/**
	 * 推送玩家当前位置
	 * @param player			玩家实体
	 * @param x					玩家X坐标
	 * @param y					玩家Y坐标
	 * @param d					玩家方向
	 * @create 2012-10-26 杜祥
	 */
	public static void GC_PUSH_INDEX(Collection<PlayerEntity> player, long playerId, int x, int y, int d)
	{
		/*sends(player, createBuffer(50), ControllerModel.SCENEMODEL, SceneProxy.GC_PUSH_INDEX, playerId, x, y, d);*/
	}
	
	
	/**
	 * 增加血量
	 * @param playerList			玩家集合
	 * @param obj					实体对象
	 * @create 2012-11-8 杜祥
	 */
/*	public static void GC_ADD_HPMP(Collection<PlayerEntity> playerList, AbstractObject obj)
	{
		sends(playerList, createBuffer(50), ControllerModel.SCENEMODEL, SceneProxy.GC_ADD_HPMP, obj.getId(), 
				obj.gainType().getType(), obj.getHp(), obj.gainHpMax(),obj.getMp(),obj.gainMpMax());
	}*/
	
	
	/**
	 * 通知场景玩家增加NPC
	 * @param playerList			玩家列表
	 * @param npc					npc实体
	 * @create 2012-11-28 杜祥
	 */
/*	public static void GC_ADD_NPC(Collection<PlayerEntity> playerList, NpcEntity npc)
	{
		sends(playerList, createBuffer(60), ControllerModel.SCENEMODEL, SceneProxy.GC_ADD_NPC, npc.getId(),
				npc.getBaseId(), npc.getHp(), npc.gainMpMax(), npc.getMp(), npc.gainMpMax(), npc.getX(), npc.getY());
	}*/
	
	/**
	 * NPC移动
	 * @param playerList			玩家列表
	 * @param point					点
	 * @create 2012-11-28 杜祥
	 */
	/*public static void GC_MOVE_TO(Collection<PlayerEntity> playerList, long id, List<Point> points)
	{
		sends(playerList, createBuffer1024(), ControllerModel.SCENEMODEL, SceneProxy.GC_MOVE_TO, id, points);
	}
	
	*//**
	 * 怪物停止移动
	 * @param playerList			玩家列表
	 * @param npc					NPC实体
	 * @create 2012-11-29 杜祥
	 *//*
	public static void GC_STOP_MOVE(Collection<PlayerEntity> playerList, NpcEntity npc)
	{
		sends(playerList, createBuffer(50), ControllerModel.SCENEMODEL, SceneProxy.GC_STOP_MOVE, npc.getId(), npc.getX(), npc.getY());
	}
	
	*//**
	 * NPC死亡
	 * @param playerList			玩家列表
	 * @param id					NPCID
	 * @create 2012-11-29 杜祥
	 *//*
	public static void GC_NPC_DIE(Collection<PlayerEntity> playerList, long id)
	{
		sends(playerList, createBuffer(50), ControllerModel.SCENEMODEL, SceneProxy.GC_NPC_DIE, id);
	}*/
}
