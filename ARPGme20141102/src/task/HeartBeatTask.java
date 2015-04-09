package task;

import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.message.PlayerMessage;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;
import com.commons.thread.concurrent.ExecuteWrapper;

/**
 * 心跳连接
 * @author 杜祥
 * @date 2012-10-23
 */
public class HeartBeatTask extends ExecuteWrapper
{
	private Logger log = Logger.getLogger(HeartBeatTask.class);
	
	void systemInfo()
	{
		Runtime run = Runtime.getRuntime();
		
		StringBuilder builder = new StringBuilder("系统开销---虚拟机中的内存总量[");
		builder.append(run.totalMemory() / 1024).append("KB]虚拟机中的空闲内存量[").append(run.freeMemory() / 1024)
		.append("KB]可用处理器的数目[").append(run.availableProcessors()).append("]");
		
		log.info(builder.toString());
	}

	@Override
	protected void runImpl() {
/*		Set<Entry<Long, PlayerEntity>> set = SubDataManager.PlayerData.getEntry();
		
		long time = System.currentTimeMillis();
		
		心跳连接检测
		for(Entry<Long, PlayerEntity> e : set)
		{
			if(e.getValue() == null) continue;
			PlayerMessage.GC_HEART_BEAT(e.getValue(), time);
		}*/
		
		/*系统开销输出*/
		systemInfo();
		
	}


}
