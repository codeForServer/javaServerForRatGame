package com.arpg.gline.gameserver.module.fight.service;


import com.arpg.gline.gameserver.config.FightConfig;
import com.arpg.gline.gameserver.module.enums.ErrorCodeType;
import com.arpg.gline.gameserver.module.fight.utli.AttributeUtil;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * 战斗服务类
 * @author 杜祥
 * @date 2012-10-31
 */
public class FightService 
{
	private static AttributeUtil attributeUtil = AttributeUtil.newInstance();

	/**
	 * 施放技能
	 * @param player				玩家实体
	 * @param id					目标ID
	 * @param type					目标类型
	 * @param effect				技能效果
	 * @param x						X坐标
	 * @param y						Y坐标
	 * @param attackType			攻击类型
	 * @return						返回正确与错误
	 * @create 2012-11-2	杜祥
	 */
	/*public static int castSkill(AbstractObject player, long id, int type, SkillEffectModel effect, int x, int y,int attackType)
	{
		AbstractObject target = null;
		
		if(id != 0)
		{
			SceneEntity scene = player.gainSceneEntity();
			if(type == ObjectType.PLAYER.getType())
			{
				target = scene.getPlayerList().get(id);
			}
			else
			{
				target = scene.getMonsterList().get(id);
			}
			if(target == null)
				return ErrorCodeType.CODE_ERROR12.getCode();
		}
		
		Effect eff = SkillEngine.getEffectClass(player, target, effect, x, y, attackType);
		
		return eff.castEffect();
	}*/
}
