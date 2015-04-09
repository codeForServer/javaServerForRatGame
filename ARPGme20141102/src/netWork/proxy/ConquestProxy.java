
package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;

	public class ConquestProxy 
	{
		/**
        *请求
        *Client
        */
        public final static int CG_CONQUEST_INFO = 6001;
		/**
        *返回
        *Server
		*	基础分 
		*	Name:basis		TYPE:int		SIZE:4
		*	主将ID 
		*	Name:generalId		TYPE:int		SIZE:4
		*	国家胜点列表 
		*	Name:winPointList		TYPE:listWinPoint		SIZE:2
        */
        public final static int GC_CONQUEST_INFO = 6002;
		/**
        *请求
        *Client
		*	主将ID 
		*	Name:generalId		TYPE:int		SIZE:4
		*	援军ID 
		*	Name:succorId		TYPE:long		SIZE:8
		*	援军技能动态ID 
		*	Name:reliefId		TYPE:int		SIZE:4
		*	对战国家集合 
		*	Name:countryList		TYPE:listCountry		SIZE:2
        */
        public final static int CG_ADD_MATCH = 6003;
		/**
        *返回
        *Server
        */
        public final static int GC_MATCH = 6004;
		/**
        *请求
        *Client
        */
        public final static int CG_REMOVE_MATCH = 6005;
		/**
        *返回
        *Server
        */
        public final static int GC_REMOVE_MATCH = 6006;
		/**
        *请求
        *Client
		*	竞技宝箱类型ID 
		*	Name:chestId		TYPE:byte		SIZE:1
        */
        public final static int CG_CHEST = 6007;
		/**
        *返回
        *Server
		*	竞技宝箱类型ID 
		*	Name:chestId		TYPE:byte		SIZE:1
        */
        public final static int GC_CHEST = 6008;
		/**
        *请求
        *Client
        */
        public final static int CG_BONUS = 6009;
		/**
        *返回
        *Server
        */
        public final static int GC_BONUS = 6010;
		/**
        *推送
        *Server
		*	预估奖励列表 
		*	Name:bonusList		TYPE:listBonus		SIZE:2
        */
        public final static int GC_UPDATE_BONUS = 6011;
		/**
        *推送
        *Server
		*	倍数下标 
		*	Name:times		TYPE:short		SIZE:2
        */
        public final static int GC_AWARD_TIMES = 6012;
		/**
        *推送
        *Server
		*	国家胜点列表 
		*	Name:winPointList		TYPE:listWinPoint		SIZE:2
        */
        public final static int GC_WIN_POINT = 6013;
		/**
        *推送
        *Server
		*	基础分, 段位分 
		*	Name:basis		TYPE:int		SIZE:4
		*	角色名称 
		*	Name:playerName		TYPE:String		SIZE:20
		*	角色头像ID 
		*	Name:icon		TYPE:short		SIZE:2
		*	角色头像路径(预留) 
		*	Name:iconUrl		TYPE:String		SIZE:30
		*	主将原型ID 
		*	Name:generalModelId		TYPE:int		SIZE:4
        */
        public final static int GC_OPPONENT_INFO = 6014;
		/**
        *推送
        *Server
        */
        public final static int GC_START_PVP = 6015;

		
		public static List<CommandModel> DATA_MODE()
        {
        	List<CommandModel> list = new ArrayList<CommandModel>();
            CommandModel model= null;
            CommandInfoModel [] infoArray=null;
			model = new CommandModel(6001,"Client");
			infoArray = new CommandInfoModel[]{};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6002,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("basis", "int", 4),new CommandInfoModel("generalId", "int", 4),new CommandInfoModel("winPointList", "listWinPoint", 2, new CommandInfoModel[]{new CommandInfoModel("countryId", "byte", 1),new CommandInfoModel("winPoint", "short", 2)})};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6003,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("generalId", "int", 4),new CommandInfoModel("succorId", "long", 8),new CommandInfoModel("reliefId", "int", 4),new CommandInfoModel("countryList", "listCountry", 2, new CommandInfoModel[]{new CommandInfoModel("countryId", "byte", 1)})};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6004,"Server");
			infoArray = new CommandInfoModel[]{};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6005,"Client");
			infoArray = new CommandInfoModel[]{};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6006,"Server");
			infoArray = new CommandInfoModel[]{};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6007,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("chestId", "byte", 1)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6008,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("chestId", "byte", 1)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6009,"Client");
			infoArray = new CommandInfoModel[]{};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6010,"Server");
			infoArray = new CommandInfoModel[]{};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6011,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("bonusList", "listBonus", 2, new CommandInfoModel[]{new CommandInfoModel("bonusId", "byte", 1)})};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6012,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("times", "short", 2)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6013,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("winPointList", "listWinPoint", 2, new CommandInfoModel[]{new CommandInfoModel("countryId", "byte", 1),new CommandInfoModel("winPoint", "short", 2)})};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6014,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("basis", "int", 4),new CommandInfoModel("playerName", "String", 20),new CommandInfoModel("icon", "short", 2),new CommandInfoModel("iconUrl", "String", 30),new CommandInfoModel("generalModelId", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6015,"Server");
			infoArray = new CommandInfoModel[]{};
			model.setCommandInfoModel(infoArray);
			list.add(model);

        	return list;
        }
	
	}
