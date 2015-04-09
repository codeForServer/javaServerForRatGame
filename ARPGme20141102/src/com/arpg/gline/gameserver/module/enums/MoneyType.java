package com.arpg.gline.gameserver.module.enums;
/**
 * 货币分类
 * @author 	代金龙
 * @date	2012-11-15
 */
public enum MoneyType 
{
	
	 /*铜钱*/
	 MONEY_COINS(1),
	
	 /*银子*/
	 MONEY_BINDCOINS(2),
	
	 /*元宝*/
	 MONEY_GOLD(3),
	
	 /*绑定元宝*/
	 MONEY_BINDGOLD(4);
	
	
	private int type;
	
	
	private MoneyType(int type)
	{
		this.type = type;
	}

	public int getType()
	{
		return this.type;
	}

}
