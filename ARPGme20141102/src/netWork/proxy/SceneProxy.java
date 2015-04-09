
package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;

	public class SceneProxy 
	{
		/**
        *接收
        *Client
		*	场景可视对象ID 
		*	Name:visualId		TYPE:int		SIZE:4
		*	当前x 
		*	Name:currentX		TYPE:float		SIZE:4
		*	当前y 
		*	Name:currentY		TYPE:float		SIZE:4
		*	目标x 
		*	Name:targetX		TYPE:float		SIZE:4
		*	目标y 
		*	Name:targetY		TYPE:float		SIZE:4
        */
        public final static int CG_MOVE = 1001;
		/**
        *推送
        *Server
		*	场景可视对象ID 
		*	Name:visualId		TYPE:int		SIZE:4
		*	开始移动时间 
		*	Name:moveTime		TYPE:long		SIZE:8
		*	当前x 
		*	Name:currentX		TYPE:float		SIZE:4
		*	当前y 
		*	Name:currentY		TYPE:float		SIZE:4
		*	目标x 
		*	Name:targetX		TYPE:float		SIZE:4
		*	目标y 
		*	Name:targetY		TYPE:float		SIZE:4
        */
        public final static int GC_MOVE = 1002;
		/**
        *接收
        *Client
		*	场景可视对象ID 
		*	Name:visualId		TYPE:int		SIZE:4
		*	当前x 
		*	Name:currentX		TYPE:float		SIZE:4
		*	当前y 
		*	Name:currentY		TYPE:float		SIZE:4
        */
        public final static int CG_STOP = 1003;
		/**
        *推送
        *Server
		*	场景可视对象ID 
		*	Name:visualId		TYPE:int		SIZE:4
		*	当前x 
		*	Name:currentX		TYPE:float		SIZE:4
		*	当前y 
		*	Name:currentY		TYPE:float		SIZE:4
        */
        public final static int GC_STOP = 1004;
		/**
        *推送
        *Server
		*	场景可视对象ID 
		*	Name:visualId		TYPE:int		SIZE:4
        */
        public final static int GC_DELETE_VISUAL = 1005;
		/**
        *推送
        *Server
		*	场景可视对象ID(唯一) 
		*	Name:visualId		TYPE:int		SIZE:4
		*	控制对象ID 
		*	Name:controlId		TYPE:int		SIZE:4
		*	部队原形ID 
		*	Name:troopBaseId		TYPE:int		SIZE:4
		*	当前x 
		*	Name:x		TYPE:float		SIZE:4
		*	当前y 
		*	Name:y		TYPE:float		SIZE:4
		*	目标x 
		*	Name:targetX		TYPE:float		SIZE:4
		*	目标y 
		*	Name:targetY		TYPE:float		SIZE:4
		*	移动时间 
		*	Name:moveTime		TYPE:long		SIZE:8
		*	血量 
		*	Name:hp		TYPE:int		SIZE:4
		*	部队战斗属性 
		*	Name:troopAttrList		TYPE:listTroopAttrs		SIZE:2
		*	Buff列表 
		*	Name:buffList		TYPE:listBuff		SIZE:2
        */
        public final static int GC_ADD_TROOP = 1006;
		/**
        *推送
        *Server
		*	场景可视对象ID(唯一) 
		*	Name:visualId		TYPE:int		SIZE:4
		*	控制对象ID 
		*	Name:controlId		TYPE:int		SIZE:4
		*	可视对象模型ID 
		*	Name:visualModelId		TYPE:int		SIZE:4
		*	当前x 
		*	Name:x		TYPE:float		SIZE:4
		*	当前y 
		*	Name:y		TYPE:float		SIZE:4
        */
        public final static int GC_ADD_SCENE_SKILL = 1014;

		
		public static List<CommandModel> DATA_MODE()
        {
        	List<CommandModel> list = new ArrayList<CommandModel>();
            CommandModel model= null;
            CommandInfoModel [] infoArray=null;
			model = new CommandModel(1001,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("visualId", "int", 4),new CommandInfoModel("currentX", "float", 4),new CommandInfoModel("currentY", "float", 4),new CommandInfoModel("targetX", "float", 4),new CommandInfoModel("targetY", "float", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(1002,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("visualId", "int", 4),new CommandInfoModel("moveTime", "long", 8),new CommandInfoModel("currentX", "float", 4),new CommandInfoModel("currentY", "float", 4),new CommandInfoModel("targetX", "float", 4),new CommandInfoModel("targetY", "float", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(1003,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("visualId", "int", 4),new CommandInfoModel("currentX", "float", 4),new CommandInfoModel("currentY", "float", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(1004,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("visualId", "int", 4),new CommandInfoModel("currentX", "float", 4),new CommandInfoModel("currentY", "float", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(1005,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("visualId", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(1006,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("visualId", "int", 4),new CommandInfoModel("controlId", "int", 4),new CommandInfoModel("troopBaseId", "int", 4),new CommandInfoModel("x", "float", 4),new CommandInfoModel("y", "float", 4),new CommandInfoModel("targetX", "float", 4),new CommandInfoModel("targetY", "float", 4),new CommandInfoModel("moveTime", "long", 8),new CommandInfoModel("hp", "int", 4),new CommandInfoModel("troopAttrList", "listTroopAttrs", 2, new CommandInfoModel[]{new CommandInfoModel("attrId", "short", 2),new CommandInfoModel("attrValue", "int", 4)}),new CommandInfoModel("buffList", "listBuff", 2, new CommandInfoModel[]{new CommandInfoModel("attackId", "int", 4),new CommandInfoModel("effectId", "int", 4),new CommandInfoModel("effectModelId", "int", 4),new CommandInfoModel("beginTime", "long", 8),new CommandInfoModel("endTime", "long", 8)})};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(1014,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("visualId", "int", 4),new CommandInfoModel("controlId", "int", 4),new CommandInfoModel("visualModelId", "int", 4),new CommandInfoModel("x", "float", 4),new CommandInfoModel("y", "float", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);

        	return list;
        }
	
	}
