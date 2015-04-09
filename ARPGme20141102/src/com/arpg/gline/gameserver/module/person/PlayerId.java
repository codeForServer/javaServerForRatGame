package com.arpg.gline.gameserver.module.person;

/**
 * �������ID
 * @author �����
 */
public class PlayerId {
	
	int value = 1;
	
	/*����ID*/
	private PlayerId()
	{
		//TODO ����ݿ��ȡ��ǰID
		int id=0;
		if(id == 0)
		{
			this.value++;
		}
		else
			this.value =id;
	}
	
	public int getId()
	{
		return this.value;
	}
}
