package com.arpg.gline.gameserver.dao.Interface;

import java.util.List;
import java.util.Map;

import com.arpg.gline.gameserver.module.Player.GamPlayer;

//�û�
public  interface GamePlayerDao {

	List<GamPlayer> search(Map<String,Object> map);
	
	GamPlayer get(int id);
	
	void save(GamPlayer n);
	
	//void delete(String p);
	
	//void edit(NpcEntity v);
	

}
