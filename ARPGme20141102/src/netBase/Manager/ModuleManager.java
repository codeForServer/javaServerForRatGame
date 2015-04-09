package netBase.Manager;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;


/**
 * 模块注册
 * @author 	timosky
 * @date	2012-12-24
 */
public class ModuleManager {
	
	public static Logger log = Logger.getLogger(ModuleManager.class);
	private final static ModuleManager singleton = new ModuleManager();
	private ModuleManager() {}
	public static ModuleManager getInstance() {
		return singleton;
	}
	
	private static Map<Integer,  Class<?> > modelMap = new HashMap<Integer,   Class<?>>();
	
	/**
	 * ע�������
	 */
	public void register(int type, Class<?> clazz)
	{	
		if(modelMap.containsKey(type))
		{
			log.info("model�Ѿ�����");
			return ;
		}
		
		modelMap.put(type, clazz);
		
		log.info("modelע��ɹ�");
	}
	
	/**
	 * ͨ������ ��ȡ��Ӧģ����
	 */
	public Class<?> get(int type)
	{
		if(modelMap.containsKey(type))
		{
			return modelMap.get(type);
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
		modelMap.clear();
	}
}