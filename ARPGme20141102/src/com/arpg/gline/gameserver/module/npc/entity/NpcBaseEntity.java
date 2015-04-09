package com.arpg.gline.gameserver.module.npc.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.arpg.gline.core.ai.RoleAbstracts;
import com.arpg.gline.core.ai.entity.NpcDropMoneyEntity;


/**
 * NPCʵ����
 */
public class NpcBaseEntity extends RoleAbstracts implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private int baseId;//ԭ��ID
	
	private int race;//����
	
	private int type;//����
	
	private int minLevel;//��С�ȼ�
	
	private int maxLevel;//���ȼ�
	
	private int expMin;//��С����
	
	private int expMax;//�����
	
	private int timeMin;//���ˢ��ʱ��
	
	private int timeMax;//���ˢ��ʱ��
	
	private int attack_cd;//�������
	
	private int stopTimeMin;//��Сͣ��ʱ��
	
	private int stopTimeMax;//���ͣ��ʱ��
	
	private int is_broadcast;//�Ƿ񲥱�
	
	private int initX;//��ʼ�����X
	
	private int initY;//��ʼ�����Y
	
	private int attackFight;//�����������Ǳ�������
	
	private int initHp;//��ʼ��HP
	
	private int initMp;//��ʼ��MP
	
	private int dropEquipNumber;//������װ������
	
	private int dropPropNumber;//�������������
	
	private int guardRange;//���䷶Χ
	
	private int pursueRange;//׷��Χ
	
	private int patrolRange;//Ѳ�߷�Χ
	
	private int minMoveRange;//�ƶ���Χ
	
	private int attackscope;//������Χ
	
	private int npcAiId;//NPC Ai����ˮID

	private List<NpcDropMoneyEntity> dropMoneyList = new ArrayList<NpcDropMoneyEntity>();//NPC�����Ǯʵ��
	
	//private List<NpcDropArticle> dropArticleList = new ArrayList<NpcDropArticle>();//NPC������Ʒʵ��
	
	public int getBaseId() {
		return baseId;
	}

	public void setBaseId(int baseId) {
		this.baseId = baseId;
	}

	public int getRace() {
		return race;
	}

	public void setRace(int race) {
		this.race = race;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getMinLevel() {
		return minLevel;
	}

	public void setMinLevel(int minLevel) {
		this.minLevel = minLevel;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public int getExpMin() {
		return expMin;
	}

	public void setExpMin(int expMin) {
		this.expMin = expMin;
	}

	public int getExpMax() {
		return expMax;
	}

	public void setExpMax(int expMax) {
		this.expMax = expMax;
	}

	public int getTimeMin() {
		return timeMin;
	}

	public void setTimeMin(int timeMin) {
		this.timeMin = timeMin;
	}

	public int getTimeMax() {
		return timeMax;
	}

	public void setTimeMax(int timeMax) {
		this.timeMax = timeMax;
	}

	public int getAttack_cd() {
		return attack_cd;
	}

	public void setAttack_cd(int attackCd) {
		attack_cd = attackCd;
	}

	public int getStopTimeMin() {
		return stopTimeMin;
	}

	public void setStopTimeMin(int stopTimeMin) {
		this.stopTimeMin = stopTimeMin;
	}

	public int getStopTimeMax() {
		return stopTimeMax;
	}

	public void setStopTimeMax(int stopTimeMax) {
		this.stopTimeMax = stopTimeMax;
	}

	public int getIs_broadcast() {
		return is_broadcast;
	}

	public void setIs_broadcast(int isBroadcast) {
		is_broadcast = isBroadcast;
	}

	public int getInitX() {
		return initX;
	}

	public void setInitX(int initX) {
		this.initX = initX;
	}

	public int getInitY() {
		return initY;
	}

	public void setInitY(int initY) {
		this.initY = initY;
	}

	
	public int getAttackFight() {
		return attackFight;
	}

	public void setAttackFight(int attackFight) {
		this.attackFight = attackFight;
	}

	public int getInitHp() {
		return initHp;
	}

	public void setInitHp(int initHp) {
		this.initHp = initHp;
	}

	public int getInitMp() {
		return initMp;
	}

	public void setInitMp(int initMp) {
		this.initMp = initMp;
	}
	
	public int getDropEquipNumber() {
		return dropEquipNumber;
	}

	public void setDropEquipNumber(int dropEquipNumber) {
		this.dropEquipNumber = dropEquipNumber;
	}

	public int getDropPropNumber() {
		return dropPropNumber;
	}

	public int getGuardRange() {
		return guardRange;
	}

	public void setGuardRange(int guardRange) 
	{
		this.guardRange = guardRange;
	}

	public int getPursueRange() 
	{
		return pursueRange;
	}

	public void setPursueRange(int pursueRange) 
	{
		this.pursueRange = pursueRange;
	}

	public int getPatrolRange() 
	{
		return patrolRange;
	}

	public void setPatrolRange(int patrolRange) 
	{
		this.patrolRange = patrolRange;
	}

	public int getMinMoveRange() 
	{
		return minMoveRange;
	}

	public int getAttackscope() 
	{
		return attackscope;
	}

	public void setAttackscope(int attackscope) {
		this.attackscope = attackscope;
	}

	public void setMinMoveRange(int minMoveRange) {
		this.minMoveRange = minMoveRange;
	}

	public void setDropPropNumber(int dropPropNumber) {
		this.dropPropNumber = dropPropNumber;
	}

	public int getNpcAiId() {
		return npcAiId;
	}

	public void setNpcAiId(int npcAiId) {
		this.npcAiId = npcAiId;
	}

	public List<NpcDropMoneyEntity> getDropMoneyList() 
	{
		return dropMoneyList;
	}

	
	/**
	 * ��¡
	 * �������npc
	 */
	public NpcBaseEntity clone()
	{
		NpcBaseEntity npc = null;
		try 
		{
			npc = (NpcBaseEntity)super.clone();
			npc.setRoleStatus(this.getRoleStatus().clone());
		} catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
		return npc;
	}
	
}

