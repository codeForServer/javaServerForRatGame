package com.arpg.gline.gameserver.config;

import com.commons.configuration.Property;

/**
 * 战斗静态配置
 * @author 杜祥
 * @date 2012-10-31
 */
public class FightConfig
{
	/**
	 * 攻击间隔ms
	 */
	public static int ATTACK_INTERVAL =1400;
	
	
	/**
	 * 战斗状态中下线的等待时长
	 */
	public static int FIGHT_STATE_DOWNLINE =60000;
	
	/**
	 * 退出战斗状态
	 */
	public static int EXIT_FIGHT_STATE=5000;
	
	
	/**
	 * 初始命中率
	 */
	public static float HIT_RATE_INIT= 0.8f;
	
	/**
	 * 命中上线
	 */
	public static float HIT_RATE_MAX=1;
	
	/**
	 * 闪避率上线
	 */
	public static float DODGE_RATE_MAX=0.75f;
	
	
	/**
	 * 闪避等级系数
	 */
	public static int DODGE_LV_RATIO = 400;
	
	/**
	 * 闪避初始值
	 */
	public static float DODGE_RATE_INIT = 0;
	
	
	/**
	 * 暴击率上线
	 */
	public static float CRIT_RATE_MAX = 0.8f;
}
