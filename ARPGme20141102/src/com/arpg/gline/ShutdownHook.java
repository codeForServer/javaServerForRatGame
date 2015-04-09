package com.arpg.gline;

import org.apache.log4j.Logger;

/**
 * @author djl
 * @date 2012-12-21
 */
public class ShutdownHook extends Thread
{
	private Logger log = Logger.getLogger(ShutdownHook.class);
	
	@Override
	public void run() 
	{
		log.info("close socket");
		  //close socket
        //close mysql
	}
	
}
