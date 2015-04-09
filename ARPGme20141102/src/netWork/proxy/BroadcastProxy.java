
package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;

	public class BroadcastProxy 
	{
		/**
        *请求
        *Client
		*	播报主键ID 
		*	Name:bcGuid		TYPE:int		SIZE:4
        */
        public final static int CG_BROADCAST_LOCK = 6556;
		/**
        *返回
        *Server
		*	播报主键ID 
		*	Name:bcGuid		TYPE:int		SIZE:4
        */
        public final static int GC_BROADCAST_LOCK = 6557;
		/**
        *请求
        *Client
        */
        public final static int CG_BROADCAST_LIST = 6558;
		/**
        *返回
        *Server
		*	锁定播报集合 
		*	Name:broadcastList		TYPE:listBroadcast		SIZE:2
        */
        public final static int GC_BROADCAST_LIST = 6559;
		/**
        *请求
        *Client
		*	播报主键ID 
		*	Name:bcGuid		TYPE:int		SIZE:4
		*	评价类型 
		*	Name:bcType		TYPE:byte		SIZE:1
        */
        public final static int CG_BROADCAST_DISPOSE_LOCK = 6560;
		/**
        *返回
        *Server
		*	播报主键ID 
		*	Name:bcGuid		TYPE:int		SIZE:4
		*	钻石数量 
		*	Name:diamond		TYPE:int		SIZE:4
        */
        public final static int GC_BROADCAST_DISPOSE_LOCK = 6561;

		
		public static List<CommandModel> DATA_MODE()
        {
        	List<CommandModel> list = new ArrayList<CommandModel>();
            CommandModel model= null;
            CommandInfoModel [] infoArray=null;
			model = new CommandModel(6556,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("bcGuid", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6557,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("bcGuid", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6558,"Client");
			infoArray = new CommandInfoModel[]{};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6559,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("broadcastList", "listBroadcast", 2, new CommandInfoModel[]{new CommandInfoModel("bcGuid", "int", 4),new CommandInfoModel("rankModelId", "int", 4),new CommandInfoModel("playerId", "long", 8),new CommandInfoModel("playerName", "string", 40),new CommandInfoModel("country", "byte", 1),new CommandInfoModel("generalModelId", "int", 4),new CommandInfoModel("broadcastContent", "string", 70),new CommandInfoModel("createTime", "long", 8)})};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6560,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("bcGuid", "int", 4),new CommandInfoModel("bcType", "byte", 1)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(6561,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("bcGuid", "int", 4),new CommandInfoModel("diamond", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);

        	return list;
        }
	
	}
