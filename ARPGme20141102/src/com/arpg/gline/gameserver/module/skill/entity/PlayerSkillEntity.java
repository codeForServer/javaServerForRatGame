package com.arpg.gline.gameserver.module.skill.entity;

import java.util.HashMap;
import java.util.List;


/**
 * 玩家技能实体
 * @author 杜祥
 * @date 2012-11-2
 */
public class PlayerSkillEntity
{
	HashMap<Integer, SkillEntity> map;
	
	/**
	 * 所属玩家Id
	 */
	private long playerId;
	
	public PlayerSkillEntity()
	{
		map = new HashMap<Integer, SkillEntity>();
	}
	
	/**
	 * 初始化玩家技能
	 * @param list	初始化技能列表
	 */
	public PlayerSkillEntity(List<SkillEntity> list)
	{
		map = new HashMap<Integer, SkillEntity>();
		for(SkillEntity entity : list)
		{
			this.add(entity);
		}
	}
	
	/**
	 * 获得技能
	 * @param id			技能id
	 * @return
	 */
	public SkillEntity get(int id)
	{
		return map.get(id);
	}
	
	/**
	 * 添加技能到玩家技能Map
	 * @param entity		技能实体
	 * @create	2012-11-8	欧阳
	 */
	public void add(SkillEntity entity)
	{
		map.put(entity.getId(), entity);
	}

	public HashMap<Integer, SkillEntity> getMap()
	{
		return map;
	}

	public void setMap(HashMap<Integer, SkillEntity> map) 
	{
		this.map = map;
	}
	
	/**
	 * 获取玩家Id
	 * @return
	 * @create	2012-11-12	欧阳
	 */
	public long gainPlayerId() {
		return playerId;
	}

	/**
	 * 设置玩家Id
	 * @param playerId		玩家Id
	 * @create	2012-11-12	欧阳
	 */
	public void putPlayerId(long playerId) {
		this.playerId = playerId;
	}
	
	
	
}
