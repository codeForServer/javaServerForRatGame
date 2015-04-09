package com.arpg.gline.gameserver.module.scene.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 罪恶等级对应掉落金钱几率，掉落金钱百分比。映射PenaltyMoneys子节点
 * @author 庄宏晓
 * @Date 2012-10-23
 *
 */
@XmlRootElement(name = "penalty_money")
@XmlAccessorType(XmlAccessType.FIELD)
public class PenaltyMoney 
{
	@XmlAttribute(name = "level")
	private int level;
	
	@XmlAttribute(name = "drop_odds")
	private int dropOdds;
	
	@XmlAttribute(name = "drop_percent")
	private int dropPercent;

	public int getLevel() {
		return level;
	}

	public int getDropOdds() {
		return dropOdds;
	}

	public int getDropPercent() {
		return dropPercent;
	}

	
}
