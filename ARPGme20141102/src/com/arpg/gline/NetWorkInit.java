package com.arpg.gline;

import netBase.Manager.BufferManager;
import netBase.Manager.ModuleManager;
import netWork.resolve.send.ListIntSend;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.controller.ControllerModel;
import com.arpg.gline.gameserver.controller.PlayerController;

/**
 *  * 网络层初始化
 * @author 	djl
 * @date	2012-12-24
 */
public class NetWorkInit
{
	private static final Logger log = Logger.getLogger(NetWorkInit.class);
	private NetWorkInit(){}
	private final static NetWorkInit init = new NetWorkInit();	
	public static NetWorkInit getInstance()
	{
		return init;
	}
	
	
	public void init() throws Exception
	{
		log.info("--------->>>>>>>>>��ʼ��������");
		initController();
		log.info("--------->>>>>>>>>��ʼ���������");
		initResolve();
		
/*		initController();
		log.info(">>>>>>>>>>>>>>>>>>初始化控制器");
		initResolve();
		log.info(">>>>>>>>>>>>>>>>>>初始化命令解析");
		//初始化服务项
		NettyServerInit.serverInit(NetWorkConfig.ADDRESS_SERVER_GAME, new ServerPipelineFactory());
		log.info(">>>>>>>>>>>>>>>>>>初始化网络层服务");*/
		
	}
	
	
	/**
	 * 注册Controller
	 * 所有的模块的控制类都注册在map里
	 * @throws Exception 
	 */
	public void initController() throws Exception
	{
		ModuleManager.getInstance().register(ControllerModel.LGMODEL, PlayerController.class);
		//ModuleManager.getInstance().register(ControllerModel.ITEMMODEL, ItemController.class);
		ModuleManager.getInstance().register(ControllerModel.USERMODEL, PlayerController.class);
		//ModuleManager.getInstance().register(ControllerModel.TANKERMODEL, TankerController.class);
		//ModuleManager.getInstance().register(ControllerModel.TANKERMODEL, SenceController.class);
		
		
/*		//ModuleManager.register(key, obj);
		ModuleManager.register(ControllerModel.SCENEMODEL, SceneController.class);
		//ModuleManager.register(ControllerModel.ITEMMODEL, ItemController.class);
		ModuleManager.register(ControllerModel.FIGHTMODEL, FightController.class);
		ModuleManager.register(ControllerModel.DUNGEONMODEL, DungeonController.class);
		ModuleManager.register(ControllerModel.SKILLMODEL, SkillController.class);
		ModuleManager.register(ControllerModel.DROPMODEL, DropController.class);
		ModuleManager.register(ControllerModel.SHOPMODEL, ShopController.class);
		ModuleManager.register(ControllerModel.ITEMMODEL, NItemController.class);
		ModuleManager.register(ControllerModel.MERIDMODEL, MeridController.class);*/
	}
	
	
	
	/**
	 * 注册协议解析
	 * 所有单独的特殊结构的解析，都注册在这里
	 */
	public void initResolve()
	{
		/*ע����յ��Ľ���*/
		//BufferManager.getInstance().registerReceivalbe("listInteger", new ListIntReceive());
				
		/*ע�ᷢ�ͳ�ȥ�Ľ���*/
		BufferManager.getInstance().registerSendable("listInt", new ListIntSend());
		
		
		/*注册接收到的解析*/
/*		BufferManager.newInstance().registerReceivalbe("listInteger", new ListPlayerReceivable());
		BufferManager.newInstance().registerReceivalbe("listnode", new ListNodeReceivable());
		BufferManager.newInstance().registerReceivalbe("listpath", new ListPathReceivable());*/
		/*注册发送出去的解析*/
		/*BufferManager.newInstance().registerSendable("listPlayer", new ListPlayerSendable());
		BufferManager.newInstance().registerSendable("listInt", new ListIntSendable());
		BufferManager.newInstance().registerSendable("listsplayer", new ListSPlayerSendable());
		BufferManager.newInstance().registerSendable("listsnpc", new ListSNpcSendable());
		BufferManager.newInstance().registerSendable("listtest", new ListTestSendable());
		BufferManager.newInstance().registerSendable("listnodes", new ListNodeSenable());
		BufferManager.newInstance().registerSendable("listitemcitem", new ListConItemSendable());
		BufferManager.newInstance().registerSendable("listitemcequip", new ListConEquipSendable());
		BufferManager.newInstance().registerSendable("listat", new ListHarmSendable());
		BufferManager.newInstance().registerSendable("listskill", new ListSkillSendable());
		BufferManager.newInstance().registerSendable("listDungeon", new ListDungeonSendable());
		BufferManager.newInstance().registerSendable("listcquippub", new ListCQuipPubSendable());
		BufferManager.newInstance().registerSendable("listpoints", new ListPointsSendable());
		BufferManager.newInstance().registerSendable("listdm", new ListDropMoneySendable());
		BufferManager.newInstance().registerSendable("listdi", new ListDropItemSendable());
		BufferManager.newInstance().registerSendable("listSnapUp", new ListShopActivitySendable());
		BufferManager.newInstance().registerSendable("listSeckill", new ListShopActivitySendable());*/

	}
	
	
	public void shutDown()
	{
		ModuleManager.getInstance().shutdown();
	}
}