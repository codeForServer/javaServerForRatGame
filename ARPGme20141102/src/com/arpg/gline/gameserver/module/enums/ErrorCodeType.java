package com.arpg.gline.gameserver.module.enums;

/**
 * 错误代码枚举
 * @author 
 * @date 2012-11-1
 */
public enum ErrorCodeType
{
	/*执行成功,无错误返回*/
	CODE_SUCCESS(0),
	/*角色性别非法，创建失败！*/
	CODE_ERROR1(1),
	/*角色职业非法，创建失败！*/
	CODE_ERROR2(2),
	/*角色名字超过14个字符，请重新输入！*/
	CODE_ERROR3(3),
	/*角色名字包含非法字符，请重新输入！*/
	CODE_ERROR4(4),
	/*铜钱数量已达上限，无法再获得铜钱！*/
	CODE_ERROR5(5),
	/*银子数量已达上限，无法再获得银子！*/
	CODE_ERROR6(6),
	/*绑定元宝数量已达上限，无法再获得绑定元宝！*/
	CODE_ERROR7(7),
	/*元宝数量已达上限，无法再获得元宝！*/
	CODE_ERROR8(8),
	/*战斗中无法打坐！*/
	CODE_ERROR9(9),
	/*战斗状态中无法上马！*/
	CODE_ERROR10(10),
	/*切换模式后，要在30分钟后才能再次切换！*/
	CODE_ERROR11(11),
	/*无提示*/
	CODE_ERROR12(12),
	/*目标地点无法达到！*/
	CODE_ERROR13(13),
	/*死亡状态下无法释放技能。*/
	CODE_ERROR14(14),
	/*死亡状态下无法切换技能。*/
	CODE_ERROR15(15),
	/*死亡状态下无法使用药品。*/
	CODE_ERROR16(16),
	/*死亡状态下无法进行打坐。*/
	CODE_ERROR17(17),
	/*死亡状态下无法进行上马。*/
	CODE_ERROR18(18),
	/*该名字已被使用，请换个名字吧。*/
	CODE_ERROR19(19),
	/*元宝不足，请充值！*/
	CODE_ERROR20(20),
	/*精力不足！*/
	CODE_ERROR21(21),
	/*银子不足！*/
	CODE_ERROR22(22),
	/*追加石不足！*/
	CODE_ERROR23(23),
	/*前置属性未激活！*/
	CODE_ERROR24(24),
	/*你身上没有复活丹，请购买！*/
	CODE_ERROR25(25),
	/*铜币不足！*/
	CODE_ERROR26(26),
	/*扫荡中，请稍后！*/
	CODE_ERROR27(27),
	/*背包已满，请腾出空间再行领取吧！*/
	CODE_ERROR28(28),
	/*死亡不能进入。*/
	CODE_ERROR29(29),
	/*等级不够不能进入副本。*/
	CODE_ERROR30(30),
	/*副本可打次数已达上限，不能进入该副本。*/
	CODE_ERROR31(31),
	/*您未装备武器，无法使用祝福油。*/
	CODE_ERROR32(32),
	/*您装备的武器幸运值已经提升至最大值，请装备其他武器继续提升。*/
	CODE_ERROR33(33),
	/*当前目标无法攻击！*/
	CODE_ERROR34(34),
	/*和平状态下无法攻击别人！*/
	CODE_ERROR35(35),
	/*该技能已学习*/
	CODE_ERROR36(36),
	/*学习该技能需要更高的体魄*/
	CODE_ERROR37(37),
	/*学习该技能需要更高的劲力*/
	CODE_ERROR38(38),
	/*学习该技能需要更高的修为*/
	CODE_ERROR39(39),
	/*学习该技能需要更高的手法*/
	CODE_ERROR40(40),
	/*没有该物品*/
	CODE_ERROR41(41),
	/*已经是屠戮模式,无法切换*/
	CODE_ERROR42(42),
	/*当前状态下，无法使用该物品 */
	CODE_ERROR43(43),
	/* 扫荡奖励无处存放，请先领取扫荡奖励 */
	CODE_ERROR44(44),
	/* 角色死亡,不能进入副本 */
	CODE_ERROR45(45),
	/* 战斗中不能进入副本 */
	CODE_ERROR46(46),
	/* 等级不够不能进入副本 */
	CODE_ERROR47(47),
	/* 可用次数为0不能进入副本 */
	CODE_ERROR48(48),
	/* 已经存在副本挑战 */
	CODE_ERROR49(49),
	/* 你需要一个目标 */
	CODE_ERROR50(50),
	/* 职业不对，无法使用该物品 */
	CODE_ERROR51(51),
	/* 等级不够，无法使用该物品 */
	CODE_ERROR52(52),
	/* 性别不对，无法使用该物品 */
	CODE_ERROR53(53),
	/* 劲力不够，无法使用该物品 */
	CODE_ERROR54(54),
	/* 修为不够，无法使用该物品 */
	CODE_ERROR55(55),
	/* 手法不够，无法使用该物品 */
	CODE_ERROR56(56),
	/* 体魄不够，无法使用该物品 */
	CODE_ERROR57(57),
	/* 该物品不可使用 */
	CODE_ERROR58(58),
	/* 副本不存在！*/
	CODE_ERROR59(59),
	/*背包已满，额外奖励将丢失，请清空背包再进行诱捕！*/
	CODE_ERROR60(60),
	/*使用数量不够！*/
	CODE_ERROR61(61),
	/*副本正在扫荡中!*/
	CODE_ERROR62(62),
	/*没有可以扫荡的副本*/
	CODE_ERROR63(63),
	/*副本地图不能进行扫荡*/
	CODE_ERROR64(64),
	
