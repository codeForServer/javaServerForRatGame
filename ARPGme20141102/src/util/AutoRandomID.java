package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用日期产生物品ID
 */
public class AutoRandomID 
{
	/**
	 * 取新增物品ID
	 * @return	新增物品ID
	 */
	public static int randomRoleArticleId()
	{
		//停顿15毫秒再取随机ID
		try
		{
			Thread.sleep(15);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}		
		 Date date=new Date();
		 //d -- 表示当前天号 k -- 表示当前小时(1-24) m -- 表示当前分钟 S -- 表示当前毫秒
		 SimpleDateFormat sf=new SimpleDateFormat("dkmS");
		 //System.out.println(sf.format(date));
		 return Integer.parseInt(sf.format(date));
	}
}
