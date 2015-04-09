package com.arpg.gline.gameserver.module.fight.model;

/**
 * 技能类型
 * @author 杜祥
 * @date 2012-10-29
 */
public enum SkillType 
{
	/*单体加血，群体加血，单体伤害，群体伤害*/
	MONO_BLOOD(0),GROUP_BLOOD(1),MONO_HARM(2),GROUP_HARM(3);
	
	
	private int type;
	
	private SkillType(int type)
	{
		this.type = type;
	}
	
	
	public int getType()
	{
		return type;
	}
}
