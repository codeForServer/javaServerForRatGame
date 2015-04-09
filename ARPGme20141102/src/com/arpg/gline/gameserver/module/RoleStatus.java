package com.arpg.gline.gameserver.module;


import java.io.Serializable;

/**
 * ��ɫ״̬ 
 *
 */
public class RoleStatus implements Serializable ,Cloneable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ѣ��״̬
	 */
	private boolean dizzy = false;	
	
	/**
	 *ѣ��ʱ��(����NPC��) 
	 */
	private long dizzyTime = 0;
	
	
	/**
	 * �Ƿ�ֹͣ״̬
	 */
	private boolean stopMove = false;
	
	/**
	 * ֹͣʱ��(����NPC��) 
	 */
	private long stopTime = 0;
	
	/**
	 * �޵�״̬
	 */
	private boolean invincibility = false; 
	
	/**
	 * �޵���Чʱ��
	 */
	private long invincibility_time = 0;
	
	
	/**
	 * ħ��״̬
	 */
	private boolean magicalImmunity = false;
	
	/**
	 * ħ����Чʱ��
	 */
	private long magicalImmunity_time = 0;

	/**
	 * ��Ѫ״̬ 
	 */
	private boolean suckBlood = false;
	
	/**
	 * ��Ѫ�ٷֱ�
	 */
	private float suckBloodPercent = 0.0f;
	
	/**
	 * ��Ѫ�̶�ֵ
	 */
	private float suckBloodValue = 0.0f;
	
	/**
	 * ����״̬
	 */
	private boolean transmit = false; 
	
	/**
	 * �˺����� ����״̬ true ���� false �ر�
	 */
	private boolean harmAbsorb = false;
	
	/**����״̬  0 ��ʾ���ڸ��� 1��ʾ�ڸ��� �����뿴 ParameterKey.java **/
	private int dungeon = 0;
	
	/**�ؿ�״̬  0 ��ʾ���ڹؿ� 1��ʾ�ؿ� �����뿴 ParameterKey.java **/
	private int burst = 0;
	
	/**ʹ�ò��ɱ�PK���ߵļ��ʱ�� 0��ʾû��ʹ��  ����0��ʾ�ڲ��ɱ�PKʱ����*/
	private int pk_time=0;

	/**
	 * ���� ԭ�� ID
	 */
	private int dungeon_base_id = 0;
	
	/**
	 * �ؿ� ԭ�� ID
	 */
	private int burst_base_id = 0;
	
	/**
	 * ��Ĭ״̬
	 */
	private boolean silence = false;
	
	
	/**
	 * �˺�����ֵ
	 */
	private int harmAbsorbValue = 0;
	
	/**
	 * ս��״̬
	 */
	private boolean warStatus = false;
	
	/**
	 * ������״̬
	 */
	private int arenaStatus=0;
	
	/**
	 * ����״̬ true ��ʾ�ǽ���״̬ false ��ʾ��
	 */
	private boolean tradeStatus = false;

	
	public boolean isTradeStatus() 
	{
		return tradeStatus;
	}


	public void setTradeStatus(boolean tradeStatus)
	{
		this.tradeStatus = tradeStatus;
	}


	/**
	 * ���ؾ�����״̬
	 * @return
	 * ������״̬  1:�Ǿ�����״̬ 2:������ս��״̬
	 */
	public int isArenaStatus() {
		return arenaStatus;
	}


	public void setArenaStatus(int arenaStatus) {
		this.arenaStatus = arenaStatus;
	}


	/**
	 * �����Ƿ���ս��״̬
	 * @return true ս��״̬ false ��ս��״̬
	 */
	public boolean isWarStatus()
	{
		return warStatus;
	}


	public void setWarStatus(boolean warStatus)
	{
		this.warStatus = warStatus;
	}


	/**
	 * ����һ����ҽ�ɫ���ϵ�״̬
	 * ��½��ʱ������
	 */
	public void initRoleStatus()
	{
		this.dizzy = false;
		this.harmAbsorb = false;
		this.invincibility = false;
		this.magicalImmunity = false;
		this.silence = false;
		this.stopMove = false;
		this.suckBlood = false;
		this.transmit = false;
		this.warStatus = false;
		this.arenaStatus = 0;
		this.tradeStatus = false;
	}
	
	
	public long getDizzyTime() {
		return dizzyTime;
	}

	public void setDizzyTime(long dizzyTime) {
		this.dizzyTime = dizzyTime;
	}

	public long getStopTime() {
		return stopTime;
	}

	public void setStopTime(long stopTime) {
		this.stopTime = stopTime;
	}


	
	public int getDungeon_base_id()
	{
		return dungeon_base_id;
	}

	public void setDungeon_base_id(int dungeon_base_id) {
		this.dungeon_base_id = dungeon_base_id;
	}

	public int getDungeon() {
		return dungeon;
	}

	public void setDungeon(int dungeon) {
		this.dungeon = dungeon;
	}

	public boolean isHarmAbsorb() {
		return harmAbsorb;
	}

	public void setHarmAbsorb(boolean harmAbsorb) {
		this.harmAbsorb = harmAbsorb;
	}

	public int getHarmAbsorbValue() {
		return harmAbsorbValue;
	}

	public void setHarmAbsorbValue(int harmAbsorbValue) {
		this.harmAbsorbValue = harmAbsorbValue;
	}

	public boolean isTransmit() {
		return transmit;
	}

	public boolean isSilence() {
		return silence;
	}

	public void setSilence(boolean silence) {
		this.silence = silence;
	}

	public void setTransmit(boolean transmit) {
		this.transmit = transmit;
	}

	public boolean isDizzy()
	{
		return dizzy;
	}

	public void setDizzy(boolean dizzy)
	{
		this.dizzy = dizzy;
	}

	public boolean isStopMove()
	{
		return stopMove;
	}

	public void setStopMove(boolean stopMove)
	{
		this.stopMove = stopMove;
	}

	public boolean isInvincibility()
	{
		return invincibility;
	}

	public void setInvincibility(boolean invincibility) 
	{
		this.invincibility = invincibility;
	}

	public boolean isSuckBlood() 
	{
		return suckBlood;
	}

	public void setSuckBlood(boolean suckBlood)
	{
		this.suckBlood = suckBlood;
	}

	public float getSuckBloodPercent()
	{
		return suckBloodPercent;
	}

	public void setSuckBloodPercent(float suckBloodPercent) 
	{
		this.suckBloodPercent = suckBloodPercent;
	}

	public float getSuckBloodValue()
	{
		return suckBloodValue;
	}

	public void setSuckBloodValue(float suckBloodValue) 
	{
		this.suckBloodValue = suckBloodValue;
	}
	
	public boolean isMagicalImmunity() 
	{
		return magicalImmunity;
	}

	public void setMagicalImmunity(boolean magicalImmunity)
	{
		this.magicalImmunity = magicalImmunity;
	}

	public long getMagicalImmunity_time()
	{
		return magicalImmunity_time;
	}

	public void setMagicalImmunity_time(long magicalImmunity_time)
	{
		this.magicalImmunity_time = magicalImmunity_time;
	}
	
	public int getBurst_base_id()
	{
		return burst_base_id;
	}

	public void setBurst_base_id(int burst_base_id) {
		this.burst_base_id = burst_base_id;
	}
	

	public int getBurst(){
		return burst;
	}
	
	public void setBurst(int burst){
		this.burst=burst;
	}
	
	
	
	/**
	 * ��������Ѫ�����Ժ�ÿ�������Ѫ	 * 
	 * @param harmValue
	 * return int ÿ����Ѫ��
	 */
	public int suckBlood(int harmValue)
	{
		return (int)(harmValue * this.suckBloodPercent + this.suckBloodValue);		
	}
	
	public RoleStatus clone(){
		RoleStatus roleStatus=null;
		try {roleStatus=(RoleStatus)super.clone();
		} catch (CloneNotSupportedException e) {e.printStackTrace();}
		return roleStatus;
	}

	public long getInvincibility_time() {
		return invincibility_time;
	}

	public void setInvincibility_time(long invincibility_time) {
		this.invincibility_time = invincibility_time;
	}

	/**
	 * ʹ�ò��ɱ�PK���ߵļ��ʱ�� 
	 * 0��ʾû��ʹ��  
	 * ����0��ʾ�ڲ��ɱ�PKʱ����
	 * @return
	 */
	public int getPk_time() {
		return pk_time;
	}

	/**
	 * ʹ�ò��ɱ�PK���ߵļ��ʱ�� 
	 * 0��ʾû��ʹ��  
	 * ����0��ʾ�ڲ��ɱ�PKʱ����
	 * @param pkTime
	 */
	public void setPk_time(int pkTime) {
		pk_time = pkTime;
	}
	
	/**
	 * �Ƿ�PK����
	 * @return true PK���� false����PK����
	 */
	public boolean isPktime()
	{
		if(this.pk_time > (System.currentTimeMillis() / 1000))
		{
			return true;
		}
		
		return false;
	}
	
}

