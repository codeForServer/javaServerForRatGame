package com.arpg.gline.gameserver.module.fight.model;



/**
 * 战斗模式枚举
 * @author 杜祥
 * @date 2012-11-2
 */
public enum FightModeType 
{
	/*和平模式，战斗模式，屠戮模式*/
	MODE_PEACE(0),MODE_FIGHT(1),MODE_KILLING(2);
	
	private int type;
	
	private FightModeType(int type)
	{
		this.type = type;
	}
	
	public int getType()
	{
		return type;
	}
	

}
