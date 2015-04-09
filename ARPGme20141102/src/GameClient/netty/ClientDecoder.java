package GameClient.netty;

import org.apache.log4j.Logger;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

/**
 * ����
 * @author ������
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
	 *ȡ��Decoder�ĵ��� 
	 */
	public static ClientDecoder getDecoder()
	{
        return singlton.clientDecoder;
    }
		
	/**
	 *����
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
        
        //ȥ����ͷ
        buffer.skipBytes(2); 
        
        /*ÿ��ֻ��������С�İ��� ����Ķ���channel*/
        ChannelBuffer newbuffer = buffer.readBytes(dataLength);


     /*   //У��
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

        log.info("�ͻ��˲��:IDΪ"+ctx.getChannel().getId()+"��ͨ��"+"��Ϣ����"+ buffer.getShort(0)+" ģ���"+buffer.getByte(2)+" �����"
        		+buffer.getShort(3)+" ��Ϣ����"+buffer.getInt(5));
        
       return newbuffer;
    }

}