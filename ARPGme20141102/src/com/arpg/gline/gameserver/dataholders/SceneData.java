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
 * 场景数据
 * @author 杜祥
 * @date 2012-09-28
 */
@XmlRootElement(name="scenes")
@XmlAccessorType(XmlAccessType.FIELD)
public class SceneData 
{
	/*@XmlElement(name = "scene")
	List<SceneModel> list;
	
	Map<Integer, SceneModel> map = new HashMap<Integer, SceneModel>();
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		for(SceneModel model : list)
		{
			map.put(model.getId(), model);
		}
		list = null;
		DataManager.log.info("loading SceneData size:" + map.size());
	}
	
	public SceneModel get(int id)
	{
		return map.get(id);
	}
	
	public int size()
	{
		return map.size();
	}

	public Map<Integer, SceneModel> getMap()
	{
		return map;
	}*/
	
	
}
