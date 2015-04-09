package netWork.proxy;

import java.util.ArrayList;
import java.util.List;
import com.commons.network.modulecore.model.CommandInfoModel;
import com.commons.network.modulecore.model.CommandModel;


     public class ItemProxy
     {
       /**
        *接收
        *Client
        * 参数
        *
        *     容器类型
        *     Name:type     TYPE:'byte     SIZE:1
       **/
        public final static int CG_CONTAINER_GET=1100;
       /**
        *返回
        *server
        * 参数
        *
        *     容器格子总数
        *     Name:c_count     TYPE:'short     SIZE:2
        *     容器类型
        *     Name:type     TYPE:'byte     SIZE:1
        *     Java List to AS Array
        *     Name:li     TYPE:'listitemcitem     SIZE:5
        *     Java List to AS Array
        *     Name:lieq     TYPE:'listitemcequip     SIZE:56
       **/
        public final static int GC_CONTAINER_GET=1101;
       /**
        *接收
        *Client
        * 参数
        *
        *     容器序号
        *     Name:numb     TYPE:'short     SIZE:2
        *     容器类型（背包，仓库等）
        *     Name:type     TYPE:'byte     SIZE:1
       **/
        public final static int CG_ITEM_DESTROY=1102;
       /**
        *推送
        *Server
        * 参数
        *
        *     容器序号
        *     Name:numb     TYPE:'short     SIZE:2
        *     容器类型（背包，仓库等）
        *     Name:type     TYPE:'byte     SIZE:1
       **/
        public final static int GC_ITEM_DESTROY=1103;
       /**
        *推送
        *Server
        * 参数
        *
        *     道具实体Id
        *     Name:id     TYPE:'long     SIZE:8
        *     道具原型id
        *     Name:p_id     TYPE:'int     SIZE:4
        *     容器种类
        *     Name:type     TYPE:'byte     SIZE:1
        *     道具所在容器位置
        *     Name:c_numb     TYPE:'short     SIZE:2
        *     绑定状态
        *     Name:bindstate     TYPE:'byte     SIZE:1
        *     当前数量
        *     Name:count     TYPE:'short     SIZE:2
       **/
        public final static int GC_CONTAINER_ADD_ITEM=1104;
       /**
        *推送
        *Server
        * 参数
        *
        *     道具实体Id
        *     Name:id     TYPE:'long     SIZE:8
        *     道具原型id
        *     Name:p_id     TYPE:'int     SIZE:4
        *     容器种类
        *     Name:type     TYPE:'byte     SIZE:1
        *     道具所在容器位置
        *     Name:c_numb     TYPE:'short     SIZE:2
        *     绑定状态
        *     Name:bindstate     TYPE:'byte     SIZE:1
        *     强化等级
        *     Name:enlv     TYPE:'short     SIZE:2
        *     追加等级
        *     Name:addlv     TYPE:'short     SIZE:2
        *     当前持久
        *     Name:durability     TYPE:'int     SIZE:4
        *     套装阶数
        *     Name:suitlv     TYPE:'short     SIZE:2
        *     鉴定状态
        *     Name:identifystate     TYPE:'byte     SIZE:1
        *     基本属性_最小外功攻击
        *     Name:b_kfAtMin     TYPE:'int     SIZE:4
        *     基本属性_最大外功攻击
        *     Name:b_kfAtMax     TYPE:'int     SIZE:4
        *     基本属性_最小内功攻击
        *     Name:b_dgAtMin     TYPE:'int     SIZE:4
        *     基本属性_最大内功攻击
        *     Name:b_dgAtMax     TYPE:'int     SIZE:4
        *     基本属性_最小暗器攻击
        *     Name:b_fpAtMin     TYPE:'int     SIZE:4
        *     基本属性_最大暗器攻击
        *     Name:b_fpAtMax     TYPE:'int     SIZE:4
        *     基本属性_外功防御
        *     Name:b_kfDf     TYPE:'int     SIZE:4
        *     基本属性_内功防御
        *     Name:b_dgDf     TYPE:'int     SIZE:4
        *     基本属性_最大生命值
        *     Name:b_hpMax     TYPE:'int     SIZE:4
        *     基本属性_最大内力值
        *     Name:b_mpMax     TYPE:'Int     SIZE:4
        *     追加属性_最小外功攻击
        *     Name:a_kfAtMin     TYPE:'int     SIZE:4
        *     追加属性_最大外功攻击
        *     Name:a_kfAtMax     TYPE:'int     SIZE:4
        *     追加属性_最小内功攻击
        *     Name:a_dgAtMin     TYPE:'int     SIZE:4
        *     追加属性_最大内功攻击
        *     Name:a_dgAtMax     TYPE:'int     SIZE:4
        *     追加属性_最小暗器攻击
        *     Name:a_fpAtMin     TYPE:'int     SIZE:4
        *     追加属性_最大暗器攻击
        *     Name:a_fpAtMax     TYPE:'int     SIZE:4
        *     追加属性_外功防御
        *     Name:a_kfDf     TYPE:'int     SIZE:4
        *     追加属性_内功防御
        *     Name:a_dgDf     TYPE:'int     SIZE:4
        *     追加属性_最大生命值
        *     Name:a_hpMax     TYPE:'int     SIZE:4
        *     追加属性_最大内力值
        *     Name:a_mpMax     TYPE:'Int     SIZE:4
        *     追加属性_移动速度
        *     Name:a_mvSp     TYPE:'Int     SIZE:4
        *     追加属性_闪避等级
        *     Name:a_dgLv     TYPE:'Int     SIZE:4
        *     追加属性_命中等级
        *     Name:a_htLv     TYPE:'int     SIZE:4
        *     追加属性_暴击等级
        *     Name:a_ctLv     TYPE:'int     SIZE:4
        *     追加属性_暴击伤害
        *     Name:a_ctDmg     TYPE:'float     SIZE:4
        *     追加属性_格挡等级
        *     Name:a_bkLv     TYPE:'int     SIZE:4
        *     追加属性_生命偷取
        *     Name:a_hpSt     TYPE:'float     SIZE:4
        *     追加属性_内力偷取
        *     Name:a_mpSt     TYPE:'float     SIZE:4
        *     追加属性_生命百分比
        *     Name:a_hpPc     TYPE:'float     SIZE:4
        *     追加属性_内力百分比
        *     Name:a_mpPc     TYPE:'float     SIZE:4
        *     追加属性_外功百分比
        *     Name:a_kfAtPc     TYPE:'float     SIZE:4
        *     追加属性_内功百分比
        *     Name:a_dgAtPc     TYPE:'float     SIZE:4
        *     追加属性_暗器攻击百分比
        *     Name:a_fpAtPc     TYPE:'float     SIZE:4
        *     追加属性_外功防御百分比
        *     Name:a_kfDfPc     TYPE:'float     SIZE:4
        *     追加属性_内功防御百分比
        *     Name:a_dgDfPc     TYPE:'float     SIZE:4
        *     追加属性_血气
        *     Name:a_clDf     TYPE:'int     SIZE:4
        *     追加属性_筋骨
        *     Name:a_bdDf     TYPE:'int     SIZE:4
        *     追加属性_药性
        *     Name:a_psnDf     TYPE:'int     SIZE:4
        *     追加属性_炼体
        *     Name:a_slcDf     TYPE:'int     SIZE:4
        *     追加属性_强健
        *     Name:a_itnIjrDf     TYPE:'int     SIZE:4
        *     追加属性_明神
        *     Name:a_cfsDf     TYPE:'int     SIZE:4
        *     追加属性_灵活
        *     Name:a_stfDf     TYPE:'int     SIZE:4
        *     追加属性_生命恢复
        *     Name:a_hpRs     TYPE:'int     SIZE:4
        *     追加属性_内力恢复
        *     Name:a_mpRs     TYPE:'int     SIZE:4
        *     追加属性_血瓶加成
        *     Name:a_hpAdd     TYPE:'int     SIZE:4
        *     追加属性_蓝瓶加成
        *     Name:a_mpAdd     TYPE:'int     SIZE:4
        *     追加属性_经验加成
        *     Name:a_expAdd     TYPE:'float     SIZE:4
        *     追加属性_掉金加成
        *     Name:a_goldFd     TYPE:'float     SIZE:4
        *     追加属性_掉宝加成
        *     Name:a_mF     TYPE:'float     SIZE:4
       **/
        public final static int GC_CONTAINER_ADD_EQ=1105;
       /**
        *接收
        *Client
        * 参数
        *
        *     容器序号
        *     Name:numb     TYPE:'int     SIZE:4
        *     来源容器类型（背包，仓库等）
        *     Name:c_type     TYPE:'byte     SIZE:1
        *     调换容器序号
        *     Name:pos     TYPE:'int     SIZE:4
        *     调换容器类型（背包，仓库等）
        *     Name:g_type     TYPE:'byte     SIZE:1
       **/
        public final static int CG_ITEM_CHANGE_POS=1106;
       /**
        *返回
        *Server
        * 参数
        *
        *     容器序号
        *     Name:numb     TYPE:'int     SIZE:4
        *     来源容器类型（背包，仓库等）
        *     Name:c_type     TYPE:'byte     SIZE:1
        *     调换容器序号
        *     Name:pos     TYPE:'int     SIZE:4
        *     调换容器类型（背包，仓库等）
        *     Name:g_type     TYPE:'byte     SIZE:1
       **/
        public final static int GC_ITEM_CHANGE_POS=1107;
       /**
        *接收
        *Client
        * 参数
        *
        *     容器序号
        *     Name:numb     TYPE:'int     SIZE:4
        *     来源容器类型（背包，仓库等）
        *     Name:c_type     TYPE:'byte     SIZE:1
        *     道具数量
        *     Name:count     TYPE:'short     SIZE:2
       **/
        public final static int CG_ITEM_UPDATE_POS=1108;
       /**
        *返回
        *Server
        * 参数
        *
        *     容器序号
        *     Name:numb     TYPE:'int     SIZE:4
        *     来源容器类型（背包，仓库等）
        *     Name:c_type     TYPE:'byte     SIZE:1
        *     道具数量
        *     Name:count     TYPE:'short     SIZE:2
       **/
        public final static int GC_ITEM_UPDATE_POS=1109;
       /**
        *接收
        *Client
        * 参数
        *
        *     容器序号
        *     Name:numb     TYPE:'int     SIZE:4
        *     来源容器类型（背包，仓库等）
        *     Name:c_type     TYPE:'byte     SIZE:1
        *     使用数量
        *     Name:count     TYPE:'short     SIZE:2
        *     其他参数如”x:123,y:456,”
        *     Name:args     TYPE:'string     SIZE:50
       **/
        public final static int CG_ITEM_USE_POS=1110;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_ITEM_USE_POS=1111;
       /**
        *接收
        *Client
        * 参数
        *
        *     容器类型
        *     Name:type     TYPE:'byte     SIZE:1
       **/
        public final static int CG_CONT_PUBLIC_GET=1112;
       /**
        *返回
        *server
        * 参数
        *
        *     容器格子总数
        *     Name:c_count     TYPE:'short     SIZE:2
        *     容器类型
        *     Name:type     TYPE:'byte     SIZE:1
        *     Java List to AS Array
        *     Name:li     TYPE:'listitemcitem     SIZE:5
        *     Java List to AS Array
        *     Name:lieq     TYPE:'listcquippub     SIZE:10
       **/
        public final static int GC_CONT_PUBLIC_GET=1113;
       /**
        *推送
        *Server
        * 参数
        *
        *     玩家ID
        *     Name:playerId     TYPE:'long     SIZE:8
        *     衣服id
        *     Name:lothesId     TYPE:'int     SIZE:4
        *     强化等级
        *     Name:clothesLevel     TYPE:'short     SIZE:2
       **/
        public final static int GC_UPDATE_EQUIP=1114;
       /**
        *推送
        *Server
        * 参数
        *
        *     玩家ID
        *     Name:playerId     TYPE:'long     SIZE:8
        *     武器id
        *     Name:armsid     TYPE:'int     SIZE:4
        *     武器的强化等级
        *     Name:armsLevel     TYPE:'short     SIZE:2
       **/
        public final static int GC_UPDATE_ARMS=1115;
       /**
        *接收
        *Client
        * 参数
        *
        *     背包格子位置
        *     Name:numb     TYPE:'int     SIZE:4
       **/
        public final static int CG_EQUIP_PUT_POS=1116;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_EQUIP_PUT_POS=1117;
       /**
        *接收
        *Client
        * 参数
        *
        *     装备面板格子位置
        *     Name:numb     TYPE:'int     SIZE:4
       **/
        public final static int CG_EQUIP_OFF_POS=1118;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_EQUIP_OFF_POS=1119;
       /**
        *接收
        *Client
        * 参数
        *
        *     容器序号
        *     Name:numb     TYPE:'int     SIZE:4
        *     来源容器类型（背包，仓库等）
        *     Name:c_type     TYPE:'byte     SIZE:1
        *     玩家id
        *     Name:player_id     TYPE:'long     SIZE:8
       **/
        public final static int CG_EQUIP_ATTRIBUTE=1120;
       /**
        *推送
        *Server
        * 参数
        *
        *     玩家id
        *     Name:player_id     TYPE:'long     SIZE:8
        *     容器种类
        *     Name:type     TYPE:'byte     SIZE:1
        *     道具所在容器位置
        *     Name:c_numb     TYPE:'short     SIZE:2
        *     基本属性_最小外功攻击
        *     Name:b_kfAtMin     TYPE:'int     SIZE:4
        *     基本属性_最大外功攻击
        *     Name:b_kfAtMax     TYPE:'int     SIZE:4
        *     基本属性_最小内功攻击
        *     Name:b_dgAtMin     TYPE:'int     SIZE:4
        *     基本属性_最大内功攻击
        *     Name:b_dgAtMax     TYPE:'int     SIZE:4
        *     基本属性_最小暗器攻击
        *     Name:b_fpAtMin     TYPE:'int     SIZE:4
        *     基本属性_最大暗器攻击
        *     Name:b_fpAtMax     TYPE:'int     SIZE:4
        *     基本属性_外功防御
        *     Name:b_kfDf     TYPE:'int     SIZE:4
        *     基本属性_内功防御
        *     Name:b_dgDf     TYPE:'int     SIZE:4
        *     基本属性_最大生命值
        *     Name:b_hpMax     TYPE:'int     SIZE:4
        *     基本属性_最大内力值
        *     Name:b_mpMax     TYPE:'Int     SIZE:4
        *     追加属性_最小外功攻击
        *     Name:a_kfAtMin     TYPE:'int     SIZE:4
        *     追加属性_最大外功攻击
        *     Name:a_kfAtMax     TYPE:'int     SIZE:4
        *     追加属性_最小内功攻击
        *     Name:a_dgAtMin     TYPE:'int     SIZE:4
        *     追加属性_最大内功攻击
        *     Name:a_dgAtMax     TYPE:'int     SIZE:4
        *     追加属性_最小暗器攻击
        *     Name:a_fpAtMin     TYPE:'int     SIZE:4
        *     追加属性_最大暗器攻击
        *     Name:a_fpAtMax     TYPE:'int     SIZE:4
        *     追加属性_外功防御
        *     Name:a_kfDf     TYPE:'int     SIZE:4
        *     追加属性_内功防御
        *     Name:a_dgDf     TYPE:'int     SIZE:4
        *     追加属性_最大生命值
        *     Name:a_hpMax     TYPE:'int     SIZE:4
        *     追加属性_最大内力值
        *     Name:a_mpMax     TYPE:'Int     SIZE:4
        *     追加属性_移动速度
        *     Name:a_mvSp     TYPE:'Int     SIZE:4
        *     追加属性_闪避等级
        *     Name:a_dgLv     TYPE:'Int     SIZE:4
        *     追加属性_命中等级
        *     Name:a_htLv     TYPE:'int     SIZE:4
        *     追加属性_暴击等级
        *     Name:a_ctLv     TYPE:'int     SIZE:4
        *     追加属性_暴击伤害
        *     Name:a_ctDmg     TYPE:'float     SIZE:4
        *     追加属性_格挡等级
        *     Name:a_bkLv     TYPE:'int     SIZE:4
        *     追加属性_生命偷取
        *     Name:a_hpSt     TYPE:'float     SIZE:4
        *     追加属性_内力偷取
        *     Name:a_mpSt     TYPE:'float     SIZE:4
        *     追加属性_生命百分比
        *     Name:a_hpPc     TYPE:'float     SIZE:4
        *     追加属性_内力百分比
        *     Name:a_mpPc     TYPE:'float     SIZE:4
        *     追加属性_外功百分比
        *     Name:a_kfAtPc     TYPE:'float     SIZE:4
        *     追加属性_内功百分比
        *     Name:a_dgAtPc     TYPE:'float     SIZE:4
        *     追加属性_暗器攻击百分比
        *     Name:a_fpAtPc     TYPE:'float     SIZE:4
        *     追加属性_外功防御百分比
        *     Name:a_kfDfPc     TYPE:'float     SIZE:4
        *     追加属性_内功防御百分比
        *     Name:a_dgDfPc     TYPE:'float     SIZE:4
        *     追加属性_血气
        *     Name:a_clDf     TYPE:'int     SIZE:4
        *     追加属性_筋骨
        *     Name:a_bdDf     TYPE:'int     SIZE:4
        *     追加属性_药性
        *     Name:a_psnDf     TYPE:'int     SIZE:4
        *     追加属性_炼体
        *     Name:a_slcDf     TYPE:'int     SIZE:4
        *     追加属性_强健
        *     Name:a_itnIjrDf     TYPE:'int     SIZE:4
        *     追加属性_明神
        *     Name:a_cfsDf     TYPE:'int     SIZE:4
        *     追加属性_灵活
        *     Name:a_stfDf     TYPE:'int     SIZE:4
        *     追加属性_生命恢复
        *     Name:a_hpRs     TYPE:'int     SIZE:4
        *     追加属性_内力恢复
        *     Name:a_mpRs     TYPE:'int     SIZE:4
        *     追加属性_血瓶加成
        *     Name:a_hpAdd     TYPE:'int     SIZE:4
        *     追加属性_蓝瓶加成
        *     Name:a_mpAdd     TYPE:'int     SIZE:4
        *     追加属性_经验加成
        *     Name:a_expAdd     TYPE:'float     SIZE:4
        *     追加属性_掉金加成
        *     Name:a_goldFd     TYPE:'float     SIZE:4
        *     追加属性_掉宝加成
        *     Name:a_mF     TYPE:'float     SIZE:4
       **/
        public final static int GC_EQUIP_ATTRIBUTE=1121;
       /**
        *接收
        *Client
        * 参数
        *
        *     容器种类
        *     Name:type     TYPE:'byte     SIZE:1
        *     道具所在容器位置
        *     Name:pos     TYPE:'short     SIZE:2
       **/
        public final static int CG_GIVE_UP=1122;
       /**
        *返回
        *Server
        * 参数
        *
       **/
        public final static int GC_GIVE_UP=1123;

        public static List<CommandModel> DATA_MODE()
         {
                List<CommandModel> list=new ArrayList<CommandModel>();
                CommandModel model= null;
                CommandInfoModel [] infoArray=null;
                  model     =new CommandModel(1100,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1101,"server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("c_count","short",2),new CommandInfoModel("type","byte",1),new CommandInfoModel("li","listitemcitem",5,new CommandInfoModel[]{new CommandInfoModel("id","long",8),new CommandInfoModel("p_id","int",4),new CommandInfoModel("c_numb","short",2),new CommandInfoModel("bindstate","byte",1),new CommandInfoModel("count","short",2)}),new CommandInfoModel("lieq","listitemcequip",56,new CommandInfoModel[]{new CommandInfoModel("id","long",8),new CommandInfoModel("p_id","int",4),new CommandInfoModel("c_numb","short",2),new CommandInfoModel("bindstate","byte",1),new CommandInfoModel("count","short",2),new CommandInfoModel("enlv","short",2),new CommandInfoModel("addlv","short",2),new CommandInfoModel("durability","int",4),new CommandInfoModel("suitlv","short",2),new CommandInfoModel("identifystate","byte",1),new CommandInfoModel("b_kfAtMin","int",4),new CommandInfoModel("b_kfAtMax","int",4),new CommandInfoModel("b_dgAtMin","int",4),new CommandInfoModel("b_dgAtMax","int",4),new CommandInfoModel("b_fpAtMin","int",4),new CommandInfoModel("b_fpAtMax","int",4),new CommandInfoModel("b_kfDf","int",4),new CommandInfoModel("b_dgDf","int",4),new CommandInfoModel("b_hpMax","int",4),new CommandInfoModel("b_mpMax","Int",4),new CommandInfoModel("a_kfAtMin","int",4),new CommandInfoModel("a_kfAtMax","int",4),new CommandInfoModel("a_dgAtMin","int",4),new CommandInfoModel("a_dgAtMax","int",4),new CommandInfoModel("a_fpAtMin","int",4),new CommandInfoModel("a_fpAtMax","int",4),new CommandInfoModel("a_kfDf","int",4),new CommandInfoModel("a_dgDf","int",4),new CommandInfoModel("a_hpMax","int",4),new CommandInfoModel("a_mpMax","Int",4),new CommandInfoModel("a_mvSp","Int",4),new CommandInfoModel("a_dgLv","Int",4),new CommandInfoModel("a_htLv","int",4),new CommandInfoModel("a_ctLv","int",4),new CommandInfoModel("a_ctDmg","float",4),new CommandInfoModel("a_bkLv","int",4),new CommandInfoModel("a_hpSt","float",4),new CommandInfoModel("a_mpSt","float",4),new CommandInfoModel("a_hpPc","float",4),new CommandInfoModel("a_mpPc","float",4),new CommandInfoModel("a_kfAtPc","float",4),new CommandInfoModel("a_dgAtPc","float",4),new CommandInfoModel("a_fpAtPc","float",4),new CommandInfoModel("a_kfDfPc","float",4),new CommandInfoModel("a_dgDfPc","float",4),new CommandInfoModel("a_clDf","int",4),new CommandInfoModel("a_bdDf","int",4),new CommandInfoModel("a_psnDf","int",4),new CommandInfoModel("a_slcDf","int",4),new CommandInfoModel("a_itnIjrDf","int",4),new CommandInfoModel("a_cfsDf","int",4),new CommandInfoModel("a_stfDf","int",4),new CommandInfoModel("a_hpRs","int",4),new CommandInfoModel("a_mpRs","int",4),new CommandInfoModel("a_hpAdd","int",4),new CommandInfoModel("a_mpAdd","int",4),new CommandInfoModel("a_expAdd","float",4),new CommandInfoModel("a_goldFd","float",4),new CommandInfoModel("a_mF","float",4)})};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1102,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","short",2),new CommandInfoModel("type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1103,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","short",2),new CommandInfoModel("type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1104,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","long",8),new CommandInfoModel("p_id","int",4),new CommandInfoModel("type","byte",1),new CommandInfoModel("c_numb","short",2),new CommandInfoModel("bindstate","byte",1),new CommandInfoModel("count","short",2)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1105,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("id","long",8),new CommandInfoModel("p_id","int",4),new CommandInfoModel("type","byte",1),new CommandInfoModel("c_numb","short",2),new CommandInfoModel("bindstate","byte",1),new CommandInfoModel("enlv","short",2),new CommandInfoModel("addlv","short",2),new CommandInfoModel("durability","int",4),new CommandInfoModel("suitlv","short",2),new CommandInfoModel("identifystate","byte",1),new CommandInfoModel("b_kfAtMin","int",4),new CommandInfoModel("b_kfAtMax","int",4),new CommandInfoModel("b_dgAtMin","int",4),new CommandInfoModel("b_dgAtMax","int",4),new CommandInfoModel("b_fpAtMin","int",4),new CommandInfoModel("b_fpAtMax","int",4),new CommandInfoModel("b_kfDf","int",4),new CommandInfoModel("b_dgDf","int",4),new CommandInfoModel("b_hpMax","int",4),new CommandInfoModel("b_mpMax","Int",4),new CommandInfoModel("a_kfAtMin","int",4),new CommandInfoModel("a_kfAtMax","int",4),new CommandInfoModel("a_dgAtMin","int",4),new CommandInfoModel("a_dgAtMax","int",4),new CommandInfoModel("a_fpAtMin","int",4),new CommandInfoModel("a_fpAtMax","int",4),new CommandInfoModel("a_kfDf","int",4),new CommandInfoModel("a_dgDf","int",4),new CommandInfoModel("a_hpMax","int",4),new CommandInfoModel("a_mpMax","Int",4),new CommandInfoModel("a_mvSp","Int",4),new CommandInfoModel("a_dgLv","Int",4),new CommandInfoModel("a_htLv","int",4),new CommandInfoModel("a_ctLv","int",4),new CommandInfoModel("a_ctDmg","float",4),new CommandInfoModel("a_bkLv","int",4),new CommandInfoModel("a_hpSt","float",4),new CommandInfoModel("a_mpSt","float",4),new CommandInfoModel("a_hpPc","float",4),new CommandInfoModel("a_mpPc","float",4),new CommandInfoModel("a_kfAtPc","float",4),new CommandInfoModel("a_dgAtPc","float",4),new CommandInfoModel("a_fpAtPc","float",4),new CommandInfoModel("a_kfDfPc","float",4),new CommandInfoModel("a_dgDfPc","float",4),new CommandInfoModel("a_clDf","int",4),new CommandInfoModel("a_bdDf","int",4),new CommandInfoModel("a_psnDf","int",4),new CommandInfoModel("a_slcDf","int",4),new CommandInfoModel("a_itnIjrDf","int",4),new CommandInfoModel("a_cfsDf","int",4),new CommandInfoModel("a_stfDf","int",4),new CommandInfoModel("a_hpRs","int",4),new CommandInfoModel("a_mpRs","int",4),new CommandInfoModel("a_hpAdd","int",4),new CommandInfoModel("a_mpAdd","int",4),new CommandInfoModel("a_expAdd","float",4),new CommandInfoModel("a_goldFd","float",4),new CommandInfoModel("a_mF","float",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1106,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","int",4),new CommandInfoModel("c_type","byte",1),new CommandInfoModel("pos","int",4),new CommandInfoModel("g_type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1107,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","int",4),new CommandInfoModel("c_type","byte",1),new CommandInfoModel("pos","int",4),new CommandInfoModel("g_type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1108,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","int",4),new CommandInfoModel("c_type","byte",1),new CommandInfoModel("count","short",2)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1109,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","int",4),new CommandInfoModel("c_type","byte",1),new CommandInfoModel("count","short",2)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1110,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","int",4),new CommandInfoModel("c_type","byte",1),new CommandInfoModel("count","short",2),new CommandInfoModel("args","string",50)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1111,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1112,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("type","byte",1)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1113,"server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("c_count","short",2),new CommandInfoModel("type","byte",1),new CommandInfoModel("li","listitemcitem",5,new CommandInfoModel[]{new CommandInfoModel("id","long",8),new CommandInfoModel("p_id","int",4),new CommandInfoModel("c_numb","short",2),new CommandInfoModel("bindstate","byte",1),new CommandInfoModel("count","short",2)}),new CommandInfoModel("lieq","listcquippub",10,new CommandInfoModel[]{new CommandInfoModel("id","long",8),new CommandInfoModel("p_id","int",4),new CommandInfoModel("c_numb","short",2),new CommandInfoModel("bindstate","byte",1),new CommandInfoModel("count","short",2),new CommandInfoModel("enlv","short",2),new CommandInfoModel("addlv","short",2),new CommandInfoModel("durability","int",4),new CommandInfoModel("suitlv","short",2),new CommandInfoModel("identifystate","byte",1)})};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1114,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("playerId","long",8),new CommandInfoModel("lothesId","int",4),new CommandInfoModel("clothesLevel","short",2)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1115,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("playerId","long",8),new CommandInfoModel("armsid","int",4),new CommandInfoModel("armsLevel","short",2)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1116,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1117,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1118,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","int",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1119,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1120,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("numb","int",4),new CommandInfoModel("c_type","byte",1),new CommandInfoModel("player_id","long",8)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1121,"Server");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("player_id","long",8),new CommandInfoModel("type","byte",1),new CommandInfoModel("c_numb","short",2),new CommandInfoModel("b_kfAtMin","int",4),new CommandInfoModel("b_kfAtMax","int",4),new CommandInfoModel("b_dgAtMin","int",4),new CommandInfoModel("b_dgAtMax","int",4),new CommandInfoModel("b_fpAtMin","int",4),new CommandInfoModel("b_fpAtMax","int",4),new CommandInfoModel("b_kfDf","int",4),new CommandInfoModel("b_dgDf","int",4),new CommandInfoModel("b_hpMax","int",4),new CommandInfoModel("b_mpMax","Int",4),new CommandInfoModel("a_kfAtMin","int",4),new CommandInfoModel("a_kfAtMax","int",4),new CommandInfoModel("a_dgAtMin","int",4),new CommandInfoModel("a_dgAtMax","int",4),new CommandInfoModel("a_fpAtMin","int",4),new CommandInfoModel("a_fpAtMax","int",4),new CommandInfoModel("a_kfDf","int",4),new CommandInfoModel("a_dgDf","int",4),new CommandInfoModel("a_hpMax","int",4),new CommandInfoModel("a_mpMax","Int",4),new CommandInfoModel("a_mvSp","Int",4),new CommandInfoModel("a_dgLv","Int",4),new CommandInfoModel("a_htLv","int",4),new CommandInfoModel("a_ctLv","int",4),new CommandInfoModel("a_ctDmg","float",4),new CommandInfoModel("a_bkLv","int",4),new CommandInfoModel("a_hpSt","float",4),new CommandInfoModel("a_mpSt","float",4),new CommandInfoModel("a_hpPc","float",4),new CommandInfoModel("a_mpPc","float",4),new CommandInfoModel("a_kfAtPc","float",4),new CommandInfoModel("a_dgAtPc","float",4),new CommandInfoModel("a_fpAtPc","float",4),new CommandInfoModel("a_kfDfPc","float",4),new CommandInfoModel("a_dgDfPc","float",4),new CommandInfoModel("a_clDf","int",4),new CommandInfoModel("a_bdDf","int",4),new CommandInfoModel("a_psnDf","int",4),new CommandInfoModel("a_slcDf","int",4),new CommandInfoModel("a_itnIjrDf","int",4),new CommandInfoModel("a_cfsDf","int",4),new CommandInfoModel("a_stfDf","int",4),new CommandInfoModel("a_hpRs","int",4),new CommandInfoModel("a_mpRs","int",4),new CommandInfoModel("a_hpAdd","int",4),new CommandInfoModel("a_mpAdd","int",4),new CommandInfoModel("a_expAdd","float",4),new CommandInfoModel("a_goldFd","float",4),new CommandInfoModel("a_mF","float",4)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1122,"Client");
                  infoArray =new CommandInfoModel[]{new CommandInfoModel("type","byte",1),new CommandInfoModel("pos","short",2)};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
                  model     =new CommandModel(1123,"Server");
                  infoArray =new CommandInfoModel[]{};
                  model.setCommandInfoModel(infoArray);
                  list.add(model);
              return list;
         }
      }
