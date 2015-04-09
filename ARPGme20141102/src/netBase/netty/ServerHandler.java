package netBase.netty;


import netBase.AloneNetMap;
import netBase.ReceivablePacket;
import netBase.World;
import netBase.util.GameClient;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

/**
 * 
 * @author timosky
 * @date 2013-1-8
 */  
public class ServerHandler extends SimpleChannelHandler {
	
	/**
	 * 接收消息
	 */
	@Override 
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception  {
	    
		
		if(!(e.getMessage() instanceof ReceivablePacket))
		{
			return;
		}
		
		ReceivablePacket packet = (ReceivablePacket) e.getMessage();
		
		if(packet.getBuffer().capacity()< 3)
		{
			return ;
		}
		
		//添加映射
		packet.addClient(ctx.getChannel().getId());	
			
		System.out.println( ctx.getChannel().getId() + "的通道  messageReceived");
		
		GameClient client = World.newInstance().getChannel(ctx.getChannel().getId());
		
		/*将消息包放入玩家对应的消息队列*/
		AloneNetMap.netMap.addPack(client,packet);
	
    }  
	

	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e)
	{
		GameClient client = new GameClient(ctx.getChannel());
		
		//将这个链接添加到world里，方便以后查询
		World.newInstance().addChannel(client);
		
		//添加映射：玩家client--玩家所拥有的消息队列	
		AloneNetMap.netMap.careteNewLinek(client);
		
		
		System.out.println("创建一个连接："+ctx.getName());
		
	}
	
	/**
	 * 异常
	 */
    @Override 
 	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) 
    {	 
    	e.getCause().printStackTrace();  
    	Channel ch = e.getChannel();  
    	ch.close();  
    }  

    
	@Override
	public void channelDisconnected(ChannelHandlerContext ctx,ChannelStateEvent e) 
	{
		System.out.println("链接关闭，执行销毁操作");
		
		GameClient client = World.newInstance().getChannel(ctx.getChannel().getId());
		
		AloneNetMap.netMap.remove(client);
		
		World.newInstance().removeConnection(ctx.getChannel().getId());
	
	}

} 