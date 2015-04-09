package thread;

import org.apache.log4j.Logger;

/**
 * һ�����߳�ִ�г�����
 * @author ������ 
 * @date 2013-1-14
 */
public abstract class ExecuteThreadOnly implements Runnable
{
	private static final Logger log = Logger.getLogger(ExecuteThreadOnly.class);
	
	/*final,�������̳�*/
	public final void run()
	{
		try
		{
			setRun();
		}
		catch(Exception e)
		{
			log.warn("�߳�ִ��ʱ�쳣",e);
		}
	}
	
	public abstract void setRun();

}                            
