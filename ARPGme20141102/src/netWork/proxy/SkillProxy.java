package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;


     public class SkillProxy
     {
       /**
        *接收
        *Client
        * 参数
        *
        *     技能原型ID
        *     Name:id     TYPE:'int     SIZE:4
       **/
        public final static int CG_LEARN_SKILL=1001;
       /**
        *推送
        *Server
        * 参数
        *
        *     技能原型Id
        *     Name:id     TYPE:'int     SIZE:4
        *     技能效果Id
        *     Name:effectId     TYPE:'int     SIZE:4
        *     当前等级
        *     Name:level     TYPE:'int     SIZE:4
        *     套装增加的等级
        *     Name:eqLv     TYPE:'int     SIZE:4
        *     当前经验
        *     Name:exp     TYPE:'int     SIZE:4
       **/
        public final static int GC_LEARN_SKILL=1002;
       /**
        *推送
        *Server
        * 参数
        *
        *     Java List to AS Array
        *     Name:skill_list     TYPE:'listskill     SIZE:5
       **/
        public final static int GC_INIT_SKILL=1003;

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
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("effectId","int",4),new CommandInfoModel("level","int",4),new CommandInfoModel("eqLv","int",4),new CommandInfoModel("exp","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1003,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("skill_list","listskill",5,new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("effectId","int",4),new CommandInfoModel("level","int",4),new CommandInfoModel("eqLv","int",4),new CommandInfoModel("exp","int",4)})};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
              return list;
         }
      }
