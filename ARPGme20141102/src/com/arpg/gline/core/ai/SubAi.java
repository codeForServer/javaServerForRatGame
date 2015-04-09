package com.arpg.gline.core.ai;

import util.RandomUtil;

import com.arpg.gline.core.ai.Inteface.ActionAll;

/**
 * AI����
 * @date 2013.4.10
 */
public class SubAi extends SupAI
{
	
	public SubAi(ActionAll die, ActionAll move, ActionAll guard,
			ActionAll hit, ActionAll attack, ActionAll hatred,
			ActionAll findTarger, ActionAll targetDie, ActionAll stop) 
	{
		super(die, move, guard, hit, attack, hatred, findTarger, targetDie, stop);
	}

	public void init() 
	{
		
		//this.getNpcEntity().setLiveStatus(ParameterKey.STATUS_LIVE);
		
		this.getNpcEntity().setLastx(this.getNpcEntity().getInitX());
		this.getNpcEntity().setLasty(this.getNpcEntity().getInitY());
		this.getNpcEntity().setTargetx(this.getNpcEntity().getInitX());
		this.getNpcEntity().setTargety(this.getNpcEntity().getInitY());
		
		int level = this.getNpcEntity().getMaxLevel() - this.getNpcEntity().getMinLevel();
		
		if(level > 0)
		{
			level = RandomUtil.IntFromZero(level);
		}
		level = level + this.getNpcEntity().getMinLevel();
		
		this.getNpcEntity().setLevel(level);
		
		//��AI���������
		NpcStore.aiMap.put(this.getaId(), this);
	}


}
