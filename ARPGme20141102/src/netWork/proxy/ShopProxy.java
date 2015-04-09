package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;


     public class ShopProxy
     {
       /**
        *接收
        *Client
        * 参数
        *
        *     商品ID
        *     Name:id     TYPE:'int     SIZE:4
        *     购买数量
        *     Name:count     TYPE:'int     SIZE:4
        *     使用购买的货币类型
        *     Name:type     TYPE:'int     SIZE:4
       **/
        public final static int CG_SHOP_BUY=1001;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_SHOP_BUY=1002;
       /**
        *接收
        *Client
        * 参数
        *
        *     活动类型(抢购或秒杀)
        *     Name:type     TYPE:'int     SIZE:4
        *     商品ID
        *     Name:id     TYPE:'int     SIZE:4
        *     购买数量
        *     Name:count     TYPE:'int     SIZE:4
       **/
        public final static int CG_SHOP_CHEAP_BUY=1003;
       /**
        *返回
        *Server
        * 参数
        *
        *     活动类型(抢购或秒杀)
        *     Name:type     TYPE:'int     SIZE:4
        *     商品ID
        *     Name:id     TYPE:'int     SIZE:4
        *     剩余数量
        *     Name:count     TYPE:'int     SIZE:4
       **/
        public final static int GC_SHOP_CHEAP_BUY=1004;
       /**
        *接收
        *Client
        * 参数
        *
       **/
        public final static int CG_SHOP_CHEAP_INFO=1005;
       /**
        *返回
        *Server
        * 参数
        *
        *     下一轮抢购开启时间
        *     Name:snapUpTime     TYPE:'long     SIZE:8
        *     下一轮秒杀开启时间
        *     Name:seckillTime     TYPE:'long     SIZE:8
        *     Java List to AS Array
        *     Name:snapUpList     TYPE:'listSnapUp     SIZE:1
        *     Java List to AS Array
        *     Name:seckillList     TYPE:'listSeckill     SIZE:1
       **/
        public final static int GC_SHOP_CHEAP_INFO=1006;

        public static List<CommandModel> DATA_MODE()
         {
                List<CommandModel> list=new ArrayList<CommandModel>();
                CommandModel model= null;
                CommandInfoModel [] infoArray=null;
                  model     =new CommandModel(1001,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("count","int",4),new CommandInfoModel("type","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1002,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1003,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("type","int",4),new CommandInfoModel("id","int",4),new CommandInfoModel("count","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1004,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("type","int",4),new CommandInfoModel("id","int",4),new CommandInfoModel("count","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1005,"Client");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1006,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("snapUpTime","long",8),new CommandInfoModel("seckillTime","long",8),new CommandInfoModel("snapUpList","listSnapUp",1,new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("count","int",4),new CommandInfoModel("onlyCount","int",4),new CommandInfoModel("snapUpPrice","int",4)}),new CommandInfoModel("seckillList","listSeckill",1,new CommandInfoModel[]{new CommandInfoModel("id","int",4),new CommandInfoModel("count","int",4),new CommandInfoModel("onlyCount","int",4),new CommandInfoModel("snapUpPrice","int",4)})};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
              return list;
         }
      }
