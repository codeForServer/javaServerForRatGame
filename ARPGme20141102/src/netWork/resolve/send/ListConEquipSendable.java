package netWork.resolve.send;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.resolve.SendableBuffer;

/**
 * 装备LIST
 * @author 	
 * @date	2012-12-13
 */
public class ListConEquipSendable extends SendableBuffer{

	@SuppressWarnings("unchecked")
	@Override
	public void write(ChannelBuffer buffer, Object obj) 
	{
/*		Map<Integer, NItemEntity> map = (HashMap<Integer, NItemEntity>) obj;
		writeShort(buffer, map.size());
		
		for(Entry<Integer, NItemEntity> entry : map.entrySet())
		{
			 道具属性 
			NItemEntity item = entry.getValue();		
			writeLong(buffer, item.getId());
			writeInt(buffer, item.getProtoId());
			writeShort(buffer, entry.getKey());
			writeByte(buffer, item.getbState());
			writeShort(buffer, item.getCount());
			
			 装备属性 
			ItemEquipAttribute eqAttr = item.getItEqAt();
			writeShort(buffer, item.getEnLv());
			writeShort(buffer, item.getAddLv());
			writeInt(buffer, eqAttr.getDblity());
			writeShort(buffer, eqAttr.getSuitLv());
			writeByte(buffer, item.getIdState());
		}*/
	}

}
