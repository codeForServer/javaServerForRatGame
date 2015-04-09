package netBase.thread;

import netBase.AloneNetMap;
import netBase.ReceivablePacket;
import netBase.util.GameClient;

import com.arpg.gline.gameserver.controller.contrlBase.ControlRealize;


/**
 *  工作线程
 */
public class BusinessRunable  implements Runnable {
	
	private ReceivablePacket pack = null; ///接收到的消息包	
	
	private long sleepTime = 1L;
	
	/**
	 * @param pack
	 */
	public BusinessRunable(ReceivablePacket packet)
	{
		this.pack = packet;
	}

	public void run() 
	{
		
		
		try
		{			
			GameClient client = pack.getClient();	
			/*core*/	
			ControlRealize.ControllerWait(client,pack);
			
			Thread.sleep(this.sleepTime);
			
			
			//下面是另一个项目的写法，  1.测试命令执行时间， 2.释放引用是否有必要
/*			long before = System.currentTimeMillis();
			
			switchBus.actionPerform(pack.getPlayerId(), pack.getBusType(), pack.getData());
			
			long after = System.currentTimeMillis();
			
			this.pack = null; ///释放引用
*/			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			///释放队列区域
			System.out.println("操作完毕，重新设为非阻塞");
			
			AloneNetMap.netMap.setBlockProcess(pack.getClient());
		}
	
		
	}

}
