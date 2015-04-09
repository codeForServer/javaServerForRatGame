package com.arpg.gline.gameserver.controller;

import java.util.List;

import netBase.util.GameClient;
import netWork.proxy.SceneProxy;

import com.arpg.gline.gameserver.message.SceneMessage;
import com.arpg.gline.gameserver.module.scene.SceneLogic;
import com.commons.network.modulecore.IController;
import com.commons.network.modulecore.MethodAnnotation;
import com.commons.network.modulecore.model.CommandModel;

/**
 * 场景控制器
 * @author 杜祥
 * @date 2012-10-10
 */
public class SceneController implements IController 
{

	@Override
	public List<CommandModel> getCommands() 
	{
		return SceneProxy.DATA_MODE();
	}
	
	/**
	 * 移动测试命令
	 * @param client
	 * @param x
	 * @param y
	 * @create 2012-10-23 杜祥
	 */
	/*@MethodAnnotation(key = SceneProxy.CG_MOVE_TEST)
	public void move(GameClient client, int x, int y)
	{
		List<Node> list = SceneLogic.newInstance().moveTest(client.getPlayer(), x, y);
		int state = 0;
		if(list == null) state = 13;
		SceneMessage.GC_MOVE_TEST(client.getPlayer(), state, list);
	}*/

	/**
	 * 通过传送点切换场景
	 * @param client			玩家连接
	 * @param pointId			传送点ID
	 * @create 2012-10-12 杜祥
	 */
	/*@MethodAnnotation(key = SceneProxy.CG_SCENE_POINT)
	public void teleportCutoverScene(GameClient client, int pointId)
	{
		SceneLogic.newInstance().teleportCutoverScene(client.getPlayer(), pointId);
	}*/
	
	/**
	 * 场景移动
	 * @param client			玩家连接
	 * @param x					目标X坐标
	 * @param y					目标Y坐标
	 */
	@MethodAnnotation(key = SceneProxy.CG_MOVE)
	public void sceneMove(GameClient client, int x, int y , int toX, int toY)
	{
	
		SceneMessage.GC_MOVE(client, client.getPlayer().getPId(),x,  y ,  toX,  toY);
		
	}
	
	
	
	/**
	 * 原地复活
	 * @param client	玩家连接
	 * @param autoBuy	自动购买道具表示   0 不自动购买/1 自动购买 
	 * @Date	2012-10-22	庄宏晓
	 */
	/*@MethodAnnotation(key = SceneProxy.CG_LOCAL_REVIVE)
	public void localRevive(GameClient client, int autoBuy){
		SceneLogic.newInstance().localRevive(client.getPlayer(), autoBuy);
	}*/
	
	/**
	 * 复活点复活
	 * @param client	玩家连接
	 * @Date 2012-10-22	庄宏晓
	 */
	/*@MethodAnnotation(key = SceneProxy.CG_RESET_REVIVE)
	public void resetRevive(GameClient client){
		int result = SceneLogic.newInstance().resetRevive(client.getPlayer());
		SceneMessage.GC_RESET_REVIVE(client.getPlayer(), result);
	}*/
	
	
	
	/**
	 * 移动路径
	 * @param client		玩家连接
	 * @param nodeList		路径集合
	 * @create 2012-10-26 杜祥
	 */
	/*@MethodAnnotation(key = SceneProxy.CG_MOVE_PATH)
	public void movePath(GameClient client, List<Node> nodeList)
	{
		SceneLogic.newInstance().movePath(client.getPlayer(), nodeList);
	}
	
	*//**
	 * 玩家的当前位置
	 * @param client		玩家连接
	 * @param x				当前X坐标
	 * @param y				当前Y坐标
	 * @param d				当前方向
	 * @create 2012-10-26 杜祥
	 *//*
	@MethodAnnotation(key = SceneProxy.CG_MOVE_INDEX)
	public void moveIndex(GameClient client, int x, int y, int d)
	{
		SceneLogic.newInstance().moveIndex(client.getPlayer(), x, y, d);
	}*/
	
	
}
