package netBase.netty;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandler.Sharable;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

/**
 * @author timosky
 * @date 2013-1-9
 */ 
@Sharable
public class ServerEncoder extends OneToOneEncoder {  


	private ServerEncoder(){}
	private static final class singleton{
		private static final ServerEncoder serverEncoder = new ServerEncoder();
	}
	
	public static ServerEncoder getEncoder()
	{
		return  singleton.serverEncoder;
	}
	
	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel ch, Object msg) throws Exception
	{
		
		if(!(msg instanceof ChannelBuffer)){
			return msg;
		}
		
		ChannelBuffer chnBuf= (ChannelBuffer)msg;	

		int datalength = chnBuf.readableBytes();
		System.out.printf("编码 datalength========================"+datalength);
		

		ChannelBuffer buf = ChannelBuffers.dynamicBuffer();

		buf.writeInt(datalength+4);

		buf.writeBytes(chnBuf);
		
		return buf;
	}            
	
} 
