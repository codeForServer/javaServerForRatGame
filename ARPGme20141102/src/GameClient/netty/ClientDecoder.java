package GameClient.netty;

import org.apache.log4j.Logger;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

/**
 * 解码
 * @author 代金龙
 * @date 2013-1-19
 */ 
public class ClientDecoder extends FrameDecoder {

	private static final Logger log = Logger.getLogger(ClientDecoder.class);
	
	private ClientDecoder(){}
	private static final class singlton
	{		
        private static final ClientDecoder clientDecoder=new ClientDecoder();
    }
	/**
	 *取得Decoder的单例 
	 */
	public static ClientDecoder getDecoder()
	{
        return singlton.clientDecoder;
    }
		
	/**
	 *解码
	 */
	@Override
    protected  Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer) throws Exception {
			
		
        if (buffer.readableBytes() < 2) {  
            return null;  
        }  
        
        int dataLength = buffer.getShort(buffer.readerIndex());  
        
        if (buffer.readableBytes() < dataLength + 2) {  
            return null;   
        } 
        
        //去掉包头
        buffer.skipBytes(2); 
        
        /*每次只读这样大小的包， 多余的丢回channel*/
        ChannelBuffer newbuffer = buffer.readBytes(dataLength);


     /*   //校验
        if ('>' == byteMessageData[dataLength-1] && '|' == byteMessageData[dataLength-2]) 
        {
        	log.error("len:" + dataLength + ":" + new String(byteMessageData));
        } 
        else 
        {
        	buffer.resetReaderIndex();
        	log.error("errro end");
        	return null;
        }*/

        log.info("客户端拆包:ID为"+ctx.getChannel().getId()+"的通话"+"消息长度"+ buffer.getShort(0)+" 模块号"+buffer.getByte(2)+" 命令号"
        		+buffer.getShort(3)+" 消息参数"+buffer.getInt(5));
        
       return newbuffer;
    }

}