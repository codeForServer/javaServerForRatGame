package task;

import thread.ExecuteThreadEver;
import thread.ThreadPoolManager;

/**
 * 循环线程任务模板
 * @author 	代金龙
 * @date	2012-12-11
 */
public class EverTask extends ExecuteThreadEver{
	
	/*设置线程运行任务*/
	@Override
	public void runTurn()
	{
		
	}
	
	/*设置线程运行间隔时间*/
	@Override
	public void sleepTurn() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	/*重载final*/
	@Override
	public void onFinally()
	{
		
	}
	
	/*选择一种线程池加入*/
	public void init()
	{
		ThreadPoolManager.getInstance().getCachepool().submit(new Thread(this));
	}
}
