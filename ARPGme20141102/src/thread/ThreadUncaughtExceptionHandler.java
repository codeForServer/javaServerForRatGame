package thread;

import java.lang.Thread.UncaughtExceptionHandler;

import org.apache.log4j.Logger;


/**
 * 程序运行时由于未捕获的线程异常而终止时，所执行的默认处理程序
 * @author 代金龙 
 * @date 2013-1-14
 */
public class ThreadUncaughtExceptionHandler implements UncaughtExceptionHandler 
{
	private static final Logger log = Logger.getLogger(ThreadUncaughtExceptionHandler.class);
	
	/*重写父类的默认处理程序*/	  
	public void uncaughtException(Thread t, Throwable e)
	 {
		  log.error("严重错误 - 线程: " + t.getName() + " 终止异常 " + e, e);
		  if ((e instanceof OutOfMemoryError))
		  {
		     log.error("内存不足! 线程终止!");
		   }
	 }
	

}
