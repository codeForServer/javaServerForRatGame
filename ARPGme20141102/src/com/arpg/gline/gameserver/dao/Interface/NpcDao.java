package com.arpg.gline.gameserver.dao.Interface;

import com.arpg.gline.gameserver.module.npc.entity.NpcEntity;



public interface NpcDao {
	

	//List<NpcEntity> search(Map<String,Object> map);
	
	NpcEntity get(int npc_id);
	
	void save(NpcEntity n);
	
	//void delete(String p);
	
	//void edit(NpcEntity v);
	
}
