package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �����ڲ�����ƷID
 */
public class AutoRandomID 
{
	/**
	 * ȡ������ƷID
	 * @return	������ƷID
	 */
	public static int randomRoleArticleId()
	{
		//ͣ��15������ȡ���ID
		try
		{
			Thread.sleep(15);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		 Date date=new Date();
		 //d -- ��ʾ��ǰ��� k -- ��ʾ��ǰСʱ(1-24) m -- ��ʾ��ǰ���� S -- ��ʾ��ǰ����
		 SimpleDateFormat sf=new SimpleDateFormat("dkmS");
		 //System.out.println(sf.format(date));
		 return Integer.parseInt(sf.format(date));
	}
}
