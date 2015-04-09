package com.arpg.gline.gameserver.dataholders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 幸运等级对应幸运值
 * @author 杜祥
 * @date 2012-11-7
 */
@XmlRootElement(name = "lucks")
@XmlAccessorType(XmlAccessType.FIELD)
public class LuckValueData 
{
	@XmlElement(name = "luck")
	private float[] lucks;

	public float[] getLucks() 
	{
		return lucks;
	}
	
	public float get(int level)
	{
		return lucks[level];
	}
	
}
