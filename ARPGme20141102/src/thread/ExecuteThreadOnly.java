package thread;

import org.apache.log4j.Logger;

/**
 * 一次性线程执行抽象类
 * @author 代金龙 
 * @date 2013-1-14
 */
public abstract class ExecuteThreadOnly implements Runnable
{
	private static final Logger log = Logger.getLogger(ExecuteThreadOnly.class);
	
	/*final,不允许被继承*/
	public final void run()
	{
		try
		{
			setRun();
		}
		catch(Exception e)
		{
			log.warn("线程执行时异常",e);
		}
	}
	
	public abstract void setRun();

}                            
