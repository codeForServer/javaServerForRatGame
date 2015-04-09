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
 * NPC出生点数据
 * @author 杜祥
 * @date 2012-11-21
 */
@XmlRootElement(name = "scenes")
@XmlAccessorType(XmlAccessType.FIELD)
public class NPCBornData 
{/*
	@XmlElement(name = "npc_born_map")
	List<SceneNpcBornModel> list;
	
	
	Map<Integer, SceneNpcBornModel> map = new HashMap<Integer, SceneNpcBornModel>();
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		map.clear();
		for(SceneNpcBornModel model : list)
		{
			map.put(model.getMapId(), model);
		}
		list = null;
		DataManager.log.info("loading NPCBornData size:" + map.size());
	}
	
	
	public SceneNpcBornModel get(int id)
	{
		return map.get(id);
	}


	public Map<Integer, SceneNpcBornModel> getMap()
	{
		return map;
	}
	
	
	public int size()
	{
		return map.size();
	}*/
	
	
}
