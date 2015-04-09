package com.arpg.gline.gameserver.dao;



import mybatis.SessionFactory;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.dao.Interface.NpcDao;
import com.arpg.gline.gameserver.module.npc.entity.NpcEntity;


public class NpcDaoService {

	Logger log = Logger.getLogger(NpcDaoService.class);

	/*private NpcMap VirusMybatisRepository;*/

/*	public List<NpcEntity> search(Map map) {
		
		

		return this.VirusMybatisRepository.search(map);
	}*/

	/**
	 * 
	 */
	public NpcEntity get(int id) throws Exception {
		
		SqlSession session = SessionFactory.getDB();
	
		NpcDao mapper = session.getMapper(NpcDao.class);
		NpcEntity npc = mapper.get(id);
		
		session.close();
		
		

		return  npc;
	}

/*	public void save(NpcEntity virusDestroy) {

		this.VirusMybatisRepository.save(virusDestroy);
	}

	public void delete(String p) {

		this.VirusMybatisRepository.delete(p);
	}

	public void edit(NpcEntity v) {

		this.VirusMybatisRepository.edit(v);
	}
*/
}
