package netBase.Manager;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * BUFF����������
 * @author 	�����
 * @date	2012-12-24
 */
public class BufferManager {
	
	public static Logger log = Logger.getLogger(BufferManager.class);
	private  BufferManager(){}
	private final static BufferManager init = new BufferManager();
	public static BufferManager getInstance()
	{
		return init;
	}
	
	private static Map<String, Object  > receiveMap = new HashMap<String,Object >();
	private static Map<String, Object  > sendMap = new HashMap<String, Object >();
	
	/**
	 * ����ע�������
	 */
	public void registerReceivalbe(String list ,Object clazz)
	{
		if(receiveMap.containsKey(list))
		{
			log.info("BufferManager registerReceivalbe 已经存在，无法注册"+list);
			return ;
		}
		
		receiveMap.put(list, clazz);
		
		log.info("BufferManager 注册接收消息list"+list);
	}
	
	/**
	 * ����ע�������
	 */
	public void registerSendable (String list ,Object  clazz)
	{
		if(sendMap.containsKey(list))
		{
			log.info("已经存在，无法注册发送消息list"+list);
			return ;
		}
		
		sendMap.put(list, clazz);
		
		log.info("BufferManager 注册发送消息list"+list);
	}
	
	/**
	 * ͨ������ ��ȡ��Ӧ���ܽ���
	 */
	public Object getReceivable(String type)
	{
		if(receiveMap.containsKey(type))
		{
			return receiveMap.get(type);
		}
		else
		{
			return null;
		}
	}
	
	/**
	 * ͨ������ ��ȡ��Ӧ���ͽ���
	 */
	public Object  getSendable(String type)
	{
		if(sendMap.containsKey(type))
		{
			return sendMap.get(type);
		}
		else
		{
			return null;
		}
	}
	

	/**
	 * �ر�ϵͳ
	 */
	public void shutdown() {
		 receiveMap.clear();
		 sendMap.clear();
	}
}