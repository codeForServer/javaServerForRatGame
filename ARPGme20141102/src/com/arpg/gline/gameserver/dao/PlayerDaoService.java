package com.arpg.gline.gameserver.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import mybatis.SessionFactory;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.dao.Interface.PlayerDao;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;


public class PlayerDaoService {
	
	Logger log = Logger.getLogger(PlayerDaoService.class);

	private PlayerDao mapper;	
	private SqlSession session;


	public List<PlayerEntity> search(Map<String,Object> map)throws Exception  {
					
		session = SessionFactory.getDB();
		
		PlayerDao mapper = session.getMapper(PlayerDao.class);
		List<PlayerEntity> plist = mapper.search(map);
		
		session.close();
		
		return  plist;
	}



  public PlayerEntity getByName(String name) throws Exception {
		
		session = SessionFactory.getDB();			
		mapper = session.getMapper(PlayerDao.class);
		PlayerEntity npc = mapper.getByName(name);
		
		session.close();
		return  npc;
	}
	
	
	public PlayerEntity get(int id) throws Exception {
		
		session = SessionFactory.getDB();			
		mapper = session.getMapper(PlayerDao.class);
		PlayerEntity npc = mapper.get(id);
		
		session.close();
		return  npc;
	}

	
	public Boolean checkName(String name) throws Exception {
			
		if (getByName(name)==null)
			return true;
		else
			return false;
	}
	
	
	public void save(PlayerEntity role) throws Exception {
		
		session = SessionFactory.getDB();
		mapper = session.getMapper(PlayerDao.class);
		mapper.save(role);
		session.commit();
	}

	/*public void delete(String p) {

		this.VirusMybatisRepository.delete(p);
	}

	public void edit(NpcEntity v) {

		this.VirusMybatisRepository.edit(v);
	}*/


}
