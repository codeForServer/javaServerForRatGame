package com.arpg.gline.core.ai.entity;

/**
 * NPC刷新点实体
 * @author du'xiang
 *
 */
public class NpcBornEntity 
{
	private int mapId;//地图ID
	
	private int npcId;//怪物ID
	
	private int number;//刷新点数量
	
	private int x;//刷新点X坐标
	
	private int y;//刷新点Y坐标

	public int getMapId() {
		return mapId;
	}

	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	public int getNpcId() {
		return npcId;
	}

	public void setNpcId(int npcId) {
		this.npcId = npcId;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
