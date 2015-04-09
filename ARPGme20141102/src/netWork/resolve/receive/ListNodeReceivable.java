package netWork.resolve.receive;

import java.nio.ByteBuffer;

import com.commons.network.resolve.ReceivableBuffer;

/**
 * 接收前端发来的节点
 * @author 杜祥
 * @date 2012-10-19
 */
public class ListNodeReceivable extends ReceivableBuffer 
{
	

	@Override
	public Object read(ByteBuffer byteBuffer) 
	{
/*		List<Node> list = new ArrayList<Node>();
		int length = readShort(byteBuffer);
		Node node;
		for(int i = 0; i < length; i++)
		{
			node = new Node(readShort(byteBuffer), readShort(byteBuffer));
	//		node.setDirection(readByte(byteBuffer));
			list.add(node);
		}
		return list;*/
		return null;
	}

}
