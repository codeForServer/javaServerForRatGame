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
 * 技能效果原型数据
 * @author 杜祥
 * @date 2012-11-1
 */
@XmlRootElement(name = "skills_effects")
@XmlAccessorType(XmlAccessType.FIELD)
public class SkillEffectsData 
{
	/*@XmlElement(name = "skills_effect")
	List<SkillEffectModel> list;
	
	
	Map<Integer, SkillEffectModel> map = new HashMap<Integer, SkillEffectModel>();
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		for(SkillEffectModel model : list)
		{
			map.put(model.getId(), model);
		}
		
		list = null;
		
		DataManager.log.info("loading SkillEffectsData size:" + map.size());
	}
	
	
	
	public Map<Integer, SkillEffectModel> getMap()
	{
		return map;
	}
	
	
	public SkillEffectModel get(int id)
	{
		return map.get(id);
	}
	
	public int size()
	{
		return map.size();
	}
	*/
}
