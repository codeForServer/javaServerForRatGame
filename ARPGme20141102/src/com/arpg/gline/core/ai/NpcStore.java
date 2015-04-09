package com.arpg.gline.core.ai;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.gameserver.module.npc.entity.NpcBaseEntity;
import com.arpg.gline.gameserver.scence.ScenceEntity;

/**
 * NPCԭ����Ϣ
 *
 */
public class NpcStore 
{
	
	/**
	 * ��������
	 */
	public static ConcurrentHashMap<Integer, ScenceEntity> sceneMap = new ConcurrentHashMap<Integer, ScenceEntity>();
	
	/**
	 * NPCԭ��
	 */
	public static HashMap<Integer, NpcBaseEntity> npcMap = new HashMap<Integer, NpcBaseEntity>();
	/**
	 * NPCʵ�����
	 */
	public static ConcurrentHashMap<Integer, NpcBaseEntity> npcArray = new ConcurrentHashMap<Integer, NpcBaseEntity>();
	
	/**
	 * NPCˢ�µ�ԭ��
	 */
	public static final HashMap<Integer, NpcBornList> npcBornMap = new HashMap<Integer, NpcBornList>();
	
	/**
	 * AI����
	 */
	public static ConcurrentHashMap<Integer, SupAI> aiMap = new ConcurrentHashMap<Integer, SupAI>();
	
	/**
	 * Action����
	 */
	public static final HashMap<String, ActionAll> actionMap = new HashMap<String, ActionAll>();
	
	/**
	 * NPC��ˮID
	 */
	public static int NPC_SYSTEM_ID;
	
	/**
	 * AI��ˮID
	 */
	public static int AI_SYSTEM_ID;
	
	
	public synchronized static int getSystemIndexId()
	{
		if(NPC_SYSTEM_ID>=Integer.MAX_VALUE)
		{
			NPC_SYSTEM_ID=0;
		}
		return ++NPC_SYSTEM_ID;
	}
	
	public synchronized static int getAiSystemId()
	{
		if(AI_SYSTEM_ID>=Integer.MAX_VALUE)
		{
			AI_SYSTEM_ID=0;
		}
		return ++AI_SYSTEM_ID;
	}
}
