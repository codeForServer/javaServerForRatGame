package com.arpg.gline.gameserver.dataholders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.arpg.gline.gameserver.module.scene.model.PenaltyMoney;

/**
 * 映射penaltyMoneys.xml的根节点类
 * 死亡金钱惩罚等级,掉落几率,掉落百分比类
 * @author 庄宏晓
 * @Date 2012-10-23
 *
 */
@XmlRootElement(name = "penalty_moneys")
@XmlAccessorType(XmlAccessType.FIELD)
public class PenaltyMoneyData 
{
	@XmlElement(name = "penalty_money")
	private List<PenaltyMoney> listPtyMoneys;
	
	private Map<Integer, PenaltyMoney> map = new HashMap<Integer, PenaltyMoney>();
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		for(PenaltyMoney temp : listPtyMoneys)
		{
			map.put(temp.getLevel(), temp);
		}
		listPtyMoneys = null;
		DataManager.log.info("loading PenaltyMoneyData size:" + map.size());
	}
	
	public int size()
	{
		return map.size();
	}

	public Map<Integer, PenaltyMoney> getMap() {
		return map;
	}

	public PenaltyMoney get(int level)
	{
		return map.get(level);
	}
}
