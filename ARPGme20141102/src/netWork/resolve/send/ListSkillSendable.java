package netWork.resolve.send;

import java.util.HashMap;
import java.util.Map.Entry;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.resolve.SendableBuffer;
import com.arpg.gline.gameserver.module.skill.entity.SkillEntity;

/**
 * 角色进入游戏加载技能列表发送的解析
 * @author 	欧阳
 * @date	2012-11-12
 */
public class ListSkillSendable  extends SendableBuffer
{
	
	@SuppressWarnings("unchecked")
	@Override
	public void write(ChannelBuffer buffer, Object value) 
	{
		HashMap<Integer, SkillEntity> map = (HashMap<Integer, SkillEntity>) value;
		
		writeShort(buffer, (short)map.size());
		SkillEntity skEntity = null;
		for(Entry<Integer, SkillEntity> entry : map.entrySet())
		{
			skEntity = entry.getValue();
			writeInt(buffer, skEntity.getId());
			writeInt(buffer, skEntity.getEffectId());
			writeInt(buffer, skEntity.getLevel());
/*			writeInt(buffer, skEntity.gainEqLv());
			writeInt(buffer, skEntity.getExp());*/
		}
	}
}
