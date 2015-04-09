package GameClient.main;

import org.apache.log4j.Logger;

/**
 * Æô¶¯Ö÷º¯Êý
 */
public class Main {

	private static final Logger log = Logger.getLogger(Main.class);
	
    public static void main(String arg[]) throws Exception {  
    	
        			try {
        		        String host = "127.0.0.1";  
        		        int port = 8080; 
        		        NettyClient client = new NettyClient(); 
        			    client.start(host, port);
        			}
        			catch(Exception e)
        			{
        				e.printStackTrace();
        			}
        		
        
    }
  
    
}
