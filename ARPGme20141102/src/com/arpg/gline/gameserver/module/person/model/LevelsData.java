package com.arpg.gline.gameserver.module.person.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * �ȼ������辭���࣬ӳ���ڵ�
 * @author �����
 * @Date 2012-9-26
 */
@XmlRootElement(name = "levels")
@XmlAccessorType(XmlAccessType.FIELD)
public class LevelsData {
	
	@XmlElement(name = "level")
	private List<LevelsModel> listExpLevel = new ArrayList<LevelsModel>();
	
	private Map<Integer,LevelsModel> expMap = new HashMap<Integer,LevelsModel>();
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		for(LevelsModel  expLevel : listExpLevel)
		{
			expMap.put(expLevel.getLv(), expLevel);
		}
		listExpLevel = null;
	}
	
	public int size()
	{
		return expMap.size();
	}
	
	public LevelsModel get(int id)
	{
		return expMap.get(id);
	}

	public Map<Integer, LevelsModel> getMap() {
		return expMap;
	}

}
