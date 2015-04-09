package GameClient.netty;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

/**
 * 编码
 * @author 代金龙
 * @date 2013-1-9
 */ 
public class ClientEncoder extends OneToOneEncoder {  


	private ClientEncoder(){}
	private static final class singleton{
		private static final ClientEncoder clientEncoder = new ClientEncoder();
	}
	/**
	 *取得encoder的单例 
	 */
	public static ClientEncoder getEncoder()
	{
		return  singleton.clientEncoder;
	}
	

	/**
	 * 编码
	 * OneToOneEncoder调用Channels.write（）,将数据推送回client
	 */
	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel ch, Object msg) throws Exception
	{
		
		ChannelBuffer chnBuf = (ChannelBuffer)msg;
		
		return chnBuf;
	}          
	
} 

