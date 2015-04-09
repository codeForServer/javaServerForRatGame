package com.arpg.gline.gameserver.module.skill.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 玩家技能实体
 * @author 杜祥
 * @data 2012-11-1
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SkillEntity 
{
	/**
	 * 技能ID
	 */
	int id;
	
	/**
	 * 技能原型数据
	 */
	///SkillModel skill;
	
	/**
	 * 技能效果ID
	 */
	int effectId;
	
	/**
	 * 技能效果
	 */
	//SkillEffectModel effect;
	
	/**
	 * 当前等级
	 */
	int level;
	
	public SkillEntity()
	{
		
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id 	= id;
	}

	public int getEffectId() 
	{
		return effectId;
	}

	public void setEffectId(int effectId) 
	{
		this.effectId = effectId;
	}

	public int getLevel() 
	{
		return level;
	}

	public void setLevel(int level) 
	{
		this.level = level;
	}

}
