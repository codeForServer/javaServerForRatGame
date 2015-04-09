package netBase;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

import netBase.util.GameClient;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.module.person.PlayerLogic;

//保存整个游戏服所有链接
public class World<T extends GameClient>
{
	//单例
	private World(){}
	private static final class singleton{
		private static final World<GameClient> world = new World<GameClient>();
	}
	public static World<GameClient> newInstance()
	{
		return  singleton.world;
	}
	
	private static final Logger log = Logger.getLogger(PlayerLogic.class);

	/*ConcurrentHashMap*/
	protected static ConcurrentHashMap<Integer, GameClient> channelMap = new ConcurrentHashMap<Integer, GameClient>();//�û�����
	
	
	/**
	 * 
	 * 
	 */
	public ConcurrentHashMap<Integer, GameClient> getChannelMap()
	{
		return channelMap;
	}
	
	/**
	 * 注册连接
	 * @param connection
	 */
	public void addChannel(GameClient connection)
	{
		
		GameClient older = channelMap.get(connection.getChannel().getId());
		
		/**判断连接是否注册**/
		if(older != null)
		{
			StringBuilder builder = new StringBuilder("连接[").append(connection.getChannel().getId())
					.append("]已经注册。");
			log.warn(builder.toString());
			return ;
		}
		
		/**将连接加入到玩家连接队列中**/
		channelMap.put(connection.getChannel().getId(), connection);
		StringBuilder builder = new StringBuilder("有新连接建立，连接ID[").append(connection.getChannel().getId());
		builder.append("]连接地址[");
		//.append(connection.getIp()).append("]");
		log.info(builder.toString());
	}
	
	
	
	/**
	 * 注销连接
	 * @param channelId		连接ID
	 */
	public void removeConnection(int channelId)
	{
		GameClient connection = channelMap.get(channelId);
		/**判断是否存在该连接**/
		if(connection == null)
		{
			StringBuilder builder = new StringBuilder("连接[").append(channelId).append("]没有注册，所以无法注销。");
			log.warn(builder.toString());
			return ;
		}
		/**关闭任务管理和**/
		channelMap.remove(channelId);
		StringBuilder builder = new StringBuilder("连接[").append(channelId).append("]关闭连接。");
		log.info(builder.toString());
	}

	
	/**
	 * 获得世界中所有连接
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T extends GameClient>Collection<T> getValues()
	{
		return (Collection<T>) channelMap.values();
	}
	
	public GameClient getChannel(int id)
	{
		return channelMap.get(id);
	}

}
