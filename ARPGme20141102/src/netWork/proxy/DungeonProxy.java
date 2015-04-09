package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;


     public class DungeonProxy
     {
       /**
        *返回
        *Client
        * 参数
        *
        *     副本ID
        *     Name:baseId     TYPE:'int     SIZE:4
        *     按照类型选择接口0直接进入/1删除进入/2 进入存在副本
        *     Name:type     TYPE:'byte     SIZE:1
       **/
        public final static int CG_ENTER_DUNGEON=1001;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_ENTER_DUNGEON=1002;
       /**
        *推送
        *Server
        * 参数
        *
        *     副本ID
        *     Name:baseId     TYPE:'int     SIZE:4
        *     今天已经挑战过的次数
        *     Name:count     TYPE:'int     SIZE:4
        *     今天总可以挑战的次数
        *     Name:couns     TYPE:'int     SIZE:4
       **/
        public final static int GC_DUNGEON_INFO=1003;
       /**
        *发送
        *Client
        * 参数
        *
       **/
        public final static int CG_EXIT_DUNGEON=1004;
       /**
        *接收
        *Client
        * 参数
        *
        *     副本ID
        *     Name:baseId     TYPE:'int     SIZE:4
        *     购买方式
        *     Name:buyType     TYPE:'byte     SIZE:1
       **/
        public final static int CG_BUY_DUNGEON=1006;
       /**
        *返回
        *Service
        * 参数
        *
       **/
        public final static int GC_BUY_DUNGEON=1007;
       /**
        *接收
        *Client
        * 参数
        *
       **/
        public final static int CG_LIST_DUNGEON=1008;
       /**
        *推送
        *Server
        * 参数
        *
        *     Java List to AS Array
        *     Name:dungeonList     TYPE:'listDungeon     SIZE:1
       **/
        public final static int GC_LIST_DUNGEON=1009;
       /**
        *返回执行下一轮扫荡返回/自动扫荡返回
        *Server
        * 参数
        *
        *     扫荡结束时间
        *     Name:sweepCd     TYPE:'long     SIZE:8
        *     上次扫荡的副本ID
        *     Name:baseId     TYPE:'int     SIZE:4
       **/
        public final static int GC_SWEEP_CD=1010;
       /**
        *发送
        *Client
        * 参数
        *
        *     消耗方式
        *     Name:type     TYPE:'byte     SIZE:1
       **/
        public final static int CG_CD_REMOVE=1011;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_CD_REMOVE=1012;
       /**
        *发送
        *Client
        * 参数
        *
       **/
        public final static int CG_AUTO_SWEEP=1013;
       /**
        *返回
        *Server
        * 参数
        *
        *     本次扫荡的副本ID
        *     Name:dungeonId     TYPE:'int     SIZE:4
        *     今天已经挑战的次数
        *     Name:count     TYPE:'int     SIZE:4
        *     今天可以挑战的次数
        *     Name:counts     TYPE:'int     SIZE:4
       **/
        public final static int GC_AUTO_SWEEP=1014;
       /**
        *发送
        *Client
        * 参数
        *
        *     本次扫荡的副本ID
        *     Name:baseId     TYPE:'int     SIZE:4
       **/
        public final static int CG_SWEEP_CD=1015;
       /**
        *发送
        *Client
        * 参数
        *
       **/
        public final static int CG_STOP_SWEEP=1016;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_STOP_SWEEP=1021;
       /**
        *接收
        *Client
        * 参数
        *
       **/
        public final static int CG_STATE_DUNGEON=1017;
       /**
        *推送结果
        *Server
        * 参数
        *
        *     副本ID
        *     Name:baseId     TYPE:'int     SIZE:4
        *     副本销毁时间
        *     Name:dryTime     TYPE:'long     SIZE:8
        *     是否通关0未 1通
        *     Name:isover     TYPE:'byte     SIZE:1
       **/
        public final static int GC_STATE_DUNGEON=1018;
       /**
        *接收
        *Client
        * 参数
        *
       **/
        public final static int CG_GAIN_AWARD=1019;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_GAIN_AWARD=1020;

        public static List<CommandModel> DATA_MODE()
         {
                List<CommandModel> list=new ArrayList<CommandModel>();
                CommandModel model= null;
                CommandInfoModel [] infoArray=null;
                  model     =new CommandModel(1001,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("baseId","int",4),new CommandInfoModel("type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1002,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1003,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("baseId","int",4),new CommandInfoModel("count","int",4),new CommandInfoModel("couns","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1004,"Client");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1006,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("baseId","int",4),new CommandInfoModel("buyType","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1007,"Service");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1008,"Client");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1009,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("dungeonList","listDungeon",1,new CommandInfoModel[]{new CommandInfoModel("baseId","int",4),new CommandInfoModel("count","int",4),new CommandInfoModel("counts","int",4)})};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1010,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("sweepCd","long",8),new CommandInfoModel("baseId","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1011,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1012,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1013,"Client");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1014,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("dungeonId","int",4),new CommandInfoModel("count","int",4),new CommandInfoModel("counts","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1015,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("baseId","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1016,"Client");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1021,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1017,"Client");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1018,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("baseId","int",4),new CommandInfoModel("dryTime","long",8),new CommandInfoModel("isover","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1019,"Client");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1020,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
              return list;
         }
      }
