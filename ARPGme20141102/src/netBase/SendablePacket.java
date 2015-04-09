package netBase;


/**
 * ���͵����ݰ�
 *
 */
public abstract class SendablePacket extends AbstractPacket 
{

	public SendablePacket()
	{
	}
	
	/**
	 * ����������д��һ��byte������1��
	 * @param b
	 */
	protected final void writeB(byte b)
	{
		getBuffer().writeByte(b);
	}
	
	/**
	 * ����������д��һ��short������2��
	 * @param b
	 */
	protected final void writeS(short b)
	{
		getBuffer().writeShort(b);
	}
	
	
	/**
	 * ����������д��һ��Integer������4��
	 * @param b
	 */
	protected final void writeI(int b)
	{
		getBuffer().writeInt(b);
	}
	
	/**
	 * ����������д��һ��Long������8��
	 * @param b
	 */
	protected final void writeL(long b)
	{
		getBuffer().writeLong(b);
	}
	
	
	/**
	 * ����������д��һ��Float������4��
	 * @param b
	 */
	protected final void writeF(float b)
	{
		getBuffer().writeFloat(b);
	}
	
	/**
	 * ����������д��һ��Double������8��
	 * @param b
	 */
	protected final void writeD(double b)
	{
		getBuffer().writeDouble(b);
	}
	
	
	/**
	 * ����������д��һ��String������δ֪��
	 * @param b
	 */
	protected final void writeStr(String b)
	{
		for(int i = 0 ; i < b.length() ; i++)
		{
			getBuffer().writeChar(b.charAt(i));
		}
		
		getBuffer().writeChar('\000');
	}
	
	protected final void writeBS(byte[] bs)
	{
		getBuffer().writeBytes(bs);
	}

	
}
