package com.arpg.gline.gameserver.dataholders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * NPC(怪物)原型数据
 * @author 杜祥
 * @date 2012-11-20
 */
@XmlRootElement(name = "npcs")
@XmlAccessorType(XmlAccessType.FIELD)
public class NPCData 
{
	/*@XmlElement(name = "npc")
	List<NpcModel> list;
	
	*//**
	 * 怪物列表
	 *//*
	Map<Integer, NpcModel> map = new HashMap<Integer, NpcModel>();
	
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		map.clear();
		for(NpcModel  npc : list)
		{
			map.put(npc.getId(), npc);
		}
		list = null;
		DataManager.log.info("loading NPCData size:" + map.size());
	}

	public Map<Integer, NpcModel> getMap()
	{
		return map;
	}

	public NpcModel get(int id)
	{
		return map.get(id);
	}
	
	public int size()
	{
		return map.size();
	}*/
}
