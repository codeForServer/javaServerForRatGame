package com.arpg.gline.gameserver.config;

import com.commons.configuration.Property;

/**
 * 场景配置信息
 * @author 杜祥
 * @date 2012-09-21
 */
public class SceneConfig 
{
	
	/**
	 * 移动掩码
	 */
	public static int MASK_MOVE;
	
	/**
	 * 阻挡验码
	 */
	public static int MASK_BAR;
	
	/**
	 * 一屏的宽(像素)
	 */
	public static int SCENE_SCREEN_WIDTH;
	
	/**
	 * 一屏的高（像素）
	 */
	public static int SCENE_SCREEN_HEIGHT;
	
	
	/**
	 * 半屏的宽
	 */
	public static float HALF_SCREEN_WIDTH;
	
	/**
	 * 半屏幕的高
	 */
	public static float HALF_SCREEN_HEIGHT;
	
	
	/**
	 * 场景传送点的半径
	 * 半径策划定制为2。5，因为误差关系，所以这里设置为3
	 */
	public static int DELIVER_POINT_RADIUS;
	
	/**
	 * 下
	 */
	public static int DEFAULT_DIRECTION_DOWN = 4;
	
	/**
	 * 左下
	 */
	public static int DEFAULT_DIRECTION_LEFTDOWN = 3;
	
	
	/**
	 * 左
	 */
	public static int DEFAULT_DIRECTION_LEFT = 2;
	
	
	/**
	 * 左上
	 */
	public static int DEFAULT_DIRECTION_LEFTUP = 1;
	
	
	/**
	 * 上
	 */
	public static int DEFAULT_DIRECTION_UP = 0;
	
	
	/**
	 * 右上
	 */
	public static int DEFAULT_DIRECTION_RIGHTUP = -1;
	
	
	/**
	 * 右
	 */
	public static int DEFAULT_DIRECTION_RIGHT = -2;
	
	
	/**
	 * 右下
	 */
	public static int DEFAULT_DIRECTION_RIGHTDOWN = -3;
	
	
}
