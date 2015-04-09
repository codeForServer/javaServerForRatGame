package task;

import java.util.List;

import org.apache.log4j.Logger;

import com.commons.thread.ThreadPoolManager;
import com.commons.thread.concurrent.ExecuteWrapper;

/**
 * 线程池状态输出
 * @author 杜祥
 * @date 2012-11-15
 */
public class PoolStateTask extends ExecuteWrapper
{
	private Logger log = Logger.getLogger(PoolStateTask.class);

	@Override
	protected void runImpl()
	{
		List<String> list = ThreadPoolManager.getInstance().getStats();
		
		for(String str : list)
		{
			log.info(str);
		}
	}

}
