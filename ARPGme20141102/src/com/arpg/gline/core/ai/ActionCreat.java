package com.arpg.gline.core.ai;

import java.util.HashMap;

import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.core.ai.action.NormalAttack;
import com.arpg.gline.core.ai.action.NormalDie;


/**
 * AI行为Map创建
 *
 */
public class ActionCreat 
{
	/**
	 * 单例
	 */
	private static ActionCreat actionCreat = null;	
	private ActionCreat(){}
	public static ActionCreat getInstance()
	{
		if(actionCreat == null)
		{
			synchronized (ActionCreat.class) 
			{
				actionCreat = new ActionCreat();
			}
		}
		return actionCreat;
	}
	
	public HashMap<String, ActionAll> creatAction()
	{
		HashMap<String, ActionAll> hashMap = NpcStore.actionMap;
		
		if(hashMap.size() == 0)
		{
			hashMap.put("NormalAttack", new NormalAttack());
			hashMap.put("NormalDie", new NormalDie());
		}
		
		return hashMap;
	}
}