	/*抢购数量已达上限，无法再次购买！*/
	CODE_ERROR65(65),
	/*背包已满！*/
	CODE_ERROR66(66),
	
	/*当前位置不可拾取*/
	CODE_ERROR67(67),
	/*死亡状态下无法拾取。*/
	CODE_ERROR68(68),
	/*超出拾取范围 */
	CODE_ERROR69(69),
	/*保护期未过，不能拾取 */
	CODE_ERROR70(70),
	/*背包已满，不可拾取 */
	CODE_ERROR71(71),
	/*本周帮贡不足30万，不可申请帮战*/
	CODE_ERROR72(72),
	/*帮战申请已截止，请下周再来*/
	CODE_ERROR73(73),
	/*角色没有死亡，不能进行复活操作。*/
	CODE_ERROR74(74),
	/*副本扫荡未开始*/
	CODE_ERROR75(75),
	/*操作已超时*/
	CODE_ERROR76(76),
	/*冷却时间已结束，无法进行加速！*/
	CODE_ERROR77(77),
	/*精力溢出，恢复失败！*/
	CODE_ERROR106(106),
	/*血量已满，不可使用药品*/
	CODE_ERROR107(107),
	/*内功已满，不可使用药品*/
	CODE_ERROR108(108),
	/*你的等级已达到最高级，无法使用该物品*/
	CODE_ERROR109(109),
	/*不存在的副本，不能购买次数！*/
	CODE_ERROR114(114),
	/*绑定元宝不足*/
	CODE_ERROR115(115),
	/*背包空间不足*/
	CODE_ERROR116(116),
	/*货币类型不正确*/
	CODE_ERROR117(117),
	/*商品活动类型不正确*/
	CODE_ERROR118(118),
	/*活动商品不存在*/
	CODE_ERROR119(119),
	/*商品的购买数量超过限制！*/
	CODE_ERROR120(120),
	/*商品的剩余数量不足！*/
	CODE_ERROR121(121),
	/*追加等级前一级未激活*/
	CODE_ERROR122(122),
	/*铜币不足*/
	CODE_ERROR123(123),
	/*追加宝石数量不足*/
	CODE_ERROR124(124),
	/*该商品不能使用绑定元宝购买*/
	CODE_ERROR125(125),
	/*需要人物达到XX级才能穿戴！*/
	CODE_ERROR126(126),
	/*需要职业为XX才能穿戴！*/
	CODE_ERROR127(127),
	/*需要性别为X才能穿戴 */
	CODE_ERROR128(128),
	/*追加失败*/
	CODE_ERROR129(129),
	/*装备持久为0，不可穿戴！*/
	CODE_ERROR130(130)
	;
	
	private int code;
	
	
	private ErrorCodeType(int code)
	{
		this.code = code;
	}
	
	/**
	 * 获取错误代码
	 * @return
	 */
	public int getCode()
	{
		return this.code;
	}
}

