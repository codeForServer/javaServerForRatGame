package com.arpg.gline.core.ai.Inteface;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * AI��Ϊ(������Ϊʵ�ִ˽ӿ�)
 *
 */
public interface ActionAll 
{
	//public void action(SupAI ai,PlayerEntity roleEntity,int harm,int scope);
	public abstract void action(SupAI ai,PlayerEntity roleEntity,int harm);
}
