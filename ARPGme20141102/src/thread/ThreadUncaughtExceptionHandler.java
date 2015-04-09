package thread;

import java.lang.Thread.UncaughtExceptionHandler;

import org.apache.log4j.Logger;


/**
 * ��������ʱ����δ������߳��쳣����ֹʱ����ִ�е�Ĭ�ϴ������
 * @author ������ 
 * @date 2013-1-14
 */
public class ThreadUncaughtExceptionHandler implements UncaughtExceptionHandler 
{
	private static final Logger log = Logger.getLogger(ThreadUncaughtExceptionHandler.class);
	
	/*��д�����Ĭ�ϴ������*/	  
	public void uncaughtException(Thread t, Throwable e)
	 {
		  log.error("���ش��� - �߳�: " + t.getName() + " ��ֹ�쳣 " + e, e);
		  if ((e instanceof OutOfMemoryError))
		  {
		     log.error("�ڴ治��! �߳���ֹ!");
		   }
	 }
	

}
