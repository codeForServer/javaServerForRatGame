package com.arpg.gline.core.ai.Inteface;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * AI��������Ϊ�ӿ�
 */

public interface Hit 
{
	public int hit(SupAI ai,int harm ,PlayerEntity roleEntity);
}
