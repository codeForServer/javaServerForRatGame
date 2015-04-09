package netWork.resolve.send;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.resolve.SendableBuffer;

/**
 * 道具列表
 * @author 	darren.ouyang
 * @date	2012-12-13
 */
public class ListConItemSendable extends SendableBuffer{

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
		}	*/	
	}

}
