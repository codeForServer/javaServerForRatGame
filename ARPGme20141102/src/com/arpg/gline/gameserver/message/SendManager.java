package com.arpg.gline.gameserver.message;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import netBase.Manager.MessageManager;
import netBase.util.GameClient;

import org.apache.log4j.Logger;
import org.jboss.netty.buffer.ChannelBuffer;

import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * ��Ϣ���ͷ�װ��
 * @author �����
 * @date 2013.3.8
 */
public class SendManager extends MessageManager{
	
	private static final Logger log = Logger.getLogger(SendManager.class);
	
	/*����ĵ��˷���*/
	public static void sendResult(PlayerEntity player,ChannelBuffer buffer, int moduleId, int opcode, int result, Object... objects)
	{
		buffer = encodeResult(buffer, moduleId, opcode, result, objects);
		//send(player.getClient(), buffer);
	}
	
	
	/*������ĵ��˷���*/
	public static void send(GameClient client,ChannelBuffer buffer, int moduleId, int opcode, Object... objects)
	{
		buffer = encode(buffer, moduleId, opcode, objects);
		send(client, buffer);
	}	
	
	/* 发送多人消息*/
	protected static void sends(ConcurrentHashMap<Integer,GameClient> list, ChannelBuffer buffer, int moduleId, 
			int opcode, Object... objects)
	{	
		log.info("list长度"+list.size());
		buffer = encode(buffer, moduleId, opcode, objects);
		
		for(Map.Entry<Integer, GameClient> e: list.entrySet())
		{
			//send(e.getValue(), buffer);
			
		}
		
		//for(PlayerEntity player : ConcurrentHashMap)
		//{
		//	send(player.getClient(), buffer);
		//}
	}
	
	/*����Ķ��˷���*/
	protected static void sendsResult(Collection<PlayerEntity> list, ChannelBuffer buffer, int moduleId, int opcode, int result, Object... objects)
	{	
		
		buffer = encode(buffer, moduleId, opcode, result,objects);
		
		for(PlayerEntity player : list)
		{
			//send(player.getClient(), buffer);
		}
	}

}
