package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;


     public class MeridProxy
     {
       /**
        *接收
        *Client
        * 参数
        *
        *     目标玩家Id
        *     Name:playerId     TYPE:'long     SIZE:8
       **/
        public final static int CG_MERID_INFO=1001;
       /**
        *返回
        *Server
        * 参数
        *
        *     目标玩家Id
        *     Name:playerId     TYPE:'long     SIZE:8
        *     体魄值
        *     Name:psqPnt     TYPE:'int     SIZE:4
        *     劲力值
        *     Name:pwPnt     TYPE:'int     SIZE:4
        *     修为值
        *     Name:itgPnt     TYPE:'int     SIZE:4
        *     手法值
        *     Name:tcqPnt     TYPE:'int     SIZE:4
        *     可分配属性点
        *     Name:canAddPnt     TYPE:'int     SIZE:4
        *     精力值
        *     Name:energy     TYPE:'short     SIZE:2
        *     自动恢复剩余时间
        *     Name:remainTime     TYPE:'long     SIZE:8
        *     当天使用银子次数
        *     Name:silverCount     TYPE:'int     SIZE:4
        *     当天使用元宝次数
        *     Name:goldCount     TYPE:'int     SIZE:4
       **/
        public final static int GC_MERID_INFO=1002;
       /**
        *接收
        *Client
        * 参数
        *
        *     1银子恢复，2元宝恢复
        *     Name:type     TYPE:'byte     SIZE:1
       **/
        public final static int CG_ENERGY_REGAIN=1003;
       /**
        *返回
        *Server
        * 参数
        *
        *     当天使用银子次数
        *     Name:silverCount     TYPE:'int     SIZE:4
        *     当天使用元宝次数
        *     Name:goldCount     TYPE:'int     SIZE:4
       **/
        public final static int GC_ENERGY_REGAIN=1004;
       /**
        *接收
        *Client
        * 参数
        *
       **/
        public final static int CG_ENERGY_USE=1005;
       /**
        *返回
        *Server
        * 参数
        *
        *     1\2\3\4\5代表五种结果
        *     Name:result     TYPE:'byte     SIZE:1
        *     可分配属性点
        *     Name:canAddPnt     TYPE:'int     SIZE:4
       **/
        public final static int GC_ENERGY_USE=1006;
       /**
        *推送
        *Server
        * 参数
        *
        *     精力值
        *     Name:energy     TYPE:'short     SIZE:2
        *     自动恢复剩余时间
        *     Name:remainTime     TYPE:'long     SIZE:8
       **/
        public final static int GC_ENERGY_STATE=1007;
       /**
        *接收
        *Client
        * 参数
        *
        *     增加体魄点数
        *     Name:psqPntAdd     TYPE:'int     SIZE:4
        *     增加劲力点数
        *     Name:pwPntAdd     TYPE:'int     SIZE:4
        *     增加修为点数
        *     Name:itgPntAdd     TYPE:'int     SIZE:4
        *     增加手法点数
        *     Name:tcqPntAdd     TYPE:'int     SIZE:4
       **/
        public final static int CG_CANADD_ALLOT=1008;
       /**
        *返回
        *Server
        * 参数
        *
        *     体魄值
        *     Name:psqPnt     TYPE:'int     SIZE:4
        *     劲力值
        *     Name:pwPnt     TYPE:'int     SIZE:4
        *     修为值
        *     Name:itgPnt     TYPE:'int     SIZE:4
        *     手法值
        *     Name:tcqPnt     TYPE:'int     SIZE:4
        *     可分配属性值
        *     Name:canAddPnt     TYPE:'int     SIZE:4
       **/
        public final static int GC_MERID_STATE=1009;

        public static List<CommandModel> DATA_MODE()
         {
                List<CommandModel> list=new ArrayList<CommandModel>();
                CommandModel model= null;
                CommandInfoModel [] infoArray=null;
                  model     =new CommandModel(1001,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("playerId","long",8)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1002,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("playerId","long",8),new CommandInfoModel("psqPnt","int",4),new CommandInfoModel("pwPnt","int",4),new CommandInfoModel("itgPnt","int",4),new CommandInfoModel("tcqPnt","int",4),new CommandInfoModel("canAddPnt","int",4),new CommandInfoModel("energy","short",2),new CommandInfoModel("remainTime","long",8),new CommandInfoModel("silverCount","int",4),new CommandInfoModel("goldCount","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1003,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1004,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("silverCount","int",4),new CommandInfoModel("goldCount","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1005,"Client");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1006,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("result","byte",1),new CommandInfoModel("canAddPnt","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1007,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("energy","short",2),new CommandInfoModel("remainTime","long",8)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1008,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("psqPntAdd","int",4),new CommandInfoModel("pwPntAdd","int",4),new CommandInfoModel("itgPntAdd","int",4),new CommandInfoModel("tcqPntAdd","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1009,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("psqPnt","int",4),new CommandInfoModel("pwPnt","int",4),new CommandInfoModel("itgPnt","int",4),new CommandInfoModel("tcqPnt","int",4),new CommandInfoModel("canAddPnt","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
              return list;
         }
      }
