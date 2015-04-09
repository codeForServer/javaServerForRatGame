package com.arpg.gline.core.ai.Inteface;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * AI���
 *
 */
public interface Hatred 
{
	public void hatred(SupAI ai,PlayerEntity roleEntity,int hard);
}
