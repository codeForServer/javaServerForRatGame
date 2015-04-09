package netBase.Manager;

import java.nio.ByteOrder;

import netBase.util.GameClient;

import org.apache.log4j.Logger;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

/**
 * ��Ϣ��װ�� 
 * @author �����
 * @date 2013.3.8
 */
public abstract class MessageManager
{
	private static final Logger log = Logger.getLogger(MessageManager.class);
	
	public static void send(GameClient client, ChannelBuffer buf)
	{
		client.getChannel().write(buf);  
	}

	
	/**
	 * ����״̬���ı���
	 */
	protected static ChannelBuffer encode(ChannelBuffer buffer, int moduleId, int opcode, Object... objects)
	{
		buffer.writeShort((short)moduleId);
		buffer.writeShort((short)opcode);
		
		/*��Object����ת��Ϊ��������*/
		for(Object obj: objects)
		{
		 	
			if(obj == null)
			{
				return null;
			}
			else if(obj instanceof Integer)
    		{
				int newObj = Integer.parseInt(String.valueOf(obj));
				log.info(newObj);
    			buffer.writeInt(newObj);
    		}
    	
			else if(obj instanceof Byte)
	    	{
	    		byte[] newObj = (byte[])obj;
	    		buffer.writeBytes(newObj);
		    }
		    	
		    else if(obj instanceof String)
		    {
		    	String newObj = (String)obj;
		    	byte[] newByte = newObj.getBytes();
		    	buffer.writeBytes(newByte);
                //CHARĬ��ֵΪ '\u0000'
                buffer.writeChar('\u0000');
		    	
		    }
		    	
		    else if(obj instanceof Short)
	    	{
	    		Short newShort = (Short)obj;
	    		buffer.writeShort(newShort);
	    	}
	    	
	    	else if(obj instanceof Long)
	    	{
	    		long newObj =Long.valueOf(obj.toString());
	    		buffer.writeLong(newObj);
	    	}
		    	
	    	//����ֵ��0��1���� 
	    	/*else if (obj instanceof Boolean)
	    	{
	    		String newString =(String)obj;
	    		boolean newObj =  Boolean.getBoolean(newString);
	    		buffer.write
	    	}*/
	    	
	    	//char��string����
	    	else if (obj instanceof Character)
	    	{
	    		char newString =(char)obj;
	    		buffer.writeChar(newString);
	    		
	    	}
    	
    		else if (obj instanceof  Double)
    		{
    			double newObj =  Double.parseDouble(obj.toString());
    			buffer.writeDouble(newObj);
    		
    		}
    	
    		else if (obj instanceof Float)
    		{
    			float newObj=Float.parseFloat(obj.toString());
    			buffer.writeFloat(newObj);
    		}
    	}
    
    	return buffer;
  	}

	/**
	 * ��״̬�ı���,������
	 */
	public static ChannelBuffer encodeResult(ChannelBuffer buffer, int moduleId, int opcode, int result, Object... objects)
	{
		buffer.writeInt(result);
		encode(buffer, moduleId,opcode,objects);
		return buffer;
	}
  
  
  /*��װ����buffer�ķ���*/
	//ע�� ServerEncoder�õ���dynamicBuffer �Ǵ�˱��룬�������Ҫ��ServerEncoder���dynamicBuffer��������ȫ��������BIG_ENDIAN
  protected static ChannelBuffer createBuffer128()
  {
    ChannelBuffer channelBuffer = ChannelBuffers.buffer(ByteOrder.BIG_ENDIAN, 128);
    return channelBuffer;
  }

  protected static ChannelBuffer createBuffer512()
  {
    ChannelBuffer channelBuffer = ChannelBuffers.buffer(ByteOrder.BIG_ENDIAN, 512);
    return channelBuffer;
  }

  protected static ChannelBuffer createBuffer1024()
  {
    ChannelBuffer channelBuffer = ChannelBuffers.buffer(ByteOrder.BIG_ENDIAN, 1024);
    return channelBuffer;
  }

  protected static ChannelBuffer createBuffer2048()
  {
    ChannelBuffer channelBuffer = ChannelBuffers.buffer(ByteOrder.BIG_ENDIAN, 2048);
    return channelBuffer;
  }

  protected static ChannelBuffer createBuffer(int length)
  {
    ChannelBuffer channelBuffer = ChannelBuffers.buffer(ByteOrder.BIG_ENDIAN, length);
    return channelBuffer;
  }
}
