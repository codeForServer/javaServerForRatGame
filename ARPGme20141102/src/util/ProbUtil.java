package util;

/**
 * 概率工具包
 * @param           
 * @return
 * @create 2012-11-9 代金龙
 */
public class ProbUtil {

	/**
	 * 独立概率 
	 * @param           
	 * @return  boolean 
	 * @create 2012-11-9 代金龙
	 */

	public static boolean probability(int prob) {

		if (prob >= RandomUtil.Int(1, 100)) {
			return true;
		}

		else
			return false;
	}


	/**
	 * 联合分布概率
	 * @param  所有概率权重（不需要相加为100）
	 * @return  返回被选中概率的参数位置
	 * @create 2012-12-25代金龙
	 */
	
	public static int unionProb(int... intArray)
	{
		int all=0;
	    for (int i : intArray)
	    {
	    	all +=i;
	    }
	    int random = RandomUtil.Int(1, all);  
	    
	    all =0 ;
	    int test=0;
	    for(int i : intArray)
	    {
	    	test +=i;
	    	if(random<test)
	    		return i;
	    	all++;
	    }
			return 0;
	}
}
