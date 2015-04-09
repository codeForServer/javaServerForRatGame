package netBase.util;


import java.util.concurrent.ConcurrentLinkedQueue;

import netBase.ReceivablePacket;


/**
 * 每个玩家都会开启一个线程，每个线程拥有一个NetLink类
 * @author 
 *
 */
public class NetLink extends ConcurrentLinkedQueue<ReceivablePacket>
{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 用于控制该线程是否取消息
	 */
	private boolean process = false;

	public boolean isProcess()
	{
		return process;
	}

	public void setProcess(boolean process)
	{
		this.process = process;
	}
	
	/**
	 * 获取一个消息包
	 * @return
	 */
	public ReceivablePacket getNetPack()
	{
		if(this.process == false)
		{
			if(this.size() > 0)
			{
				setProcess(true); 
				
				return this.poll();			
			}		
		}		
		return null;		
	}
	
}
