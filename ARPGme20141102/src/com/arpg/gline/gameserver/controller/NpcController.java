package com.arpg.gline.gameserver.controller;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.dao.NpcDaoService;
import com.arpg.gline.gameserver.module.npc.entity.NpcEntity;

/**
 * NPC控制器
 * @author DaiJinLong
 */
public class NpcController{	
	
	public static Logger log = Logger.getLogger(NpcController.class);

	public void trains(int id) throws Exception
	{		
		NpcEntity n  = new NpcDaoService().get(id);
		log.info("测试数据库："+"newid为"+n.newid);
		
		log.info("测试数据库："+"npcid为"+n.getNpc_id());
	}

}
