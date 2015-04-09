package util;

/**
 * 随机数工具包
 * @param           
 * @return
 * @create 2012-11-9 代金龙
 */
public class RandomUtil {

	
	/*产生small-big的随机数,small和big可以是任何的数值，即使是负数也一样*/
	public static int Int(int small,int big)
	{
		/*四舍五入*/
		Math.round(Math.random()*100); 
		if(small<=big)
		{
			return (int)Math.round(Math.random()*(big-small))+small; 
		}
		else
			return (int)Math.round(Math.random()*(small-big))+big; 	
	}
	
	/*产生0-a的随机数*/
	public static int IntFromZero(int a)
	{
		/*向上取整*/	
		return (int)Math.round(Math.random()*a); 
	}
	
	/*产生1-a的随机数*/
	public static int IntFromOne(int a)
	{
		return (int)Math.ceil(Math.random()*a); 
	}
	
	
	/*随机布尔值*/
	public static boolean Boolean()
	{
		long i = Math.round(Math.random()); 
		if(i==0)
			return false;
		else
			return true;
	}
	
}
