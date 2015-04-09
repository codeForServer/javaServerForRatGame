package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;


     public class FightProxy
     {
       /**
        *接收
        *Client
        * 参数
        *
        *     目标ID
        *     Name:t_id     TYPE:'double     SIZE:8
        *     目标类型
        *     Name:t_type     TYPE:'byte     SIZE:1
        *     技能ID
        *     Name:id     TYPE:'int     SIZE:4
        *     选中的X坐标
        *     Name:p_x     TYPE:'short     SIZE:2
        *     选中的Y坐标
        *     Name:p_y     TYPE:'short     SIZE:2
        *     攻击类型
        *     Name:a_type     TYPE:'byte     SIZE:1
       **/
        public final static int CG_CAST_SKILL=1000;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_CAST_SKILL=1001;
       /**
        *推送
        *Server
        * 参数
        *
        *     施放技能的玩家或NPC的ID
        *     Name:playerId     TYPE:'long     SIZE:8
        *     施放技能的
        *     Name:p_type     TYPE:'byte     SIZE:1
        *     技能原型ID
        *     Name:s_id     TYPE:'int     SIZE:4
        *     目标ID
        *     Name:t_id     TYPE:'long     SIZE:8
        *     目标类型
        *     Name:t_type     TYPE:'byte     SIZE:1
        *     伤害值
        *     Name:harm     TYPE:'int     SIZE:4
        *     是否命中
        *     Name:miss     TYPE:'byte     SIZE:1
        *     是否暴击或则格挡
        *     Name:b_c     TYPE:'byte     SIZE:1
       **/
        public final static int GC_SINGLE_SKILL=1002;
       /**
        *推送
        *Server
        * 参数
        *
        *     施放者的技能ID
        *     Name:playerId     TYPE:'long     SIZE:8
        *     施放者的类型
        *     Name:p_type     TYPE:'byte     SIZE:1
        *     技能原型ID
        *     Name:s_id     TYPE:'int     SIZE:4
        *     目标点的X坐标
        *     Name:p_x     TYPE:'short     SIZE:2
        *     目标点的Y坐标
        *     Name:p_y     TYPE:'short     SIZE:2
        *     Java List to AS Array
        *     Name:list     TYPE:'listat     SIZE:2
       **/
        public final static int GC_GROUP_SKILL=1003;
       /**
        *推送
        *Server
        * 参数
        *
        *     玩家当前的战斗状态
        *     Name:state     TYPE:'byte     SIZE:1
       **/
        public final static int GC_FIGHT_STATE=1004;

        public static List<CommandModel> DATA_MODE()
         {
                List<CommandModel> list=new ArrayList<CommandModel>();
                CommandModel model= null;
                CommandInfoModel [] infoArray=null;
                  model     =new CommandModel(1000,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("t_id","double",8),new CommandInfoModel("t_type","byte",1),new CommandInfoModel("id","int",4),new CommandInfoModel("p_x","short",2),new CommandInfoModel("p_y","short",2),new CommandInfoModel("a_type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1001,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1002,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("playerId","long",8),new CommandInfoModel("p_type","byte",1),new CommandInfoModel("s_id","int",4),new CommandInfoModel("t_id","long",8),new CommandInfoModel("t_type","byte",1),new CommandInfoModel("harm","int",4),new CommandInfoModel("miss","byte",1),new CommandInfoModel("b_c","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1003,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("playerId","long",8),new CommandInfoModel("p_type","byte",1),new CommandInfoModel("s_id","int",4),new CommandInfoModel("p_x","short",2),new CommandInfoModel("p_y","short",2),new CommandInfoModel("list","listat",2,new CommandInfoModel[]{new CommandInfoModel("t_id","long",8),new CommandInfoModel("t_t","byte",1),new CommandInfoModel("harm","int",4),new CommandInfoModel("miss","byte",1),new CommandInfoModel("b_c","byte",1)})};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1004,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("state","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
              return list;
         }
      }
