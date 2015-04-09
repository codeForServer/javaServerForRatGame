package com.arpg.gline;

import java.io.IOException;

import netBase.World;

import org.apache.log4j.Logger;

import thread.ThreadPoolManager;
import xmlEntity.database.DataHolderProcessor;
import xmlEntity.manager.DataManager;


/**
 * ��Ϸ��ʼ��
 * @author �����
 * @date 2012-12-18
 */
public class GameServerInit  {

	public static Logger log = Logger.getLogger(GameServerInit.class);
	
	private final static GameServerInit gameInit = new GameServerInit();
	private GameServerInit(){}
	public  static GameServerInit getInstance(){
		return  gameInit;
	}
	
	/**
	 * ��ʼ�������߼�������
	 * @throws Exception 
	 * @throws IOException 
	 */
	public void init() throws Exception
	{ 
	
		initThread();
		  
		log.info("load XML");
		DataHolderProcessor.process(DataManager.class);
		
	}
	
	/**
	 * ��ʼ���߼�����߳�
	 */
	public void initThread()
	{
		/*��ʼ���߼����̳߳ع���*/
		//ThreadPoolManager.getInstance();
		
		/*���������̳߳��к����߳�*/
		//pool.prestartAllCoreThreads();
		
		log.info("���̳߳�Ͷ�������Ҫ��ʼ�����е��߳�");
		//����AI��Ѳ���߳�
	//	ThreadPoolManager.getInstance().getCachepool().execute(new AiThread());
		
	}
	
	
	/**
	 * �ر���Ϸ����
	 */
	public void shutDown()
	{		

		/*�̳߳عر�*/
		ThreadPoolManager.getInstance().shutdown();
	}
	
	

}


