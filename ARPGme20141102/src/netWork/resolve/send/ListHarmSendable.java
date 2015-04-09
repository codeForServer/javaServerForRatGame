package netWork.resolve.send;

import java.io.IOException;
import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.resolve.SendableBuffer;

/**
 * 战斗信息列表
 * @author 杜祥
 * @date 2012-11-10
 */
public class ListHarmSendable extends SendableBuffer
{

	@SuppressWarnings("unchecked")
	@Override
	public void write(ChannelBuffer buffer, Object arg1)
	{
		/*List<HarmModel> list = (List<HarmModel>)arg1;
		
		writeShort(buffer, list.size());
		for(HarmModel model : list)
		{
			writeLong(buffer, model.getId());
			writeByte(buffer, model.getType());
			writeInt(buffer, model.getHarm());
			writeByte(buffer, model.getMiss());
			writeByte(buffer, model.getCrit());
		}*/
	}

}
