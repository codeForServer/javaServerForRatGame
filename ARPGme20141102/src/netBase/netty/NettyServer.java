package netBase.netty;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;


import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

/**
 * 
 * @author timosky
 * @date 2013-1-8
 */ 
public class NettyServer {  
	
	 private static NettyServer instance = new NettyServer();
	 public static NettyServer getInstance() {
	  return instance;
	 }
	 private NettyServer() {}	


    public static void start(int port) throws Exception {  
 	
        ChannelFactory factory =  new NioServerSocketChannelFactory(Executors.newCachedThreadPool(), 
        		Executors.newCachedThreadPool());  
        
        ServerBootstrap bootstrap = new ServerBootstrap (factory);  
        
        bootstrap.setPipelineFactory(new ServerPipelineFactory()); 

        bootstrap.setOption("child.tcpNoDelay", true);  
        bootstrap.setOption("child.keepAlive", true); 

        bootstrap.bind(new InetSocketAddress(port));
       
    } 
    
} 
