package task;


import thread.ExecuteThreadEver;

/**
 * 玩家数据定时保存
 * @author 杜祥
 * @date 2012-10-26
 */
public class PlayerSaveTask extends ExecuteThreadEver
{
	

	@Override
	protected void runTurn()
	{
		//SubDataSaveDB.newInstance().saveDB();
	}

	@Override
	protected void sleepTurn() throws InterruptedException
	{
		Thread.sleep(60000);
	}
	
}
