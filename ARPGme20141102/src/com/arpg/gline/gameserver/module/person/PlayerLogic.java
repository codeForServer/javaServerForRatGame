package com.arpg.gline.gameserver.module.person;

import netBase.World;
import netBase.util.GameClient;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.config.ErrorEnum;
import com.arpg.gline.gameserver.controller.PlayerController;
import com.arpg.gline.gameserver.dao.PlayerDaoService;
import com.arpg.gline.gameserver.message.PlayerMessage;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;


public class PlayerLogic {
	
	private PlayerLogic(){}	
	public static PlayerLogic newInstance()
	{
		return SingletonHolder.instance;
	}
	private static class SingletonHolder
	{
		protected static final PlayerLogic instance = new PlayerLogic();
	}
		
	private static final Logger log = Logger.getLogger(PlayerLogic.class);
	
	
	/**
	 * 创建角色
	 */
	public int createPlayer(GameClient client,int roleId, String name, byte sex, byte profession)throws Exception
	{		
		PlayerDaoService  roleDao = new PlayerDaoService();
		
		if(name.length() > 14)
		{
			log.info(ErrorEnum.ERROR1.getExplain());
			return ErrorEnum.ERROR1.getIndex();
		}
			
		//if(sex != PlayerConfig.SEX_MAN && sex != PlayerConfig.SEX_WOMAN)
		{
			//return ErrorEnum.ERROR2.getIndex();
		}
				
		//if(profession != PlayerConfig.POPSINGER_ZS && profession != PlayerConfig.POPSINGER_FS && profession != PlayerConfig.POPSINGER_GJS)
		{
			//return ErrorEnum.ERROR3.getIndex();
		}
		
		if(roleDao.checkName(name) == false)
		{
			log.info(ErrorEnum.ERROR4.getExplain()+"--"+name);
			return ErrorEnum.ERROR4.getIndex();
		}
		
		/*if(roleDao.insertPlayer(sex, job, countId, name) == false)
		{
			return ErrorEnum.ERROR4.getIndex();
		}
		*/
		
		PlayerEntity player = new PlayerEntity();
		player.setRoleId(roleId);
		player.setName(name);
		player.setSexy(sex);
		player.setProfession(profession);
		
		roleDao.save(player);
		
		return ErrorEnum.ERROR0.getIndex();
	}
	
	/**
	 * 玩家登陆
	 */
	public  PlayerEntity loadLine(GameClient client,String count, String password) throws Exception
	{
		//当数据库不开启时，暂时的替代代码
		PlayerMessage.GC_LoginBack(client,  100,  null);
		
		log.info("login successfully");
		
		//广播位置
		PlayerController.broadcast(client,10, 10);
		
		return null;	
		
		
		/*Map<String,Object> map = new HashMap<String,Object>();
		PlayerEntity player;
		map.put("count", count);
		map.put("password", password);
		
		List<PlayerEntity> roles =new PlayerDaoService().search(map);
		
		int error =0;
		
		if(roles == null)
		{
			log.info("roles null");
			//ֱ�ӳ��Դ����˺�
		  
			return null;
		}
		if(roles.size()<1)
		{	
			log.info("roles.size()<1");

		    error = createPlayer(client, 2587366, "343253", (byte)0, (byte)0);
		    
		    if(error==0)
		    {
		    	log.info("role is null beforetime, and role is created successfully");

		    	roles =new PlayerDaoService().search(map);
		    }
		    else
		    {
		    	log.info("role is null beforetime, but role is created fail");

				PlayerMessage.GC_LoginBack(client,  error,  null);
		    	return null;
		    }
		}
		
			
		player = roles.get(0);
		if(player ==null)
		{
			log.info("player ==null");

			PlayerMessage.GC_LoginBack(client,  error,  player);
			return null;
		}
		
		
		player.setLastOnTime(System.currentTimeMillis()/1000);
		
		player.setClient(client);
		client.setPlayer(player);
		
		PlayerMessage.GC_LoginBack(client,  error,  player);
		
		log.info("login successfully");
		
		return player;	*/
	}
	
	/**
	 * 下线
	 */
	public  void downLine(PlayerEntity player) throws Exception
	{
		
		//TODO:�������ұ������ߣ��� ֪ͨ��ͻ��ˣ�������ұ�T���ߣ����������ִ�������䡣
		//SendManager.sendInitClient(Client, );
		
		player.setLastDownTime(System.currentTimeMillis()/1000);
		
		PlayerDaoService  roleDao = new PlayerDaoService();		
		roleDao.save(player);
		
		GameClient client = player.getClient();		

		World.newInstance().removeConnection(client.getChannel().getId());		

		client.getChannel().close();
		
	}
	
	/**
	 * 第一次登陆后，将用户实体与client绑定
	 * @param countId
	 * @param channelId
	 * @param id
	 */
	public GameClient createClient(String countId,int channelId,PlayerEntity player)
	{
		GameClient game = World.newInstance().getChannel(channelId);
		
		game.setPlayer(player);
		
		return game;
	}
	
	
}
