package com.arpg.gline.core.ai.entity;

import java.io.Serializable;

/**
 * NPC掉落金钱
 *
 */
public class NpcDropMoneyEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int moneyType;//货币类型
	
	private int minMoney;//最小货币数量
	
	private int maxMoney;//最大货币数量

	public int getMoneyType() 
	{
		return moneyType;
	}

	public void setMoneyType(int moneyType) 
	{
		this.moneyType = moneyType;
	}

	public int getMinMoney() {
		return minMoney;
	}

	public void setMinMoney(int minMoney) 
	{
		this.minMoney = minMoney;
	}

	public int getMaxMoney() 
	{
		return maxMoney;
	}

	public void setMaxMoney(int maxMoney) 
	{
		this.maxMoney = maxMoney;
	}
	
	

}
