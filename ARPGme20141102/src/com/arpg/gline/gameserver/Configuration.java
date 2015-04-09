package com.arpg.gline.gameserver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

/**
 * 序列化的配置类
 * @author 
 *
 */
public class Configuration implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Properties propertie;
	private FileInputStream inputFile;
	private FileOutputStream outputFile;


	public Configuration()
	{
		propertie = new Properties();
	}

	/**
	 * 根据文件路径构建配置类
	 * @param filePath 文件路径
	 */
	public Configuration(String filePath)
	{
		propertie = new Properties();
		try {
			inputFile = new FileInputStream(filePath);
			propertie.load(inputFile);
			inputFile.close();
		}
		catch (FileNotFoundException ex) 
		{
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}


	/**
	 * 根据配置键获取配置键值
	 * @param key 配置键
	 * @return 配置键值
	 */
	public String getValue(String key)
	{
		if(propertie.containsKey(key)){
			String value = propertie.getProperty(key);
			return value;
		}
		else 
			return "";
	}

	/**
	 * 根据配置文件路径,配置键获取配置键值
	 * @param fileName 配置文件路径
	 * @param key 配置键
	 * @return 配置键值
	 */
	public String getValue(String fileName, String key)
	{
		try {
			String value = "";
			inputFile = new FileInputStream(fileName);
			propertie.load(inputFile);
			inputFile.close();
			if(propertie.containsKey(key)){
				value = propertie.getProperty(key);
				return value;
			}else
				return value;
		} catch (FileNotFoundException e){
			e.printStackTrace();
			return "";
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}

	/**
	 * 清空配置键
	 */
	public void clear()
	{
		propertie.clear();
	}

	/**
	 * 设置 配置键值
	 * @param key 配置键
	 * @param value 配置键值
	 */
	public void setValue(String key, String value)
	{
		propertie.setProperty(key, value);
	}

	/**
	 * 保存配置文件
	 * @param fileName 保存配置文件路径
	 * @param description 文件内容描述
	 */
	public void saveFile(String fileName, String description)
	{
		try {
			outputFile = new FileOutputStream(fileName);
			propertie.store(outputFile, description);
			outputFile.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}
	}
}


