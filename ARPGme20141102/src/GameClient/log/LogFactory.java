package GameClient.log;


import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * log4j初始化
 * @author 代金龙 
 * @date 2013-1-11
 */
public class LogFactory {

	    public static void init()  throws Exception
	    {
	  
	        Logger logger = Logger.getLogger(LogFactory.class);

	        //使用默认配置
	        BasicConfigurator.configure();
	        
	        //load配置文件
	        Properties props = new Properties();
	        props.load(new FileInputStream("/properties/log4j.properties"));
	        
	       // String driver =props.getProperty("log4j.rootLogger");
	        
	        //设置日志输出级别
	        logger.setLevel(Level.INFO);

	        // This request will be disabled since Level.DEBUG < Level.INFO.
	        logger.debug("This is debug.");

	        // These requests will be enabled.
	        logger.info("This is an info.");
	        logger.warn("This is a warning.");
	        logger.error("This is an error.");
	        logger.fatal("This is a fatal error.");
	        
	        return;
	    }
	

}
