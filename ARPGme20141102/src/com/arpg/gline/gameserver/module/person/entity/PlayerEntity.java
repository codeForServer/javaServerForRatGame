package com.arpg.gline.gameserver.module.person.entity;

import java.util.HashMap;

import netBase.util.GameClient;

import com.arpg.gline.core.ai.RoleAbstracts;


/**
 * ���ʵ��
 * @author �����
 * @date 2013-1-17
 */
public class PlayerEntity  extends RoleAbstracts {

	private static final long serialVersionUID = 1L;
	
	/**
	 * ����/ͷ��
	 */
	private String ico;

	/**
	 * ����ID
	 */
    private long PId;

	/**
	 * �ʺ�
	 */
	private String countId;

	/**
	 *ְҵ
	 */
	private int profession;
	
	/**
	 * ����
	 */
	private int exp;
	
	/**
	 * ����
	 */
	private int coins;
	
	/**
	 * ���һ������ʱ��
	 */
	private long lastOnTime;
	
	/**
	 * ���һ������ʱ��
	 */
	private long lastDownTime;
	
	/**
	 * ����ʱ��
	 */
	private long createTime;
	
	/**
	 * ����ʱ��
	 */
	private long onlineTime;

	/**
	 * ��ҵ�����
	 */
	private GameClient client;
	
	/**
	 * ��ɫ�ȼ�
	 */
	private int lv;
	
	/**
	 * ���״̬
	 */
	private boolean  state;
	
	/**
	 *�Ա� 1:�� 2��Ů
	 */
	private byte sexy;
	
	/**
	 * ��һ�ι���ʱ��
	 */
	private long lastAttackTime;

	/**
	 * �ϴ�ʹ�õ��ߵ�ʱ��
	 */
	private long lastUseProp;

	/**
	 * ��һ���ƶ�������ʱ��
	 */
	private long lastMoveErrerTime;

	/**
	 * �ƶ�����Ĵ��������ж��Ƿ�ʹ�����
	 */
	private int moveErrerTimes;

	/** Ѫ��ֵ **/
	private int HP = 0;

	/** ����ֵ **/
	private int MP = 0;

	/** ���״̬ 1 ������2 ���, 3����״̬ **/
	private int liveStatus = 0;

	/** PK״̬ **/
	private int pkStatus = 0;
	
	/**
	 * ��ݶ�ʱ�����ʱ������ (��λ����)
	 */
	private int cachetime = 0;
	
	/**
	 * ���ڽ�ɫ���߲�������
	 * add by liuyuhua 2011-2-14
	 */
	private int step = 0; 
	
	
	private long lastDieTime = 0;
	
	/**
	 * ����Ƿ���д�����
	 * �����д���ͱ�� true 
	 */
	private boolean isWriteObj = false;
	
	/**
	 * �ж� ��ƷCD
	 */
	private  HashMap<Integer, Integer> articleCD = new HashMap<Integer, Integer>() ;
	
	/**
	 * �жϼ���CD
	 */
	private  HashMap<Integer, Integer> skillCD = new HashMap<Integer, Integer>() ;
	
	
	/**
	 * ��¼��ǰ�������ڸ����Զ���Ӷ���
	 */
	private int dungeonId = 0;
	
	
	
	
	public long getPId() {
		return PId;
	}

	public void setPId(long pId) {
		PId = pId;
	}

	public long getLastAttackTime() {
		return lastAttackTime;
	}

	public void setLastAttackTime(long lastAttackTime) {
		this.lastAttackTime = lastAttackTime;
	}

	public long getLastUseProp() {
		return lastUseProp;
	}

	public void setLastUseProp(long lastUseProp) {
		this.lastUseProp = lastUseProp;
	}

	public long getLastMoveErrerTime() {
		return lastMoveErrerTime;
	}

	public void setLastMoveErrerTime(long lastMoveErrerTime) {
		this.lastMoveErrerTime = lastMoveErrerTime;
	}

	public int getMoveErrerTimes() {
		return moveErrerTimes;
	}

	public void setMoveErrerTimes(int moveErrerTimes) {
		this.moveErrerTimes = moveErrerTimes;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}

	public void setMP(int mP) {
		MP = mP;
	}

	public int getLiveStatus() {
		return liveStatus;
	}

	public void setLiveStatus(int liveStatus) {
		this.liveStatus = liveStatus;
	}

	public int getPkStatus() {
		return pkStatus;
	}

	public void setPkStatus(int pkStatus) {
		this.pkStatus = pkStatus;
	}

	public int getCachetime() {
		return cachetime;
	}

	public void setCachetime(int cachetime) {
		this.cachetime = cachetime;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public long getLastDieTime() {
		return lastDieTime;
	}

	public void setLastDieTime(long lastDieTime) {
		this.lastDieTime = lastDieTime;
	}

	public boolean isWriteObj() {
		return isWriteObj;
	}

	public void setWriteObj(boolean isWriteObj) {
		this.isWriteObj = isWriteObj;
	}

	public HashMap<Integer, Integer> getArticleCD() {
		return articleCD;
	}

	public void setArticleCD(HashMap<Integer, Integer> articleCD) {
		this.articleCD = articleCD;
	}

	public HashMap<Integer, Integer> getSkillCD() {
		return skillCD;
	}

	public void setSkillCD(HashMap<Integer, Integer> skillCD) {
		this.skillCD = skillCD;
	}

	public int getDungeonId() {
		return dungeonId;
	}

	public void setDungeonId(int dungeonId) {
		this.dungeonId = dungeonId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean  state) {
		this.state = state;
	}

	public String getCountId() {
		return countId;
	}

	public void setCountId(String countId) {
		this.countId = countId;
	}

	public int getProfession() {
		return profession;
	}

	public void setProfession(int profession) {
		this.profession = profession;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public long getLastOnTime() {
		return lastOnTime;
	}

	public void setLastOnTime(long lastOnTime) {
		this.lastOnTime = lastOnTime;
	}

	public long getLastDownTime() {
		return lastDownTime;
	}

	public void setLastDownTime(long lastDownTime) {
		this.lastDownTime = lastDownTime;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public long getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(long onlineTime) {
		this.onlineTime = onlineTime;
	}

	public GameClient getClient() {
		return client;
	}

	public void setClient(GameClient client) {
		this.client = client;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}
	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}
	public byte getSexy() {
		return sexy;
	}

	public void setSexy(byte sexy) {
		this.sexy = sexy;
	}

}
