package com.arpg.gline.gameserver.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class SystemConfig {
	
	public static String ip;
	
	/**
	 * �������˿�
	 */
	public static int port=0;
	
	/**
	 * ϵͳ����������
	 */
	public static int serverPass=0;
	
	/**
	 * ����ٶ��ݲ�(��λ:����ÿ��)
	 */
	public static double speedMaxAllowance=0;
	
	/**
	 * �����̹���ʱ��(��λ:����)
	 */
	public static long shortestAttackTime;
	
	/**
	 * �Ƿ�Ϊ ս��������
	 * 
	 * true �� ս��������
	 * false:  ��Ϊս��������
	 */
	public static boolean isWarServer = false;
	/**
	 * �������߳��Ƿ���
	 * true:����
	 * false:δ����
	 */
	public static boolean isArena=false;
	
	/**
	 * ���ؽ��� 0 ʱ 0 �� ����
	 */
	public static int DAY_FOR_ZERO = 0;
	
	/**
	 * ��ݷ�������Ϣ
	 */
	//public static DatacommInfo datacommInfo=new DatacommInfo();
	
	/**
	 * �߷�������Ϣ
	 */
	//public static LineInfo lineInfo=new LineInfo();
	
	/**
	 * ��¼ָʾ(1��������,2��������������,3����������ά��)
	 */
	public static int loginNormal = 1;
	public static int loginFull = 2;
	public static int loginClose = 3;
	
	public static int loginDenote=loginNormal;
	
	
	public static void writePId(String PID) {
		Properties prop = new Properties();
		String filePath=System.getProperties().getProperty("user.dir")+"/resource/run.properties";
		try {
			InputStream fis = new FileInputStream(filePath);
			// ���������ж�ȡ�����б?���Ԫ�ضԣ�
			prop.load(fis);
			// ���� Hashtable �ķ��� put��ʹ�� getProperty �����ṩ�����ԡ�
			// ǿ��Ҫ��Ϊ���Եļ��ֵʹ���ַ�����ֵ�� Hashtable ���� put �Ľ��
			OutputStream fos = new FileOutputStream(filePath);
			prop.setProperty("PID", PID);
			// ���ʺ�ʹ�� load �������ص� Properties ���еĸ�ʽ��
			// ���� Properties ���е������б?���Ԫ�ضԣ�д�������
			prop.store(fos, "save 'PID' value");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
