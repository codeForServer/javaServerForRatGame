package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

/**
 * 游戏逻辑层所使用的线程池（通信层使用另外线程池）
 * @author 代金龙 
 * @date 2013-1-11
 */
public class ThreadPoolManager {

	private static final Logger log = Logger.getLogger(ThreadPoolManager.class);
	
	private  ThreadPoolManager(){}
	private final static ThreadPoolManager singtol = new ThreadPoolManager();
	public static ThreadPoolManager getInstance()
	{
		return singtol;
	}
	
	
	/**
	 *1.指定最少拥有数量、可执行延迟任务的线程池
	 */
	private final static  ExecutorService schedulepool = Executors.newScheduledThreadPool(6);
	
	/**
	 *2.线程池，具有缓存功能
	 */
	private final static  ExecutorService cachePool = Executors.newCachedThreadPool();
	
	/**
	 *3.指定数量的线程池
	 */
	private final static  ExecutorService fixPool = Executors.newFixedThreadPool(6);
	
	/**
	 *4.单任务线程池
	 */
	private final static  ExecutorService singlePool = Executors.newSingleThreadExecutor();
	
	/**
	 *关闭线程池
	 */
	public void shutdown()
	{
		cachePool.shutdown();
		schedulepool.shutdown();
		fixPool.shutdown();
		singlePool.shutdown();
		log.info("线程池关闭");
	}
	
	
	public ExecutorService getCachepool() {
		return cachePool;
	}

	public  ExecutorService getFixpool() {
		return fixPool;
	}

	public  ExecutorService getSinglepool() {
		return singlePool;
	}
	
	public  ExecutorService getSchedulepool() {
		return schedulepool;
	}


}
