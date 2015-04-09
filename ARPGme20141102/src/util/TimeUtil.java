package util;

/**
 * 时间工具类
 * @author 庄宏晓
 * @Date	2012-11-13
 *
 */
public class TimeUtil {
	private static TimeUtil timeUtil = new TimeUtil();
	
	public static TimeUtil newInstance(){
		return timeUtil;
	}
	
	private TimeUtil(){}
	/**
	 * 每秒的毫秒数表示
	 */
	public static final long SECOND = 1000;
	/**
	 * 每分的秒数表示
	 */
	public static final long MINUTE = SECOND * 60;
	/**
	 * 每小时的分钟数表示
	 */
	public static final long HOUR = MINUTE * 60;
	/**
	 * 每天的小时数表示
	 */
	public static final long DAY = HOUR * 24;
	
	/**
	 * @return	1900年1月1号到现在的天数
	 * @create	2012-11-13	庄宏晓
	 */
	public int currentDays(){
		return (int)((System.currentTimeMillis()) / DAY);
	}
	
	/**
	 * @return	凌晨00:00到现在过去的毫秒数(北京时区)
	 * @create	2012-11-13	庄宏晓
	 */
	public long toDayTime(){
		return System.currentTimeMillis() % DAY + HOUR * 8;
	}
	
	/**
	 * @return	今天时间 剩余的毫秒数（北京时区）
	 * @create	2012-11-13	庄宏晓
	 */
	public long toDayReMain(){
		return DAY - toDayTime();
	}
	
	/**
	 * 判断是否同一天
	 * @param time1	时间a
	 * @param time2	时间b
	 * @return	true为同一天、 false不是同一天
	 * @create	2012-11-13	庄宏晓
	 */
	public boolean isSameDay(long time1, long time2){
		return time1 / DAY == time2 / DAY;
	}
	
	/**
	 * 计算时间差
	 * @param beginTime	开始时间
	 * @param endTime	结束时间
	 * @return			时间差（毫秒）
	 * @create	2012-11-14	庄宏晓
	 */
	public long countMS(long beginTime, long endTime){
		return endTime - beginTime;
	}
	
	/**
	 * 计算时间差
	 * @param beginTime	开始时间
	 * @param endTime	结束时间
	 * @return			时间差（秒）
	 * @create	2012-11-14	庄宏晓
	 */
	public long countSecond(long beginTime, long endTime){
		long count = (endTime - beginTime) / SECOND;
		return (endTime - beginTime) % SECOND != 0 ? count + 1 : count;
	}
	
	/**
	 * 计算时间差
	 * @param beginTime	开始时间
	 * @param endTime	结束时间
	 * @return			时间差（分）
	 * @create	2012-12-11-15	庄宏晓
	 */
	public long countMinute(long beginTime, long endTime)
	{
		long count = (endTime - beginTime) / MINUTE;
		return (endTime - beginTime) % MINUTE != 0 ? count + 1 : count;
	}
	
	/**
	 * 根据现在当前时间差，计算目的时间点
	 * @param time	当前时间差
	 * @return		目的时间点
	 * @create	2012-11-14	庄宏晓
	 */
	public long countTime(long time){
		return System.currentTimeMillis() + time;
	}
	
	/**
	 * 判断时间是否超时
	 * @param time	判断的时间
	 * @param nowTime	现在时间
	 * @return		true未超时、false超时
	 * @create	2012-11-14	庄宏晓
	 */
	public boolean timeOver(long time, long nowTime){
		return time <= nowTime;
	}
	
	/**
	 * 计算第二天凌晨00:00的时间
	 * @param nowTime	某一天
	 * @return			第二天凌晨00:00的时间
	 * @create	2012-11-14	庄宏晓
	 */
	public long dayEnd(long nowTime)
	{
		return nowTime + (DAY - nowTime % DAY); 
	}
	
	/**
	 * 判断计算小时从开始过去了多少时间
	 * @param time	时间点
	 * @return	过去的时间
	 * @create 2012-12-12	庄宏晓
	 */
	public long countHour(long time){
		return time % HOUR;
	}
	
	/**
	 * 计算时间点到下一个小时需要的时间
	 * @param time	时间点
	 * @return	剩余时间
	 * @create 2012-12-12	庄宏晓
	 */
	public long countEndHour(long time){
		long result = countHour(time);
		return result == 0 ? HOUR : HOUR - result;
	}
	
}
