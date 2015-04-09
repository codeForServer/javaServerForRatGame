package netBase;

import netBase.util.GameClient;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * 网络数据包
 * 
 * 其实可以用client代替playerID作为key
 * @author TimoSky..
 *
 */
public abstract class AbstractPacket
{
	private int opcode;//����
	
	private ChannelBuffer buffer;//������
		
	private int module;//ģ��	
	
	private GameClient client;// ����
	
	
	/**
	 * ���캯��
	 */
	public AbstractPacket(int module, int opcode, ChannelBuffer buff )
	{
		this.module = module;
		this.opcode = opcode;
		this.buffer = buff; 
	}
	public AbstractPacket(){	}
	
	
	public void addClient(int id)
	{
		this.client = World.newInstance().getChannel(id);
	}
	
	
	
	/*-------------get set方法------------*/
	
	
	public int getModule() {
		return module;
	}

	public void setModule(int module) {
		this.module = module;
	}

	public final GameClient getClient() {
		if(this.client == null)
			this.client = World.newInstance().getChannel(this.opcode);
		return this.client;
	}

	public void setClient(GameClient client) {
		this.client = client;
	}

	public int getOpcode() 
	{
		return opcode;
	}
	
	public void setOpcode(int opcode)
	{
		this.opcode = opcode;
	}


	public  ChannelBuffer getBuffer()
	{
		return buffer;
	}

	public final void setBuffer(ChannelBuffer buff)
	{
		this.buffer = buff;
	}
	
	
}
