package com.arpg.gline.gameserver.dataholders;


import org.apache.log4j.Logger;

import com.commons.db.DataHolder;
import com.commons.db.DataHolderFolder;

/**
 * 游戏原型数据管理器
 * @author du'xiang
 * @date 2012-08-22
 */
public class DataManager 
{
	public static Logger	log	= Logger.getLogger(DataManager.class);
	
	@DataHolder(name = "./data/lv.xml")
	public static levelsData LV_DATA;
	
	@DataHolderFolder(folderName = "./data/scenes" , fileName = "./data/scenes.xml")
	public static SceneData SCENE_DATA;
	
	@DataHolder(name = "./data/penalty_moneys.xml")
	public static PenaltyMoneyData PENALTY_MONEY_DATA;
	
	@DataHolder(name = "./data/penalty_equips.xml")
	public static PenaltyEquipData PENALTY_EQUIP_DATA;
	
	@DataHolder(name = "./data/skill.xml")
	public static SkillsData SKILLS_DATA;
	
	@DataHolder(name = "./data/skill_effects.xml")
	public static SkillEffectsData SKILL_EFFECTS_DATA;
	
	@DataHolder(name = "./data/luck_value.xml")
	public static LuckValueData LUCK_VALUE_DATA;
	
	
	@DataHolder(name = "./data/npcs.xml")
	public static NPCData NPC_DATA;
	
	@DataHolderFolder(folderName = "./data/npc_born" , fileName = "./data/npc_borns.xml")
	public static NPCBornData NPC_BORN_DATA;
	
}
