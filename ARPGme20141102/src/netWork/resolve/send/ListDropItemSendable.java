package netWork.resolve.send;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.resolve.SendableBuffer;

/**
 * 掉落道具列表
 * @author 	darren.ouyang
 * @date	2012-12-1
 */
public class ListDropItemSendable extends SendableBuffer 
{

	@SuppressWarnings("unchecked")
	@Override
	public void write(ChannelBuffer buffer, Object arg1)
	{
		/*List<DropEntity> list = (List<DropEntity>) arg1; 
		
		writeShort(buffer, list.size());
		for(DropEntity drop : list)
		{
			writeInt(buffer, DropIdUtil.newInstance().getId(drop.getX(), drop.getY()));
			writeShort(buffer, drop.getX());
			writeShort(buffer, drop.getY());
			writeInt(buffer, drop.getItemPId());
			writeInt(buffer, drop.getItemCount());
		}*/
	}

}
