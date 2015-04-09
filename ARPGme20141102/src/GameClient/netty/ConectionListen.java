package GameClient.netty;

import java.net.InetSocketAddress;

import netBase.World;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.ChannelFuture;

/**
 * ��������
 * @author 
 *
 */
public class ConectionListen implements Runnable
{

	public void run() 
	{
		
	}

	public void action()
	{
		ChannelBuffer buff = ChannelBuffers.buffer(4);
		
		buff.writeShort(1);
		
		buff.writeShort(2);
		
		//ChannelFuture cf = World.newInstance().getChannel().write(buff);
		
		//boolean bool = cf.awaitUninterruptibly().isSuccess();
		
		//if(bool)return;
		
		//World.newInstance().getChannel().connect(new InetSocketAddress("127.0.0.1", 8081));
	}
}
