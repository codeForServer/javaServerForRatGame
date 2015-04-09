package com.arpg.gline.gameserver.module.npc.entity;


/**
 * ʵ��
 */
public class NpcEntity //extends NpcBaseEntity 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int npc_id;
	
	public int newid;
	
	@SuppressWarnings("unused")
	private int liveStatus;
	
	public int getNpc_id() {
		return npc_id;
	}

	public void setNpc_id(int npc_id) {
		this.npc_id = npc_id;
	}


}

