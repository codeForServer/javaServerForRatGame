package netWork.proxy;
import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;


     public class DropProxy
     {
       /**
        *接收
        *Client
        * 参数
        *
        *     掉落id
        *     Name:id     TYPE:'int     SIZE:4
       **/
        public final static int CG_PICK_UP=1001;
       /**
        *返回
        *Server
        * 参数
        *
        *     掉落id
        *     Name:id     TYPE:'int     SIZE:4
       **/
        public final static int GC_PICK_UP=1002;
       /**
        *推送
        *Server
        * 参数
        *
        *     掉落id
        *     Name:id     TYPE:'int     SIZE:4
       **/
        public final static int GC_DESTROY=1003;
       /**
        *推送
        *Server
        * 参数
        *
        *     掉落id
        *     Name:id     TYPE:'int     SIZE:4
        *     x坐标
        *     Name:x     TYPE:'short     SIZE:2
        *     y坐标
        *     Name:y     TYPE:'short     SIZE:2
        *     金钱类型
        *     Name:type     TYPE:'byte     SIZE:1
        *     金钱数量
        *     Name:count     TYPE:'int     SIZE:4
       **/
        public final static int GC_ADD_MONEY=1004;
       /**
        *推送
        *Server
        * 参数
        *
        *     掉落id
        *     Name:id     TYPE:'int     SIZE:4
        *     x坐标
        *     Name:x     TYPE:'short     SIZE:2
        *     y坐标
        *     Name:y     TYPE:'short     SIZE:2
        *     道具原型id
        *     Name:itemPId     TYPE:'int     SIZE:4
        *     数量
        *     Name:count     TYPE:'int     SIZE:4
       **/
        public final static int GC_ADD_ITEM=1005;
       /**
        *推送
        *Server
        * 参数
        *
        *     Java List to AS Array
        *     Name:m_list     TYPE:'listdm     SIZE:6
        *     Java List to AS Array
        *     Name:i_list     TYPE:'listdi     SIZE:6
       **/
        public final static int GC_GET_ALL=1006;

        public static List<CommandModel> DATA_MODE()
         {
                List<CommandModel> list=new ArrayList<CommandModel>();
                CommandModel model= null;
                CommandInfoModel [] infoArray=null;
                  model     =new CommandModel(1001,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1002,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1003,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1004,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("x","short",2),new CommandInfoModel("y","short",2),new CommandInfoModel("type","byte",1),new CommandInfoModel("count","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1005,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("x","short",2),new CommandInfoModel("y","short",2),new CommandInfoModel("itemPId","int",4),new CommandInfoModel("count","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1006,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("m_list","listdm",6,new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("x","short",2),new CommandInfoModel("y","short",2),new CommandInfoModel("type","byte",1),new CommandInfoModel("count","int",4)}),new CommandInfoModel("i_list","listdi",6,new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("x","short",2),new CommandInfoModel("y","short",2),new CommandInfoModel("itemPId","int",4),new CommandInfoModel("count","int",4)})};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
              return list;
         }
      }
