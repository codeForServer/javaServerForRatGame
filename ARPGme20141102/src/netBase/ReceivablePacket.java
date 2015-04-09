package netBase;

import java.io.Serializable;

import org.jboss.netty.buffer.ChannelBuffer;


/**
 * ���հ�
 * @author ������
 */
public class ReceivablePacket extends AbstractPacket  implements Serializable  
{
	
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * ���캯��
	 */
	public ReceivablePacket(int module, int opcode, ChannelBuffer buff )
	{
		super( module,  opcode,  buff );
	}	
	
	public ReceivablePacket(){}

	/**
	 * ������Ϣ
	 */
	protected final void send(Object object)
	{
		this.getClient().getChannel().write(object);
	}

	
	/**
	 * ���������л�ȡһ��byte(����1)
	 * @return Integer
	 */
	protected final int readB()
	{
		return getBuffer().readByte();
	}
	
	/**
	 * ���������л�ȡһ��short(����2)
	 * @return Integer
	 */
	protected final int readS()
	{
		return getBuffer().readShort();
	}
	
	/**
	 * ���������л�ȡһ��Integer(����4)
	 * @return Integer
	 */
	protected final int readI()
	{
		return getBuffer().readInt();
	}
	
	/**
	 * ���������л�ȡһ��Long(����8)
	 * @return Long
	 */
	protected final long readL()
	{
		return getBuffer().readLong();
	}
	
	/**
	 * ���������л�ȡһ��Float(����4)
	 * @return Float
	 */
	protected final float readF()
	{
		return getBuffer().readFloat();
	}
	
	
	/**
	 * ���������л�ȡһ��Double(����8)
	 * @return Double
	 */
	protected final double readD()
	{
		return getBuffer().readDouble();
	}
	
	/**
	 * ���������л�ȡһ���ַ���(����λ��)
	 * @return String
	 */
	protected final String readStr()
	{
		StringBuffer stringbuff = new StringBuffer();
		
		for (char c; (c = getBuffer().readChar()) != 0;)
			stringbuff.append(c);
		
		return stringbuff.toString();
	}
	
	/**
	 * ��ʣ����������е�ֱ�Ӷ�ȡ��������byteArray��
	 * @return
	 */
	protected final byte[] readBs()
	{
		byte[] _byte = new byte[getBuffer().capacity() - getBuffer().readerIndex()];
		
		getBuffer().readBytes(_byte);
		
		return _byte;
	}
	
	/**
	 * ��ȡָ�����ȵ�byteArray���ֽ���
	 */
	protected final byte[] readBs(int length)
	{
		byte[] _byte = new byte[length];
				
		getBuffer().readBytes(_byte);
		
		return _byte;
	}
	
	/**
	 * ���������л�ȡһ������(����λ��)
	 * @return Object
	 */
	protected final Object readObj()
	{
		byte[] bytes = new byte[getBuffer().capacity() - getBuffer().readerIndex()];
		
		return bytes;
	}

}

