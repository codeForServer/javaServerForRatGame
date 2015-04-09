package com.arpg.gline.gameserver.controller;

import netBase.util.GameClient;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.controller.contrlBase.ControllerAnnotation;

public class ConquestController {
	
	private static final Logger log = Logger.getLogger(ConquestController.class);
	
	/**
	 *  ����ƥ����Ϣ
	 */
	@ControllerAnnotation(key = 6002)
	public static void TankerLoad(GameClient client, String name, int type)throws Exception
	{				
		//ConquestMessage.GC_CONQUEST_INFO(client, 1, 2, 3);
		log.info("ƥ��ɹ�");
	}  
}
