package xmlEntity.database;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


/**
 * 使用JAXB将XML数据绑定，转换为java类
 * @author 代金龙
 * @date 2012-1-7
 */
public class XmlObjectUtil
{

	/**
	 * XML转java
	 */
  public static  Object XmlToJavaBean(String str, Class<?> clazz)  throws Exception{
	  
    JAXBContext jc = JAXBContext.newInstance(new Class[] { clazz });
    Unmarshaller un = jc.createUnmarshaller();
    Object t = un.unmarshal(new File(str));
    return t;
  }

	/**
	 * XML转java
	 */
  public static <T> Object XmlToJavaBean(File file, Class<T> clazz) throws Exception {
	  
    JAXBContext jc = JAXBContext.newInstance(new Class[] { clazz });
    Unmarshaller un = jc.createUnmarshaller();
    Object t = un.unmarshal(file);
    return t;
  }

	/**
	 * Java转XML
	 */
  public static void JavaBeanToXml(String file, Object obj) throws Exception{
	  
    JAXBContext jc = JAXBContext.newInstance(new Class[] { obj.getClass() });
    Marshaller ms = jc.createMarshaller();
    ms.setProperty("jaxb.formatted.output", Boolean.TRUE);
    FileOutputStream stream = new FileOutputStream(file);
    ms.marshal(obj, stream);
  }
}
