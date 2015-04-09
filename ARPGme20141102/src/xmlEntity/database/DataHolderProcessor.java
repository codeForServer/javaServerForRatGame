package xmlEntity.database;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.apache.log4j.Logger;

/**
 * XML������ע��Ľ���
 * @author �����
 * @Date 2012-1-7
 */
public class DataHolderProcessor
{
	
	public static Logger log = Logger.getLogger(DataHolderProcessor.class);
	
  public static void process(Object obj)
  {
    Class<?> clazz = null;
    	
    if ((obj instanceof Class))
    {
      clazz = (Class<?>)obj;
      obj = null;
    }
    else
    {
      clazz = obj.getClass();
    }

    process(clazz, obj);
  }

  private static void process(Class<?> clazz, Object obj)
  {
    processField(clazz, obj);
    if (obj == null)
    {
      for (Class<?> itf : clazz.getInterfaces())
      {
        process(itf, obj);
      }
    }

    Class<?> superClass = clazz.getSuperclass();
    if ((superClass != null) && (superClass != Object.class))
    {
      process(superClass);
    }
  }

  private static void processField(Class<?> clazz, Object obj)
  {
    for (Field f : clazz.getDeclaredFields())
    {
    	/*������η���static*/
      if ((Modifier.isStatic(f.getModifiers())) && (obj != null))
      {
        continue;
      }
      if ((!Modifier.isStatic(f.getModifiers())) && (obj == null))
      {
        continue;
      }
      
      /*������η���Final���׳��쳣*/
      if (Modifier.isFinal(f.getModifiers()))
      {
        StringBuilder builder = new StringBuilder("[");
        builder.append(clazz.getName()).append("]:[").append(f.getName()).append("]");
        log.error(builder.toString());
        RuntimeException re = new RuntimeException(builder.toString());
        throw re;
      }
      
      /*���ע��������DataHolder.clas*/
      if (f.isAnnotationPresent(DataHolder.class))
      {
        processField(f, obj);
      }
    }
  }

  private static void processField(Field f, Object obj)
  {
    /*����ע��Ȩ��*/
    f.setAccessible(true);

    DataHolder dataholder = (DataHolder)f.getAnnotation(DataHolder.class);

    if (dataholder.name().isEmpty())
    {
      log.warn("DataHolder " + f.getName() + " class " + f.getDeclaringClass().getName() + " lengΪ0");
    }
    else
    {
      File file = new File(dataholder.name());

      /*�����ļ�����*/
      if (file.exists())
      {
        try
        {
          f.set(obj, XmlObjectUtil.XmlToJavaBean(file, f.getType()));
          log.info("load "+dataholder.name());
          
        }
        catch (Exception e)
        {
          StringBuilder builder = new StringBuilder("load fail..[").append(f.getDeclaringClass().getName());
          builder.append("][").append(f.getName()).append("][").append(dataholder.name());
          builder.append("]");
          log.error(builder.toString(), e);
        }

      }
      else
      {
        StringBuilder builder = new StringBuilder("load[").append(f.getDeclaringClass().getName());
        builder.append("][").append(f.getName()).append("][").append(dataholder.name());
        builder.append("]");
        log.warn(builder.toString());
      }
    }
  }

}
    


