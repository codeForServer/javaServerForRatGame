package GameClient.netty;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;

/**
 * 客户端管道
 * @author 代金龙
 * @date 2013-1-9
 */ 
public class ClientPipelineFactory implements ChannelPipelineFactory {  

	 

    public ChannelPipeline getPipeline() {  

        ChannelPipeline pipeline = Channels.pipeline();  

        pipeline.addLast("decoder", ClientDecoder.getDecoder());
		pipeline.addLast("encoder", ClientEncoder.getEncoder());
        pipeline.addLast("handler", new ClientHandler());  

        return pipeline;  

    }  

}
