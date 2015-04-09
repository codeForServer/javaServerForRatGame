package com.arpg.gline;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import netBase.World;
import netBase.util.GameClient;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.config.SystemConfig;
import com.arpg.gline.gameserver.module.person.PlayerLogic;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;


public class GameClose {

	Logger logger = Logger.getLogger(GameClose.class);

	public void close(boolean flag) throws Exception {

		logger.info("close server....................");
		SystemConfig.loginDenote = SystemConfig.loginClose;

		Thread.sleep(30 * 1000L);
		playerDownLine(true);

		Thread.sleep(10 * 1000L);
		playerDownLine(false);

	}


	private void playerDownLine(boolean sessionClose) throws Exception {

		ConcurrentHashMap<Integer, GameClient> clientList = World.newInstance()
				.getChannelMap();
		
		while (clientList.size() > 0) {
			
			GameClient client;
			PlayerEntity player;
			int index = 0;

			for (Entry<Integer, GameClient> entry : clientList.entrySet()) {

				client = (GameClient) entry.getValue();
				player = client.getPlayer();
				if (player != null) {
					synchronized (player) {
						PlayerLogic.newInstance().downLine(player);
						index++;
					}
				}

			}
			logger.info("关闭游戏中....关闭玩家 index" + index);

			if (clientList.size() > 0)
				Thread.sleep(30 * 1000L);

		}

	}
}
