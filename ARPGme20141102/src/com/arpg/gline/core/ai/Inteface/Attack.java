package com.arpg.gline.core.ai.Inteface;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * AI�����ӿ�
 * ����AI�Ĺ�����Ϊ��ʵ�ִ˽ӿ�
 */
public interface Attack
{
	public void attack(SupAI ai,PlayerEntity roleEntity);
}
