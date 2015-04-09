package GameClient.netty;

import org.apache.log4j.Logger;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

/**
 * 客户端接收消息后的处理器
 * @author 代金龙
 * @date 2013-1-8
 */
public class ClientHandler extends SimpleChannelHandler {   
	 
	private static final Logger log = Logger.getLogger(ClientHandler.class);
	
    @Override  
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) {   

    	log.info("接收到服务器消息");

    }   

  

    @Override  
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {   

        e.getCause().printStackTrace();   

        e.getChannel().close();   

    } 
}
