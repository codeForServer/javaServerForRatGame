package netWork.resolve.send;

import java.io.IOException;
import java.util.Collection;

import org.jboss.netty.buffer.ChannelBuffer;

import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;
import com.commons.network.resolve.SendableBuffer;

/**
 * 场景里发送玩家实体的解析
 * @author 杜祥
 * @date 2012-10-12
 */
public class ListSPlayerSendable extends SendableBuffer
{
	@SuppressWarnings("unchecked")
	@Override
	public void write(ChannelBuffer buffer, Object value)
	{
		Collection<PlayerEntity> list = (Collection<PlayerEntity>) value;
		/*写入list的长度*/
		writeShort(buffer, list.size());
		for(PlayerEntity player : list)
		{
			/*writeLong(buffer, player.getId());
			
			等级，职业，性别
			writeInt(buffer, player.getLevel());
			writeByte(buffer, player.getProfession());
			writeByte(buffer, player.getSex());
			
			writeString(buffer, player.getName());
			当前血量和内力值
			writeInt(buffer, player.getHp());
			writeInt(buffer, player.getMp());
			最大血量和内力值
			writeInt(buffer, player.gainHpMax());
			writeInt(buffer, player.gainMpMax());
			是否生存
			writeByte(buffer, player.getState().isLive() == true ? 0 : 1);
			当前坐标
			writeShort(buffer, player.getX());
			writeShort(buffer, player.getY());
			int[] co = player.gainEquipContainer().gainClothesIdLv();*/
		}
	}
}
