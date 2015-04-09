package com.arpg.gline.gameserver.dataholders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.arpg.gline.gameserver.module.person.model.LvAddModel;

/**
 * 等级升级所需经验类，映射根节点
 * @author 代金龙
 * @Date 2012-9-26
 */

@XmlRootElement(name = "levels")
@XmlAccessorType(XmlAccessType.FIELD)
public class levelsData {
	
	@XmlElement(name = "level")
	private List<LvAddModel> listExpLevel = new ArrayList<LvAddModel>();
	
	private Map<Integer,LvAddModel> expMap = new HashMap<Integer,LvAddModel>();
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		for(LvAddModel  expLevel : listExpLevel)
		{
			expMap.put(expLevel.getLv(), expLevel);
		}
		listExpLevel = null;
		DataManager.log.info("loading levelsData size:" + expMap.size());
	}
	
	public int size()
	{
		return expMap.size();
	}
	
	public LvAddModel get(int id)
	{
		return expMap.get(id);
	}

	public Map<Integer, LvAddModel> getMap() {
		return expMap;
	}

}
