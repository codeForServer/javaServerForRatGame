package GameClient.main;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import org.apache.log4j.Logger;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;
import GameClient.netty.ClientPipelineFactory;

/**
 * 启动Nttey客户端
 * @author 代金龙
 * @date 2013-1-19
 */ 
public class NettyClient {  

	private static final Logger log = Logger.getLogger(NettyClient.class);
    public static List<Channel> channelList = new ArrayList<Channel>();
	
    public void start(String host,int port) throws Exception {   

        ChannelFactory factory =new NioClientSocketChannelFactory (Executors.newCachedThreadPool(), Executors.newCachedThreadPool());  

        ClientBootstrap bootstrap = new ClientBootstrap (factory);   

        bootstrap.setPipelineFactory(new ClientPipelineFactory()); 
        /*这里不存在使用“child.”前缀的配置项，客户端的SocketChannel实例不存在父级Channel对象*/
        bootstrap.setOption("tcpNoDelay" , true);  
        bootstrap.setOption("keepAlive", true);  
        
        
        int clientCount = 2;
                
         for (int i=0; i<clientCount; i++) {
        	 	  ChannelFuture cf =  bootstrap.connect (new InetSocketAddress(host, port)); 
        	       channelList.add(cf.getChannel());
               }
        
        

        log.info("-----------------客户端启动成功 ");
        
        
        for(int i=0; i<100; i++)
        {
        	clientTest(channelList.get(0) );
            clientTest2(channelList.get(1) );
//        	channelList.get(0).write("client1 "+i);
//        	channelList.get(1).write("client2 "+i);
        }
        
        
        
        //发包测试
 //       Channel x =e.getChannel();
//      while(true)
//       {
//    	  try {  
//               Thread.sleep(1000*5);  
//               clientTest(x);
//               
//           } catch (Exception ex) {  
//               ex.printStackTrace();  
//           } ;
//       }
      
        
    }  
    

    
    //客户端发包测试 
    public static void clientTest(Channel x ) throws Exception
    {     	
    	
        ChannelBuffer buf  = ChannelBuffers.buffer(9);

        buf.writeShort(7);
        buf.writeByte(1);
        buf.writeShort(1001);
        buf.writeInt(123456); 
        
        
        x.write(buf); 
        log.info("客户端11111111111发送: 消息长度"+ buf.getShort(0)+" 模块号"+buf.getByte(2)+" 命令号"
        		+buf.getShort(3)+" 消息参数"+buf.getInt(5));
        
       // buf.clear();
        
    }  
    
  //客户端发包测试 
    public static void clientTest2(Channel x ) throws Exception
    {     	
    	
        ChannelBuffer buf  = ChannelBuffers.buffer(9);

        buf.writeShort(7);
        buf.writeByte(1);
        buf.writeShort(1001);
        buf.writeInt(123456); 
        
        
        x.write(buf); 
        log.info("客户端222222222发送: 消息长度"+ buf.getShort(0)+" 模块号"+buf.getByte(2)+" 命令号"
        		+buf.getShort(3)+" 消息参数"+buf.getInt(5));
        
       // buf.clear();
        
    }  
} 