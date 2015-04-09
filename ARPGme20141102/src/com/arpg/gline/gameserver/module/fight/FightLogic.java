package com.arpg.gline.gameserver.module.fight;


import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.config.FightConfig;
import com.arpg.gline.gameserver.message.FightMessage;
import com.arpg.gline.gameserver.module.enums.ErrorCodeType;
import com.arpg.gline.gameserver.module.fight.service.FightService;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;
import com.arpg.gline.gameserver.module.skill.entity.SkillEntity;

/**
 * 战斗逻辑类
 * @author 杜祥
 * @date 2012-11-1
 */
public class FightLogic 
{
	private final static FightLogic fightLogic = new FightLogic();
	
	private Logger log = Logger.getLogger(FightLogic.class);
	
	private FightLogic(){
		
	}
	
	public static FightLogic newInstance()
	{
		return fightLogic;
	}
	
	
	
	/**
	 * 施放技能
	 * @param player				玩家实体
	 * @param id					目标ID
	 * @param type					目标类型
	 * @param skillId				技能ID
	 * @param x						X坐标
	 * @param y						Y坐标
	 * @param attackType			是否是强制攻击(参加EnforceAttackType枚举)
	 * @create 2012-11-2 杜祥
	 */
	public void castSkill(PlayerEntity player, long id, int type, int skillId, int x, int y, int attackType)
	{
		int state = ErrorCodeType.CODE_SUCCESS.getCode();
		/*判断玩家是否死亡
		if(player.getState().isLive())
		{
			SkillEntity skill = player.gainSkEntity().get(skillId);
			判断玩家是否有该技能
			if(skill == null) return;
			
			long time = System.currentTimeMillis();
			
			if(player.gainLastTime() + FightConfig.ATTACK_INTERVAL < time)
			{
				调用施放技能
				state = FightService.castSkill(player, id, type, skill.gainEffect(), x, y, attackType);
				if(state == 0)
					player.putLastTime(time);
			}
			else
				state = ErrorCodeType.CODE_ERROR12.getCode();
		}
		else
		{
			玩家已经死亡
			state = ErrorCodeType.CODE_ERROR14.getCode();
		}*/
		FightMessage.GC_CAST_SKILL(player, state);
		/*StringBuilder buidler = new StringBuilder("玩家施放技能---玩家ID[").append(player.getId())
				.append("]施放技能的ID[").append(skillId).append("]施放的状态[").append(state).append("]");
		log.info(buidler.toString());*/
	}
	
}
