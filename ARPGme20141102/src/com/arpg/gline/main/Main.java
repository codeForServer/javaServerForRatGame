package com.arpg.gline.main;


import netBase.netty.NettyServer;
import netBase.thread.NetWorkerThread;

import org.apache.log4j.Logger;

import thread.ThreadUncaughtExceptionHandler;
import xmlEntity.manager.DataManager;

import com.arpg.gline.GameServerInit;
import com.arpg.gline.NetWorkInit;
import com.arpg.gline.ShutdownHook;
import com.arpg.gline.gameserver.controller.NpcController;

/**
 * @author djl
 * @date 2012-12-19
 */
public class Main {

	public static Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) throws Exception 
	{      
		try 
		{       			
			log.info("--------->>>>>>>>>Game Start!"); 
			NettyServer.start(8080);	

			Thread.setDefaultUncaughtExceptionHandler(new ThreadUncaughtExceptionHandler());
			
			log.info("--------->>>>>>>>>Init GameServer");
		    GameServerInit.getInstance().init();	

		    log.info("--------->>>>>>>>>Init NetWork");
			NetWorkInit.getInstance().init();	
			
			//new NpcController().trains(1);
			
			log.info("test XML data"+"LV_DATAΪ"+DataManager.LV_DATA.get(1).getLvExp());
		
			System.setProperty("user.timezone", "GMT +08"); 

			log.info("--------->>>>>>>>>set timezone");
			//new MonitorThread().init();
			
			log.info("now cpu number is"+Runtime.getRuntime().availableProcessors());
		
			Runtime.getRuntime().addShutdownHook(new ShutdownHook());  
			
			new NetWorkerThread().run();
			    
		} 
		catch (Exception e) 
		{           
			log.info("exception happens",e);         
			System.exit(-1);       
		}  
	}

}

