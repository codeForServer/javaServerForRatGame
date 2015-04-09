package thread;

/**
 * ѭ���߳�ִ�г�����
 * @author ������ 
 * @date 2013-1-14
 */
public abstract class ExecuteThreadEver implements Runnable
{
	//volatile ����ͬ����ֱ�ӷ������ڴ�
	protected   volatile boolean _isAlive = true;

	/*final,�������̳�*/
	public final void run()
	{
		try
		{
			while (this._isAlive)
			{
				/*��������̳У���Ϊʵ�������run����*/
				runTurn();
				try
				{
				 /*��������̳У�ִ��runTurn�Ķ�ʱ��*/
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
			/*��������̳У�дfinally����*/
			onFinally();
		}
	}

	protected abstract void runTurn();

	protected abstract void sleepTurn()throws InterruptedException;

	protected void onFinally()
	{
	}
}