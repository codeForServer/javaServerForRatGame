package netWork.resolve.send;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.resolve.SendableBuffer;

/**
 * 发送节点
 * @author 杜祥
 * @date 2012-10-22
 */
public class ListNodeSenable extends SendableBuffer
{

	@SuppressWarnings("unchecked")
	@Override
	public void write(ChannelBuffer buffer, Object arg1)
	{
/*		List<Node> list = (List<Node>) arg1;
		writeShort(buffer, list.size());
		for(Node node : list)
		{
			writeShort(buffer, node.getX());
			writeShort(buffer, node.getY());
		}*/
	}

}
