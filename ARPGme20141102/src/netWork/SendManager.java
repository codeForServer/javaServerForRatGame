package netWork;

import java.util.Collection;
import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.modulecore.MessageManager;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * 发送消息管理
 * @author 
 * @date 2012-09-19
 */
public abstract class SendManager extends MessageManager
{
	/**
	 * 发送多人消息
	 * @param list				玩家集合
	 * @param buffer			流
	 * @param moduleId			模块ID
	 * @param opcode			命令号
	 * @param objects			参数
	 */
	protected static void sends(List<PlayerEntity> list, ChannelBuffer buffer, int moduleId, int opcode, Object... objects)
	{
/*		ChannelBuffer _buffer = decode(buffer, moduleId, opcode, objects);
		
		for(PlayerEntity player : list)
		{
			send(player.gainClient(), _buffer);
		}*/
	}
	
	/**
	 * 发送多人消息
	 * @param list				玩家集合
	 * @param buffer			流
	 * @param moduleId			模块ID
	 * @param opcode			命令号
	 * @param objects			参数
	 * @create 2012-11-28
	 */
	protected static void sends(Collection<PlayerEntity> list, ChannelBuffer buffer, int moduleId, int opcode, Object... objects)
	{
/*		ChannelBuffer _buffer = decode(buffer, moduleId, opcode, objects);
		
		for(PlayerEntity player : list)
		{
			send(player.gainClient(), _buffer);
		}*/
	}
	
	/**
	 * 发送单人消息（有状态的）
	 * @param player			玩家
	 * @param buffer			流
	 * @param moduleId			模块ID
	 * @param opcode			命令号
	 * @param result			结果
	 * @param objects			参数
	 */
	protected static void sendsState(PlayerEntity player, ChannelBuffer buffer, int moduleId, int opcode, int result,Object... objects)
	{
/*		ChannelBuffer _buffer = decodeResult(buffer, moduleId, opcode, result, objects);
		send(player.gainClient(), _buffer);*/
	}
	
	
	/**
	 * 发送单人消息（无结果的）
	 * @param player			玩家
	 * @param buffer			流
	 * @param moduleId			模块ID
	 * @param opcode			命令号
	 * @param objects			参数
	 */
	protected static void sends(PlayerEntity player, ChannelBuffer buffer, int moduleId, int opcode, Object... objects)
	{
/*		ChannelBuffer _buffer = decode(buffer, moduleId, opcode, objects);
		
		send(player.gainClient(), _buffer);*/
	}
	
}
