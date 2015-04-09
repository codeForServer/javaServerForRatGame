package netWork.resolve.receive;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import com.commons.network.resolve.ReceivableBuffer;

/**
 * List<Integer> 的解析方式
 * @author 杜祥
 * @date 2012-10-12
 */
public class ListIntReceivable extends ReceivableBuffer 
{

	@Override
	public Object read(ByteBuffer byteBuffer)
	{
		List<Integer> list = new ArrayList<Integer>();
		int length = readShort(byteBuffer);
		for(int i = 0; i < length; i++)
		{
			list.add(readInt(byteBuffer));
		}
		return list;
	}

	
}
