package netBase;


/**
 * 发送的数据包
 *
 */
public abstract class SendablePacket extends AbstractPacket 
{

	public SendablePacket()
	{
	}
	
	/**
	 * 往数据流中写入一个byte（长度1）
	 * @param b
	 */
	protected final void writeB(byte b)
	{
		getBuffer().writeByte(b);
	}
	
	/**
	 * 往数据流中写入一个short（长度2）
	 * @param b
	 */
	protected final void writeS(short b)
	{
		getBuffer().writeShort(b);
	}
	
	
	/**
	 * 往数据流中写入一个Integer（长度4）
	 * @param b
	 */
	protected final void writeI(int b)
	{
		getBuffer().writeInt(b);
	}
	
	/**
	 * 往数据流中写入一个Long（长度8）
	 * @param b
	 */
	protected final void writeL(long b)
	{
		getBuffer().writeLong(b);
	}
	
	
	/**
	 * 往数据流中写入一个Float（长度4）
	 * @param b
	 */
	protected final void writeF(float b)
	{
		getBuffer().writeFloat(b);
	}
	
	/**
	 * 往数据流中写入一个Double（长度8）
	 * @param b
	 */
	protected final void writeD(double b)
	{
		getBuffer().writeDouble(b);
	}
	
	
	/**
	 * 往数据流中写入一个String（长度未知）
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
