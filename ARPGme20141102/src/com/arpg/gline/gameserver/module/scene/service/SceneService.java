package com.arpg.gline.gameserver.module.scene.service;

import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * 场景服务
 * @author 杜祥
 * @date 2012-10-25
 */
public class SceneService 
{
	/**
	 * 场景下线
	 * @param player	玩家实体
	 * @return	玩家实体
	 * @create	2012-11-12	庄宏晓
	 */
	public static void sceneOut(PlayerEntity player)
	{
/*		SceneEntity sceneEntity = player.gainSceneEntity();
		
		 * 不在场景则不操作
		 
		if(sceneEntity == null)
		{
			return;
		}
		
		死亡自动复活
		if(!player.getState().isLive())
		{
			player.getState().setLive(true);
			player.setHp(player.gainHpMax());
			player.setMp(player.gainMpMax());
			player.setMapId(sceneEntity.getRebornMapid());
			player.setX(sceneEntity.getX());
			player.setY(sceneEntity.getY());
		}
		
		场景移除玩家
		SceneEngine.exitScene(player);*/
		
	}
}
