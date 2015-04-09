package com.arpg.gline.gameserver.controller;


import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import netBase.World;
import netBase.util.GameClient;
import netWork.proxy.PlayerProxy;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.controller.contrlBase.ControllerAnnotation;
import com.arpg.gline.gameserver.message.PlayerMessage;
import com.arpg.gline.gameserver.module.person.PlayerLogic;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * ��ɫϵͳ������
 * @author timoSky
 * @Data 2013-3-8
 */
public class PlayerController {
	
	private static final Logger log = Logger.getLogger(PlayerController.class);

	
	
	/**
	 * 测试命令
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
	@ControllerAnnotation(key = 111111)
	public void playerTest(GameClient client,String countId, int i, long l, byte b, short s, float f, double d)
	{
		PlayerMessage.GC_TEST(client, countId, i, l, b, s, f, d);
	}
	

	
	
	
	/**
	 * 玩家登陆
	 */
	@ControllerAnnotation(key = 100)
	public static void playerLoad(GameClient client, String count, String password)throws Exception
	{		
		log.info("账号"+count+"密码"+password);
		
		//TODO：将client 和  PlayerEntity实体挂钩
		
		
		PlayerLogic.newInstance().loadLine(client, count, password);	
	}  
	
	
	//用于测试 :  广播新用户进入场景，暂时为2D，不传入Z
	//TODO:现在也广播自己，用于测试
	public static void  broadcast(GameClient client,float x, float y)
	{
		
		//获取该场景能看到该用户的所有玩家，暂时玩家只有一个场景，就不去判断不同场景的玩家了。
		ConcurrentHashMap<Integer, GameClient> mMap  = World.newInstance().getChannelMap();
		

			GameClient nclient;
			PlayerEntity nplayer;
			int index = 0;

			for (Entry<Integer, GameClient> entry : mMap.entrySet()) {

				nclient = (GameClient) entry.getValue();
				nplayer = nclient.getPlayer();
				
				//TODO：暂时传空player
				//if (nplayer != null) {
					
					PlayerMessage.GC_Broadcast(nclient, 0, client.getPlayer());
					log.info("广播新用户进入场....被广播到的玩家 index" + index);
					index++;
				//}

			}
			log.info("广播新用户进入场....被广播到的玩家 总数" + index);
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * 玩家创建角色
	 */
	@ControllerAnnotation(key = PlayerProxy.CG_CREATE)
	public static void CreatePlayer(GameClient client, String name,byte countId, byte sex,byte profession)throws Exception
	{
		log.info("玩家创建角色111111111");	
		PlayerLogic.newInstance().createPlayer(client, countId, name, sex, profession);
		log.info("玩家创建角色");		
	}
	
	
	@ControllerAnnotation(key = 1001)
	public static void method_2(GameClient client,int d)
	{

		int time = 987654321;
		client.getPlayer();
		PlayerMessage.GC_HEART_BEAT(client,time);

		log.info("玩家进入游戏"); 
	}  
	
	/**
	 * 进入游戏后获取数据命令（背包，好友，身上装备）
	 * @param client	一个连接
	 */
/*	@MethodAnnotation(key = PlayerProxy.CG_REQUEST_DATA)
	public void enterGameSData(GameClient client)
	{
		进入游戏后获取数据命令 修改命令 
		PlayerLogic.newInstance().enterGameSData(client.getPlayer());
	
	}*/
	
/*	*//**
	 * 玩家上线请求进入场景
	 * @param client		一个连接
	 * @date 2012-10-17 杜祥
	 *//*
	@MethodAnnotation(key = PlayerProxy.CG_REQUEST_SCENE)
	public void requestScene(GameClient client)
	{
		PlayerLogic.newInstance().requestScene(client.getPlayer());
	}*/
	
	
}
