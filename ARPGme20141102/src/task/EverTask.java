package task;

import thread.ExecuteThreadEver;
import thread.ThreadPoolManager;

/**
 * ѭ���߳�����ģ��
 * @author 	������
 * @date	2012-12-11
 */
public class EverTask extends ExecuteThreadEver{
	
	/*�����߳���������*/
	@Override
	public void runTurn()
	{
		
	}
	
	/*�����߳����м��ʱ��*/
	@Override
	public void sleepTurn() throws InterruptedException
	{
		Thread.sleep(2000);
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
