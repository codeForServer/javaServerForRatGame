package netWork.resolve.send;

import java.awt.Point;
import java.io.IOException;
import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;

import com.commons.network.resolve.SendableBuffer;

/**
 * 点列表
 * @author 杜祥
 * @date 2012-11-29
 */
public class ListPointsSendable extends SendableBuffer 
{

	@SuppressWarnings("unchecked")
	@Override
	public void write(ChannelBuffer buffer, Object arg1)
	{
		List<Point> points = (List<Point>) arg1; 
		
		writeShort(buffer, points.size());
		for(Point point : points)
		{
			writeShort(buffer, point.y);
			writeShort(buffer, point.x);
		}
	}

}
