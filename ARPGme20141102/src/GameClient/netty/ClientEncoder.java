package GameClient.netty;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder;

/**
 * ����
 * @author ������
 * @date 2013-1-9
 */ 
public class ClientEncoder extends OneToOneEncoder {  


	private ClientEncoder(){}
	private static final class singleton{
		private static final ClientEncoder clientEncoder = new ClientEncoder();
	}
	/**
	 *ȡ��encoder�ĵ��� 
	 */
	public static ClientEncoder getEncoder()
	{
		return  singleton.clientEncoder;
	}
	

	/**
	 * ����
	 * OneToOneEncoder����Channels.write����,���������ͻ�client
	 */
	@Override
	protected Object encode(ChannelHandlerContext ctx, Channel ch, Object msg) throws Exception
	{
		
		ChannelBuffer chnBuf = (ChannelBuffer)msg;
		
		return chnBuf;
	}          
	
} 

