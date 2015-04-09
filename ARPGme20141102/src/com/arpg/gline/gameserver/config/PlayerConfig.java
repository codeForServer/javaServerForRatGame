package com.arpg.gline.gameserver.config;

/**
 * 玩家的配置信息
 * @author dai
 * @date 2014-12-6
 */
public class PlayerConfig {

	
	public static int SEX_MAN = 1;
	
	/**
	 * 女
	 */
	public static int SEX_WOMAN =2;
	
	//"战士" 
	public static int POPSINGER_ZS =1;
	
	//"法师"
	public static int POPSINGER_FS;
	
	//"道士" 
	public static int POPSINGER_DS=3;
	
	
	/**
	 * 多少毫秒移动一次
	 */
	public static int MS_MOVE =40;
	
	/**
	 * 玩家初始化 等级
	 */
	public static int PLAYER_INIT_LEVEL =1;
	
	/**
	 * 玩家最大等级
	 */
	public static int PLAYER_MAX_LEVEL=100;
	
	/**
	 * 玩家初始化  移动速度
	 */
	public static int PLAYER_INIT_V=6;
	
	/**
	 * 玩家初始化  铜币
	 */
	public static int PLAYER_INIT_COINS=0;
	
	/**
	 * 玩家初始化  元宝
	 */
	public static int PLAYER_INIT_GOLD=0;
	
	/**
	 * 玩家初始化场景
	 */
	public static int PLAYER_INIT_SCENE=1001;
	
	/**
	 * 玩家初始X坐标
	 */
	public static int PLAYER_INIT_X=5;
	
	/**
	 * 玩家初始Y坐标
	 */
	public static int PLAYER_INIT_Y=5;
	
	/**
	 * 玩家最多的数量
	 */
	public static int PLAYER_MAX_COUNT=3;
}

