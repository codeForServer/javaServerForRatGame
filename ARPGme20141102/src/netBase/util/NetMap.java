package netBase.util;


import java.util.concurrent.ConcurrentHashMap;

import netBase.AloneNetMap;
import netBase.ReceivablePacket;

/**
 * ��ҺͰ���е�ӳ�� 
 *<Integer,NetLink> --> key(���Id),value(�����)
 */
public class NetMap extends ConcurrentHashMap<GameClient,NetLink>
{

	private static final long serialVersionUID = 1L;

	
	/**
	 * 创建映射，玩家ID对应玩家消息队列
	 * @param playerId
	 */
	public void careteNewLinek(GameClient gameClient)
	{
		
		System.out.println("添加玩家ID对应玩家消息队列");
		if(null ==  AloneNetMap.netMap.get(gameClient))
		{
			this.put(gameClient, new NetLink());
		}
		else
		{
			this.remove(gameClient);
			this.put(gameClient, new NetLink());
		}
	}

	
	public void removeNewLinek(GameClient gameClient)
	{
		if(AloneNetMap.netMap.get(gameClient).size() <= 0)
		{
			AloneNetMap.netMap.remove(gameClient);
		}
	}
	
	/**
	 * 添加包到消息队列里
	 * @param playerId
	 * @param pack
	 */
	public void addPack(GameClient playerGameClient,ReceivablePacket pack)
	{
		if(null == AloneNetMap.netMap.get(playerGameClient))
		{
			AloneNetMap.netMap.put(playerGameClient, new NetLink());
		}
		
		AloneNetMap.netMap.get(playerGameClient).add(pack);		
	}
	
	
	
	/**
	 * 设置特定玩家的消息队列阻塞
	 */
	public void setBlockProcess(GameClient clinetId)
	{
		NetLink link = this.get(clinetId);
		
		if(null != link)
		{
			link.setProcess(false);
			
			System.out.println("设置成功");
		}				
	}	
	
}

