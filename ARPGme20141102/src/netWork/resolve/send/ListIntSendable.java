package netWork.resolve.send;

import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.resolve.SendableBuffer;

/**
 * 发送list<Integer>的解析
 * @author 杜祥
 * @date 2012-10-12
 */
public class ListIntSendable extends SendableBuffer 
{

	@SuppressWarnings("unchecked")
	@Override
	public void write(ChannelBuffer buffer, Object obj)
	{
		List<Integer> list = (List<Integer>) obj;
		writeShort(buffer, (short) list.size());
		for(int i : list)
		{
			writeInt(buffer, list.get(i));
		}
	}

}
