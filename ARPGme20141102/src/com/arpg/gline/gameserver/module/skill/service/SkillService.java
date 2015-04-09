package com.arpg.gline.gameserver.module.skill.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.config.FightConfig;
import com.arpg.gline.gameserver.dataholders.DataManager;
import com.arpg.gline.gameserver.message.SkillMessage;
import com.arpg.gline.gameserver.module.fight.service.FightService;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;
import com.arpg.gline.gameserver.module.skill.entity.PlayerSkillEntity;
import com.arpg.gline.gameserver.module.skill.entity.SkillEntity;
import com.commons.db.dao.DAOManager;

/**
 * 技能服务类
 * @author 	欧阳
 * @date	2012-11-12
 */
public class SkillService {
	
	private static Logger log = Logger.getLogger(SkillService.class);
	
	/**
	 * 创建技能列表
	 * @param player		玩家信息
	 * @return
	 * @create	2012-11-12	欧阳
	 */
	public static PlayerSkillEntity createPlayerSkill(long playerId)
	{
		/* 生成初始化技能列表 */
		List<SkillEntity> list = new ArrayList<SkillEntity>();
		list.add(SkillService.createSkillEntity(1));
		list.add(SkillService.createSkillEntity(2));
		
		/* 初始化角色技能列表 */
		PlayerSkillEntity entity = new PlayerSkillEntity(list);
		entity.putPlayerId(playerId);
		
		/*	DB存储 */
		//DAOManager.getDAO(PlayerSkillDao.class).save(entity);
		
		/* 写log */
		StringBuilder logMsg = new StringBuilder("创建技能列表--玩家Id[");
		logMsg.append(playerId).append("]");
	  	log.info(logMsg);
		
		return entity;
	}
	
	/**
	 * 加载角色技能列表
	 * @param player		玩家信息
	 * @create	2012-11-12	欧阳
	 */
	public static void loadPlayerSkill(PlayerEntity player)
	{
/*		 数据库获取，木有则创建背包 
		PlayerSkillEntity entity = DAOManager.getDAO(PlayerSkillDao.class).getEntity(player.getId());
		if(entity == null)
		{
			entity = SkillService.createPlayerSkill(player.getId());
		}
		
		 初始化角色技能实体 
		SkillService.initPlayerSkill(entity, player.getId());
		
		 数据加载内存 
		player.putSkEntity(entity);
		SubDataManager.PlayerSkillData.add(entity.gainPlayerId(), entity);*/
	}
	
	/**
	 * 退出游戏
	 * @param player
	 * @return
	 * @create	2012-11-9	欧阳
	 */
	public static void exitGame(PlayerEntity player)
	{
/*		DAOManager.getDAO(PlayerSkillDao.class).save(player.gainSkEntity());
		SubDataManager.PlayerSkillData.remove(player.getId());*/
	}
	
	/**
	 * 验证是否可以添加技能
	 * @param entity
	 * @return
	 * @create	2012-11-5	欧阳
	 */
	public static boolean verifAdd(PlayerEntity player, int id)
	{
/*		if(id == 0 || player.gainSkEntity().getMap().containsKey(id))
		{
			return true;
		}
		else*/
		{
			return false;
		}
	}
	
	/**
	 * 添加技能到角色技能列表中
	 * @param player		玩家
	 * @param id
	 * @return
	 * @create	2012-11-8	欧阳
	 */
	public static SkillEntity add(PlayerEntity player, int id)
	{
		SkillEntity entity = null;
/*		if(SkillService.verifAdd(player, id))
		{
			entity = SkillService.createSkillEntity(id);
			player.gainSkEntity().add(entity);
			
			SkillMessage.GC_LEARN_SKILL(player, entity);
		}*/

		return entity;
	}
	
	/**
	 * 通过技能Id创建一个技能
	 * @param id			技能Id
	 * @return
	 * @create	2012-11-13	欧阳
	 */
	private static SkillEntity createSkillEntity(int id)
	{
		SkillEntity skEntity = new SkillEntity();
		/*skEntity.setLevel(FightConfig.SKILL_INIT_LEVE);
		
		skEntity.setId(id);
		SkillModel skModel = DataManager.SKILLS_DATA.get(id);
		skEntity.putSkill(skModel);

		
		 通过技能等级获得技能效果Id 
		int effectId = 1;
		skEntity.setEffectId(effectId);
		skEntity.putEffect(DataManager.SKILL_EFFECTS_DATA.get(effectId));
		*/
		return skEntity;
	}
	
	/**
	 * 初始化玩家技能
	 * @param entity		玩家技能实体
	 * @param playerId		玩家Id
	 * @create	2012-11-13	欧阳
	 */
	private static void initPlayerSkill(PlayerSkillEntity entity, long playerId)
	{
/*		entity.putPlayerId(playerId);
		HashMap<Integer, SkillEntity> map = entity.getMap();
		for(Entry<Integer, SkillEntity> sk : map.entrySet())
		{
			SkillEntity skEntry = sk.getValue();
			
			 TODO:技能系统 - 初始化玩家技能 - 添加套装添加等级 ，暂时使用0
			skEntry.putEqLv(0);
			
			skEntry.putSkill(DataManager.SKILLS_DATA.get(skEntry.getId()));
			skEntry.putEffect(DataManager.SKILL_EFFECTS_DATA.get(skEntry.getEffectId()));
		}*/
	}
}
