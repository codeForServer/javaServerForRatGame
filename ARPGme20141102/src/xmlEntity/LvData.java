package xmlEntity;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.arpg.gline.gameserver.module.person.model.LvAddModel;

/**
 * �ȼ������辭���࣬ӳ���ڵ�
 * @author �����
 * @Date 2012-9-26
 */

@XmlRootElement(name = "levels")
@XmlAccessorType(XmlAccessType.FIELD) //�����ֶλ����Ե����л���FIELD��ʾJAXB���Զ���Java���е�ÿ���Ǿ�̬�ġ���˲̬�ģ���@XmlTransient��ע���ֶε�XML
public class LvData {
	
	@XmlElement(name = "level")
	private List<LvAddModel> list ;
	//= new ArrayList<LvAddModel>();
	
	private Map<Integer,LvAddModel> expMap = new HashMap<Integer,LvAddModel>();
	
	void afterUnmarshal(Unmarshaller u, Object parent)
	{
		for(LvAddModel  model : list)
		{
			expMap.put(model.getLv(), model);
		}
		list = null;
	}
	
	public int size()
	{
		return expMap.size();
	}
	
	public LvAddModel get(int id)
	{
		return expMap.get(id);
	}

	public Map<Integer, LvAddModel> getMap() {
		return expMap;
	}

}
