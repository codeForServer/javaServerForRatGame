package com.arpg.gline.core.ai;

import java.io.Serializable;
import java.util.List;

import com.arpg.gline.gameserver.module.RoleStatus;


/**
 *  玩家超类
 */
public abstract class RoleAbstracts implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private int roleId;//ΨһID��������ң�ÿ��ְҵһ��id�����ڹ��ÿ�ֹ���һ��id
	
	private String name;//���
	
	private int level;//�ȼ�
	
	private int lastx;//��ɫ���һ�δ洢�����x��������ǰ���ʹ��
	
	private int lasty;//��ɫ���һ�δ洢�����x��������ǰ���ʹ��
	

	public int getLastx() {
		return lastx;
	}

	public void setLastx(int lastx) {
		this.lastx = lastx;
	}

	public int getLasty() {
		return lasty;
	}

	public void setLasty(int lasty) {
		this.lasty = lasty;
	}

	private int targetx; //Ŀ�ĵ����x
	
	private int targety; //Ŀ�ĵ����y




	public int getTargetx() {
		return targetx;
	}

	public void setTargetx(int targetx) {
		this.targetx = targetx;
	}

	public int getTargety() {
		return targety;
	}

	public void setTargety(int targety) {
		this.targety = targety;
	}

	private long lastMotionTime=0;//�ϴ��ƶ�ʱ��
	
	private int initSpeed;//��ʼ���ٶ�
	
	private int camp;//��ǰ��Ӫ
	
	private int initCamp;//��ʼ����Ӫ
	
	private int currMapID;//��ͼ
	
	private int hp;//Ѫ��ֵ
	
	private int mp;//ħ��ֵ
	
	private List<Integer> selectedRoleList=null;//������ѡ�е��б�(����ѡ�д˽�ɫ,�鿴�˽�ɫ��Ϣ[HP,MP],�˽�ɫ��HP,MP�иı�ʱ֪ͨ,����б��е���ҽ�ɫ,������֪������Ϣ�иı�)
	
	private int currSelectRoleId;//��ǰѡ�еĽ�ɫ(����Ϊ���,����ΪNPC)
	
	private int liveStatus = 0;//1 ������2 ��� ,3 ����״̬
	
	private RoleStatus roleStatus = new RoleStatus();//��ɫ���ϵ�״̬
	
	
	
	

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getLastMotionTime() {
		return lastMotionTime;
	}

	public void setLastMotionTime(long lastMotionTime) {
		this.lastMotionTime = lastMotionTime;
	}

	public int getInitSpeed() {
		return initSpeed;
	}

	public void setInitSpeed(int initSpeed) {
		this.initSpeed = initSpeed;
	}

	public RoleStatus getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(RoleStatus roleStatus) {
		this.roleStatus = roleStatus;
	}

	public int getCamp() {
		return camp;
	}

	public void setCamp(int camp) {
		this.camp = camp;
	}

	public int getInitCamp() {
		return initCamp;
	}

	public void setInitCamp(int initCamp) {
		this.initCamp = initCamp;
	}

	public int getCurrMapID() {
		return currMapID;
	}

	public void setCurrMapID(int currMapID) {
		this.currMapID = currMapID;
	}

	public List<Integer> getSelectedRoleList() {
		return selectedRoleList;
	}

	public void setSelectedRoleList(List<Integer> selectedRoleList) {
		this.selectedRoleList = selectedRoleList;
	}

	public int getCurrSelectRoleId() {
		return currSelectRoleId;
	}

	public void setCurrSelectRoleId(int currSelectRoleId) {
		this.currSelectRoleId = currSelectRoleId;
	}

	public int getLiveStatus() {
		return liveStatus;
	}

	public void setLiveStatus(int liveStatus) {
		this.liveStatus = liveStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	

}
