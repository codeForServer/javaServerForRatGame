package com.arpg.gline.gameserver.dataholders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.arpg.gline.gameserver.module.scene.model.PenaltyEquip;

/**
 * 映射penaltyequips.xml的根节点类
 * 死亡金钱惩罚等级,强化等级掉落几率,掉落强化等级
 * @author 庄宏晓
 * @Date 2012-10-24
 *
 */
@XmlRootElement(name = "penalty_equips")
@XmlAccessorType(XmlAccessType.FIELD)
public class PenaltyEquipData
{
	@XmlElement(name = "penalty_equip")
	private List<PenaltyEquip> listPtyEquips;
	
	private Map<Integer, PenaltyEquip> map = new HashMap<Integer, PenaltyEquip>();
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		for(PenaltyEquip temp : listPtyEquips)
		{
			map.put(temp.getLevel(), temp);
		}
		listPtyEquips = null;
		DataManager.log.info("loading PenaltyEquipData size:" + map.size());
	}
	
	public int size()
	{
		return map.size();
	}

	public Map<Integer, PenaltyEquip> getMap() {
		return map;
	}

	public PenaltyEquip get(int level)
	{
		return map.get(level);
	}
}
