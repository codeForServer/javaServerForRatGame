package task;

import org.apache.log4j.Logger;

import thread.ExecuteThreadEver;
import thread.ThreadPoolManager;

/**
  后端检测线程
 */
public class MonitorThread  extends  ExecuteThreadEver {
	
	public static Logger log = Logger.getLogger(MonitorThread.class);

	
	/*�����߳���������*/
	@Override
	public void runTurn()
	{
		log.info("当前线程池活跃数量"+Thread.currentThread().getThreadGroup().activeCount());
		log.info("当前线程池活跃总数量"+Thread.currentThread().getThreadGroup().activeGroupCount());

	}
	
	/*�����߳����м��ʱ��*/
	@Override
	public void sleepTurn() throws InterruptedException
	{
		Thread.sleep(1000*20);
	}
	
	/*����final*/
	@Override
	public void onFinally()
	{
		
	}
	
	/*ѡ��һ���̳߳ؼ���*/
	public void init()
	{
		ThreadPoolManager.getInstance().getCachepool().submit(new Thread(this));
	}
}
