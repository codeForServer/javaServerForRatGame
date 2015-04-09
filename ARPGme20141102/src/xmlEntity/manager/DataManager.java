package xmlEntity.manager;

import org.apache.log4j.Logger;

import xmlEntity.LvData;
import xmlEntity.database.DataHolder;

/**
 * ��Ϸԭ����ݹ�����
 * @author �����
 * @date 2012-12-19
 */
public class DataManager {
	
	public static Logger log = Logger.getLogger(DataManager.class);

	
	@DataHolder(name = "./data/lv.xml")
	public static LvData LV_DATA;
	

		
}
