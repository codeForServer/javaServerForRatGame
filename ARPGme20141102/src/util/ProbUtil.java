package util;

/**
 * ���ʹ��߰�
 * @param           
 * @return
 * @create 2012-11-9 ������
 */
public class ProbUtil {

	/**
	 * �������� 
	 * @param           
	 * @return  boolean 
	 * @create 2012-11-9 ������
	 */

	public static boolean probability(int prob) {

		if (prob >= RandomUtil.Int(1, 100)) {
			return true;
		}

		else
			return false;
	}


	/**
	 * ���Ϸֲ�����
	 * @param  ���и���Ȩ�أ�����Ҫ���Ϊ100��
	 * @return  ���ر�ѡ�и��ʵĲ���λ��
	 * @create 2012-12-25������
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
