
package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;

	public class LoginProxy 
	{
		/**
        *推送
        *Client
		*	count 
		*	Name:count		TYPE:String		SIZE:20
		*	 
		*	Name:password		TYPE:String		SIZE:20
        */
        public final static int CG_Login = 100;
		/**
        *接收
        *Client
		*	角色名字 
		*	Name:rolename		TYPE:String		SIZE:8
        */
        public final static int CG_CreateRole = 101;
		/**
        *返回
        *Server
		*	登陆错误码返回 
		*	Name:result		TYPE:int		SIZE:4
        */
        public final static int GC_LoginBack = 102;
		/**
        *返回
        *Server
		*	账号ID 
		*	Name:accountId		TYPE:long		SIZE:8
		*	登陆来源类型 
		*	Name:Type		TYPE:short		SIZE:2
		*	登陆平台返回数据 
		*	Name:value		TYPE:String		SIZE:100
		*	最近登陆服务器ID 
		*	Name:lastServer		TYPE:short		SIZE:2
		*	服务器列表 
		*	Name:serversList		TYPE:listservers		SIZE:2
        */
        public final static int GC_LOGIN = 104;
		/**
        *接收
        *Client
		*	服务器ID 
		*	Name:id		TYPE:short		SIZE:2
        */
        public final static int CG_SERVER_ID = 105;
		/**
        *返回
        *Server
		*	服务器ID 
		*	Name:serverId		TYPE:short		SIZE:2
		*	服务器IP 
		*	Name:ip		TYPE:String		SIZE:20
		*	服务器端口 
		*	Name:port		TYPE:short		SIZE:2
		*	秘钥1 
		*	Name:key1		TYPE:int		SIZE:4
		*	秘钥2 
		*	Name:key2		TYPE:int		SIZE:4
        */
        public final static int GC_SERVER_ID = 106;

		
		public static List<CommandModel> DATA_MODE()
        {
        	List<CommandModel> list = new ArrayList<CommandModel>();
            CommandModel model= null;
            CommandInfoModel [] infoArray=null;
			model = new CommandModel(100,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("count", "String", 20),new CommandInfoModel("password", "String", 20)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(101,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("rolename", "String", 8)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(102,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("result", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(104,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("accountId", "long", 8),new CommandInfoModel("Type", "short", 2),new CommandInfoModel("value", "String", 100),new CommandInfoModel("lastServer", "short", 2),new CommandInfoModel("serversList", "listservers", 2, new CommandInfoModel[]{new CommandInfoModel("serverId", "short", 2),new CommandInfoModel("name", "string", 8),new CommandInfoModel("nop", "int", 4),new CommandInfoModel("max", "int", 4)})};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(105,"Client");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("id", "short", 2)};
			model.setCommandInfoModel(infoArray);
			list.add(model);
			model = new CommandModel(106,"Server");
			infoArray = new CommandInfoModel[]{new CommandInfoModel("serverId", "short", 2),new CommandInfoModel("ip", "String", 20),new CommandInfoModel("port", "short", 2),new CommandInfoModel("key1", "int", 4),new CommandInfoModel("key2", "int", 4)};
			model.setCommandInfoModel(infoArray);
			list.add(model);

        	return list;
        }
	
	}
