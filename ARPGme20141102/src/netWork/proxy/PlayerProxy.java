package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;

	public class PlayerProxy 
	{
		/**
        *推送
        *Server
		*	当前时间 
		*	Name:serverTime		TYPE:long		SIZE:8
        */
        public final static int GC_HEART = 100;
		/**
        *推送
        *Server
		*	角色列表 
		*	Name:choseRoles		TYPE:listRole		SIZE:2
        */
        public final static int GC_PLAYERS = 103;
		/**
        *请求创建角色
        *Client
		*	角色名称 
		*	Name:playerName		TYPE:String		SIZE:20
		*	国家 
		*	Name:country		TYPE:byte		SIZE:1
		*	头像名称 
		*	Name:icon		TYPE:byte		SIZE:1
		*	性别 
		*	Name:sex		TYPE:byte		SIZE:1
        */
        public final static int CG_CREATE = 104;
		/**
        *返回创建角色
        *Server
		*	角色ID 
		*	Name:playerId		TYPE:long		SIZE:8
		*	角色名称 
		*	Name:playerName		TYPE:String		SIZE:20
		*	国家 
		*	Name:country		TYPE:byte		SIZE:1
		*	头像名称 
		*	Name:icon		TYPE:byte		SIZE:1
		*	性别 
		*	Name:sex		TYPE:byte		SIZE:1
        */
        public final static int GC_CREATE = 105;
		/**
        *接收
        *Client
		*	角色ID 
		*	Name:playerId		TYPE:long		SIZE:8
        */
        public final static int CG_DELETE = 106;
		/**
        *返回
        *Server
		*	角色ID 
		*	Name:playerId		TYPE:long		SIZE:8
        */
        public final static int GC_DELETE = 107;
		/**
        *接收
        *Client
		*	账号ID 
		*	Name:accountId		TYPE:long		SIZE:8
		*	角色ID 
		*	Name:playerId		TYPE:long		SIZE:8
        */
        public final static int CG_LOGIN = 108;
		/**
        *返回所选择的角色的所有信息
        *Server
		*	角色ID 
		*	Name:playerId		TYPE:long		SIZE:8
		*	角色名称 
		*	Name:playerName		TYPE:String		SIZE:20
		*	国家 
		*	Name:country		TYPE:byte		SIZE:1
		*	科技点 
		*	Name:sp		TYPE:int		SIZE:4
		*	银币 
		*	Name:silver		TYPE:int		SIZE:4
		*	金币 
		*	Name:gold		TYPE:int		SIZE:4
		*	帮派ID 
		*	Name:gangId		TYPE:int		SIZE:4
		*	帮派名称 
		*	Name:gangName		TYPE:String		SIZE:20
		*	服务器号 
		*	Name:server		TYPE:int		SIZE:4
		*	基础分 
		*	Name:basis		TYPE:int		SIZE:4
        */
        public final static int GC_LOGIN = 109;
		/**
        *下线
        *Server
		*	下线类型 
		*	Name:downType		TYPE:byte		SIZE:1
        */
        public final static int GC_GS_DOWN = 110;
		/**
        *更新金币数量
        *Server
		*	金币值 
		*	Name:gold		TYPE:int		SIZE:4
		*	来源类型 
		*	Name:sourceType		TYPE:short		SIZE:2
        */
        public final static int GC_UPDATE_GOLD = 111;
		/**
        *更新钻石数量
        *Server
		*	钻石值 
		*	Name:diamond		TYPE:int		SIZE:4
		*	来源类型 
		*	Name:sourceType		TYPE:short		SIZE:2
        */
        public final static int GC_UPDATE_DIAMOND = 112;
		/**
        *推送
        *Server
		*	基础分 
		*	Name:basis		TYPE:int		SIZE:4
        */
        public final static int GC_BASIS = 113;

		
		public static List<CommandModel> DATA_MODE()
        {
        	List<CommandModel> list = new ArrayList<CommandModel>();
            CommandModel model= null;
            CommandInfoModel [] infoArray=null;
			model = new CommandModel(100,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("serverTime", "long", 8)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(103,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("choseRoles", "listRole", 2, new CommandInfoModel[]{new CommandInfoModel("playerId", "long", 8),new CommandInfoModel("playerName", "String", 20),new CommandInfoModel("country", "byte", 1),new CommandInfoModel("icon", "byte", 1),new CommandInfoModel("iconUrl", "String", 30),new CommandInfoModel("sex", "byte", 1)})};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(104,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("playerName", "String", 20),new CommandInfoModel("country", "byte", 1),new CommandInfoModel("icon", "byte", 1),new CommandInfoModel("sex", "byte", 1)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(105,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("playerId", "long", 8),new CommandInfoModel("playerName", "String", 20),new CommandInfoModel("country", "byte", 1),new CommandInfoModel("icon", "byte", 1),new CommandInfoModel("sex", "byte", 1)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(106,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("playerId", "long", 8)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(107,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("playerId", "long", 8)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(108,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("accountId", "long", 8),new CommandInfoModel("playerId", "long", 8)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(109,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("playerId", "long", 8),new CommandInfoModel("playerName", "String", 20),new CommandInfoModel("country", "byte", 1),new CommandInfoModel("sp", "int", 4),new CommandInfoModel("silver", "int", 4),new CommandInfoModel("gold", "int", 4),new CommandInfoModel("gangId", "int", 4),new CommandInfoModel("gangName", "String", 20),new CommandInfoModel("server", "int", 4),new CommandInfoModel("basis", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(110,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("downType", "byte", 1)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(111,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("gold", "int", 4),new CommandInfoModel("sourceType", "short", 2)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(112,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("diamond", "int", 4),new CommandInfoModel("sourceType", "short", 2)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(113,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("basis", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);

        	return list;
        }
	
	}
