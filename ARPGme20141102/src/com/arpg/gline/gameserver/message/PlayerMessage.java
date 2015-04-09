package com.arpg.gline.gameserver.message;

import netBase.util.GameClient;
import netWork.proxy.LoginProxy;
import netWork.proxy.PlayerProxy;
import netWork.proxy.SceneProxy;

import org.jboss.netty.buffer.ChannelBuffer;

import com.arpg.gline.gameserver.controller.ControllerModel;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;


/**
 * 玩家角色相关信息发送
 * @author dai'jin'long
 * @date  2013.3.9
 */
public class PlayerMessage extends SendManager {

	/**
	 * 心跳连接
	 * @param player			玩家实体
	 * @param time				当前系统时间
	 */
	public static void GC_HEART_BEAT(GameClient client,int time)
	{
		//send(client, createBuffer(30), ControllerModel.USERMODEL, PlayerProxy.GC_HEART_BEAT, time);
		
	}
/*	public static void GC_HEART_BEAT(PlayerEntity player,long time)
	{
		sends(player, createBuffer(30), ControllerModel.USERMODEL, PlayerProxy.GC_HEART_BEAT, time);
	}*/
	
	/**
	 * 测试命令返回
	 * @param client			玩家连接
	 * @param countId			字符串数据测试
	 * @param i					Int型数据测试
	 * @param l					Long型数据测试
	 * @param b					Byte型数据测试
	 * @param s					Short型数据测试
	 * @param f					Float型数据测试
	 * @param d					Double型数据测试
	 * @param list				List型数据测试
	 * @create 2012-10-12 杜祥
	 */
	public static void GC_TEST(GameClient client,String countId, int i, long l, int b, int s, float f, double d)
	{
		ChannelBuffer channel = encode(createBuffer2048(), ControllerModel.USERMODEL, PlayerProxy.CG_CREATE, countId, i, l, b, s, f, d);
		send(client, channel);
	}

	
	/**
	 * 进入游戏返回
	 * @param player	 玩家实体
	 * @param result	结果集:返回所有数据。人物金币、血量、攻击等等
	 */
	public static void GC_LoginBack(GameClient client, int result, PlayerEntity player) {
		ChannelBuffer _buffer;
		if(player == null)
		{
			//_buffer = encodeResult(createBuffer128(), ControllerModel.LGMODEL,
					//LoginProxy.GC_LoginBack, result);
		}
		else 
		{
			//buffer = encodeResult(createBuffer1024(), ControllerModel.LGMODEL,
					//LoginProxy.GC_LoginBack, result, 	System.currentTimeMillis(),player);
		}
		
		_buffer = encode(createBuffer2048(), ControllerModel.LGMODEL,
				LoginProxy.GC_LoginBack, result);
		send(client, _buffer);
	}

	
	/**
	 * 广播玩家所在位置
	 * @param player	 玩家实体
	 * @param result	结果集:返回所有数据。人物金币、血量、攻击等等
	 */
	public static void GC_Broadcast(GameClient client, int result, PlayerEntity player) {
		ChannelBuffer _buffer;
		if(player == null)
		{
			//_buffer = encodeResult(createBuffer128(), ControllerModel.LGMODEL,
					//LoginProxy.GC_LoginBack, result);
		}
		else 
		{
			//buffer = encodeResult(createBuffer1024(), ControllerModel.LGMODEL,
					//LoginProxy.GC_LoginBack, result, 	System.currentTimeMillis(),player);
		}
		
		//传递对象 要写特定的解析协议 ，暂时只传递坐标
		//_buffer = encode(createBuffer2048(), ControllerModel.LGMODEL,LoginProxy.GC_LoginBack, player,1,1);
		
		/**
	        *推送
	        *Server
			*	场景可视对象ID 
			*	Name:visualId		TYPE:int		SIZE:4
			*	开始移动时间 
			*	Name:moveTime		TYPE:long		SIZE:8
			*	当前x 
			*	Name:currentX		TYPE:float		SIZE:4
			*	当前y 
			*	Name:currentY		TYPE:float		SIZE:4
			*	目标x 
			*	Name:targetX		TYPE:float		SIZE:4
			*	目标y 
			*	Name:targetY		TYPE:float		SIZE:4
	        */
		_buffer = encode(createBuffer2048(), ControllerModel.SCENEMODEL,SceneProxy.GC_MOVE, 101,
				1000L,0,0,10,10);
		send(client, _buffer);
	}
	
	
	
	
	
	
	
	
	/**
	 * 创建角色
	 * @param client	一个连接
	 * @param result	结果集
	 * @param Player	玩家实体
	 */
	public static void GC_CREATE_GAME(GameClient client, int result, PlayerEntity player) 
	{
		//ChannelBuffer channelBuffer = encodeResult(createBuffer128(),
				//ControllerModel.USERMODEL, PlayerProxy.GC_CREATE_GAME,
				//result
			//	);
		//send(client, channelBuffer);
	}

	
	/**
	 * 增加经验
	 * @param player	玩家实体
	 * @Date 2012-10-12	代金龙
	 */
	
