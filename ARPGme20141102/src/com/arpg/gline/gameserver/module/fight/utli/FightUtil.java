package com.arpg.gline.gameserver.module.fight.utli;


/**
 * 战斗工具类
 * @author 杜祥
 * @date 2012-11-1
 */
public class FightUtil 
{
	private final static FightUtil fightUtil = new FightUtil();
	
	private FightUtil(){
		
	}
	
	public static FightUtil newInstance()
	{
		return fightUtil;
	}


}
