package netBase.netty;
import netBase.ReceivablePacket;

import org.apache.log4j.Logger;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

/**
 * @author DJL
 * @date 2013-1-19
 */ 
public class ServerDecoder extends FrameDecoder {
	
	private static final Logger log = Logger.getLogger(ServerDecoder.class);
	
	@Override
    protected  Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer) throws Exception {		
  
        if (buffer.readableBytes() < 4) {  
        	
        	log.info("message short than four!!!");
            return null;  
        }  
        
       int dataLength = buffer.getInt(0);

        if (buffer.capacity() < dataLength+4) {  
            return null;   
        } 
        
        buffer.skipBytes(4); 
        
        ChannelBuffer newbuffer = buffer.readBytes(dataLength);
     
         short  module = buffer.getShort(4);             
         short opcode =  buffer.getShort(6);         
 
        ReceivablePacket pack  = new ReceivablePacket(module, opcode, newbuffer);
        log.info("receive message...id "+ctx.getChannel().getId()+"  length"+ dataLength+"  module"+module+"   opcode"
        		+opcode);
 
        return pack;  
    }
}