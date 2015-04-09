package com.arpg.gline.gameserver.module.fight.utli;


/**
 * 属性转换工具类
 * @author 杜祥
 * @date 2012-10-31
 */
public class AttributeUtil 
{
	private final static AttributeUtil attributeUtil = new AttributeUtil();
	
	private AttributeUtil()
	{
	}
	
	public static AttributeUtil newInstance()
	{
		return attributeUtil;
	}
	
	
	/**
	 * 攻击属性计算
	 * @param lvAt				升级增加的攻击属性
	 * @param eqAt				装备增加的攻击属性
	 * @param skAt				技能增加的攻击属性
	 * @param eqAtf				装备增加的攻击属性百分比
	 * @param skAtf				技能增加的攻击属性百分比
	 * @param per				百分比
	 * @return					值
	 * @create 2012-10-31 杜祥
	 */
	public int countAttack(int lvAt, int eqAt, int skAt, float eqAtf, float skAtf,float per)
	{
		float f = (lvAt + eqAt + skAt) * (1f + eqAtf + skAtf) * (1f + per);
		
		return (int) f;
	}

}
