package com.arpg.gline.gameserver.module.scene;


import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * 场景逻辑类
 * @author 杜祥
 * @date 2012-10-10
 */
public class SceneLogic
{
	private final static SceneLogic sceneLogic = new SceneLogic();
	public Logger log = Logger.getLogger(SceneLogic.class);
	
	private SceneLogic()
	{
		
	}
	
	public static SceneLogic newInstance()
	{
		return sceneLogic;
	}
	
	/**
	 * 移动测试
	 * @param player
	 * @param x
	 * @param y
	 * @return
	 * @date 2012-10-23 杜祥
	 */
	/*public List<Node> moveTest(PlayerEntity player, int x, int y)
	{
		SceneEntity sceneEntity = player.gainSceneEntity();
		
		获得掩码和范围
		int[][] codes = sceneEntity.getCode();
		int row = codes.length - 1;
		int column = codes[0].length - 1;
		验证目标点是否错误
		if(x < 0 || x > row  || y < 0 || y > column) return null;
		if(codes[x][y] == SceneConfig.MASK_BAR) return null;
		查找路径
		Astar astar = new Astar(codes, row, column);
		List<Node> list = astar.search(player.getX(), player.getY(), x, y);
		return list;
	}*/
	
	
	/**
	 * 通过传送点切换场景
	 * @param player			玩家实体
	 * @param pointId			传送点ID
	 * @create 2012-10-11		杜祥
	 */
	public void teleportCutoverScene(PlayerEntity player, int pointId)
	{
		/*SceneEntity sceneEntity = player.gainSceneEntity();
		获得传送点
		TeleportModel model = sceneEntity.getTeleport().get(pointId);
		换算坐标
		//int minX = model.getX() - SceneConfig.DELIVER_POINT_RADIUS;
		//int maxX = model.getX() + SceneConfig.DELIVER_POINT_RADIUS;
		//int minY = model.getY() - SceneConfig.DELIVER_POINT_RADIUS;
		//int maxY = model.getY() + SceneConfig.DELIVER_POINT_RADIUS;
		命令执行的状态
		int state = 0;
		判断玩家是不是踩在这个传送点上
		//if((minX <= player.getX() && maxX >= player.getX()) && (minY <= player.getY() && maxY >= player.getY()))
		//{
			判断是否活着
			if(player.getState().isLive())
			{
				sceneEntity = SceneManager.get(model.getMapId());
				SceneMessage.GC_SCENE_POINT(player, state);
				SceneEngine.exitEnterBornPoint(player, sceneEntity);
			}
			else
			{
				state = ErrorCodeType.CODE_ERROR12.getCode();
				SceneMessage.GC_SCENE_POINT(player, state);
			}
		//}
*/	}
	
	
	/**
	 * 移动目标点
	 * @param player			玩家实体
	 * @param x					移动目标X
	 * @param y					移动目标Y
	 * @create 2012-10-11 杜祥
	 */
	//public int sceneMove(PlayerEntity player, List<Node> list)
	{
		/*SceneEntity sceneEntity = SceneManager.get(player.getMapId());
		判断玩家当前是否在移动，如果在移动先停止移动
		int state = ErrorCodeType.CODE_ERROR12.getCode();
		synchronized (player) 
		{
			if(player.gainMovePath() != null)
			{
				SceneEngine.stopMove(player);
			}
			判断玩家是否死亡
			if(!player.getState().isLive())
				return state;
			else
			{
				//算出玩家目标点是否可移动
				state = SceneEngine.pathSearch(player, sceneEntity, list);
			}
				
		}
		log.debug(player.getId() + "state" + state + "node" + list);
		return state;*/
	}
	
	/**
	 * 移动路径
	 * @param player			玩家实体
	 * @param nodeList			移动路径
	 * @create 2012-10-26 杜祥
	 */
/*	public void movePath(PlayerEntity player, List<Node> nodeList)
	{
		Collection<PlayerEntity> list = SceneEngine.getScreenPlayer(player, player.gainSceneEntity());
		SceneMessage.GC_MOVE_PATH(list, player.getId(), nodeList);
	}*/
	
	
	/**
	 * 玩家当前位置
	 * @param player			玩家实体
	 * @param x					当前X坐标
	 * @param y					当前Y坐标
	 * @param d					方向
	 */
	/*public void moveIndex(PlayerEntity player, int x, int y, int d)
	{
		SceneEntity scene = player.gainSceneEntity();
		
		if(scene.getCode()[y][x] == SceneConfig.MASK_BAR)
		{
			SceneMessage.GC_PUSH_INDEX(SceneEngine.getScreenPlayer(player, scene), player.getId(), player.getX(), player.getY(), player.getD());
		}
		else
		{
			player.setX(x);
			player.setY(y);
			player.setD(d);
		}
	}*/
	
	
	/**
	 * 复活点复活
	 * @param player	玩家实体
	 * @create 2012-10-25	庄宏晓
	 * @Update 2012-11-23	庄宏晓
	 */
	/*public int resetRevive(PlayerEntity player)
	{
		没死亡不能复活
		if(player.getState().isLive()){
			return ErrorCodeType.CODE_ERROR74.getCode();
		}
		
		player.getState().setLive(true);
		player.setHp(player.gainHpMax());
		player.setMp(player.gainMpMax());
		PlayerMessage.GC_LIVE_STATE(player);
		log.info(new StringBuilder("复活点复活-玩家ID[").append(player.getId())
				.append("]生存状态[").append(player.getState().isLive()).append("]"));
		
		SceneEntity sceneEntity = player.gainSceneEntity();
		
		退出场景,进入目标场景
		
		SceneEngine.exitScene(player);
		SceneEngine.enterScene(player, sceneEntity.getRebornMapid(), sceneEntity.getX(), sceneEntity.getY());
		
		return ErrorCodeType.CODE_SUCCESS.getCode();
	}*/

}
