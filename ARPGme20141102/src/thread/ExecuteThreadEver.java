package thread;

/**
 * 循环线程执行抽象类
 * @author 代金龙 
 * @date 2013-1-14
 */
public abstract class ExecuteThreadEver implements Runnable
{
	//volatile 无锁同步，直接访问主内存
	protected   volatile boolean _isAlive = true;

	/*final,不允许被继承*/
	public final void run()
	{
		try
		{
			while (this._isAlive)
			{
				/*让其他类继承，作为实际意义的run方法*/
				runTurn();
				try
				{
				 /*让其他类继承，执行runTurn的定时器*/
					sleepTurn();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
		finally
		{
			/*让其他类继承，写finally语句块*/
			onFinally();
		}
	}

	protected abstract void runTurn();

	protected abstract void sleepTurn()throws InterruptedException;

	protected void onFinally()
	{
	}
}