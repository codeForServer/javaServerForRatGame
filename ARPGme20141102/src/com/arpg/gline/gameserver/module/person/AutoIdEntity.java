package com.arpg.gline.gameserver.module.person;

/**
 * 自增ID的实体
 * @author 	
 * @date	2012-11-12
 */
public class AutoIdEntity {	
	
	/* 道具实体Id */
	private static long itemId;
	
	/* 初始化道具实体id 的值 */
	private static long initItemId;
	
	/* 掉落实体Id */
	private static int dropId;

	public AutoIdEntity()
	{
		initItemId = 1000;
		dropId = 0;
	}
	
	/**
	 * 获取新的掉落实体id
	 * @return
	 * @create	2012-11-12	
	 */
	public synchronized static int dropId()
	{
		if(dropId == Integer.MAX_VALUE)
		{
			dropId = 0;
		}
		dropId += 1;
		return dropId;
	}

	/**
	 * 获取新的道具实体id
	 * @return
	 * @create	2012-11-12	
	 */
	public synchronized static long ItemId()
	{
		if(itemId == Long.MAX_VALUE)
		{
			itemId = AutoIdEntity.initItemId;
		}
		itemId += 1;
		return itemId;
	}

	public long getItemId() {
		return AutoIdEntity.itemId;
	}

	public void setItemId(long itemId) {
		AutoIdEntity.itemId = itemId;
	}	
}
