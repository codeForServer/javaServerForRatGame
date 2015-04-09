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
 * 技能原型数据
 * @author 杜祥
 * @date 2012-10-30
 */
@XmlRootElement(name = "skill_trees")
@XmlAccessorType(XmlAccessType.FIELD)
public class SkillsData 
{
	/*@XmlElement(name = "skill_tree")
	List<SkillModel> list;
	
	Map<Integer, SkillModel> map = new HashMap<Integer, SkillModel>();

	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		for(SkillModel model : list)
		{
			map.put(model.getId(), model);
		}
		
		list = null;
		
		DataManager.log.info("loading SkillData size:" + map.size());
	}
	
	
	public Map<Integer, SkillModel> getMap()
	{
		return map;
	}
	
	
	public SkillModel get(int id)
	{
		return map.get(id);
	}
	
	public int size()
	{
		return map.size();
	}*/
	
}
