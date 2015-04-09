package netBase.netty;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.handler.timeout.IdleStateAwareChannelUpstreamHandler;


public class  ServerPipelineFactory extends IdleStateAwareChannelUpstreamHandler implements ChannelPipelineFactory {  

	
    public ChannelPipeline getPipeline() throws Exception{  

        ChannelPipeline pipeline = Channels.pipeline();  

        pipeline.addLast("encoder", ServerEncoder.getEncoder());
        pipeline.addLast("decoder", new ServerDecoder());
        pipeline.addLast("handler", new ServerHandler());        

        return pipeline;  

    } 
   
}