	public static void GC_LEVEL_UP(PlayerEntity player,int addExp) {
		//sends(player, createBuffer128(), ControllerModel.USERMODEL,PlayerProxy.GC_LEVEL_UP,
				//player.getLevel(),player.getExp(),addExp);
	}
	/**
	 * 货币更新
	 * @param player	玩家实体
	 * @Date 2012-10-12  代金龙
	 */
	public static void GC_UPDATE_MONEY(PlayerEntity player) {
		//sends(player, createBuffer128(), ControllerModel.USERMODEL,PlayerProxy.GC_UPDATE_MONEY,
			//	player.getCoins(),player.getBindCoins(),player.getGold(),player.getBindGold());
	}
	
	/**
	 * 生存状态
	 * @param player	玩家实体
	 * @Date 2012-10-22代金龙
	 */
	public static void GC_LIVE_STATE(PlayerEntity player){
		//sends(player, createBuffer128(), ControllerModel.USERMODEL, PlayerProxy.GC_LIVE_STATE,
			//	player.getState().isLive() ? 0 : 1, player.getHp(), player.getMp(), player.gainHpMax(), player.gainMpMax());
	}
	
	
	/**
	 * 推送玩家战斗属性 
	 * @param player		玩家实体
	 */        
	public static void GC_PLAY_ATTR_RERUN(PlayerEntity player)
	{
/*		sends(player,createBuffer1024(),ControllerModel.USERMODEL, PlayerProxy.GC_PLAY_ATTR_RERUN,
				player.gainKfAtMin(),
				player.gainKfAtMax(),
				player.gainDgAtMin(),
				player.gainDgAtMax(),
				player.gainFpAtMin(),
				player.gainFpAtMax(),
				player.gainKfDg(),
				player.gainDgdf(),
				player.gainHpMax(),
				player.gainMpMax(),
				player.gainAtItv(),
				player.gainV(),
				player.gainDgLv(),
				player.gainHtLv(),
				player.gainCtLv(),
				player.gainCtDmg(),
				player.gainBkLv(),
				player.gainHpSt(),
				player.gainMpSt(),
				player.gainHpRs(),
				player.gainMpRs(),
				player.gainHpAdd(),
				player.gainMpAdd(),
				player.gainPsq(),
				player.gainPw(),
				player.gainItg(),
				player.gainTcq(),
				player.gainLuck(),
				player.gainClDf(),
				player.gainBdDf(),
				player.gainPsnDf(),
				player.gainSlcDf(),
				player.gainItnIjrDf(),
				player.gainCfsDf(),
				player.gainStfDf(),
				player.gainExpAdd(),
				player.gainGoldFd(),
				player.gainMf()
				);*/
	}
	
	
	/**
	 * 玩家被T出游戏
	 * @param player		玩家
	 */
	public static void GC_T_GAME(GameClient client)
	{
		//send(client, createBuffer(32), ControllerModel.USERMODEL, PlayerProxy.GC_T_GAME);
	}
}
