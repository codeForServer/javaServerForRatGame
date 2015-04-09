package com.arpg.gline.core.ai.action;


import java.awt.Point;
import java.util.List;

import com.arpg.gline.core.ai.SupAI;
import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

public class NormalFindTarger implements ActionAll
{

	/**
	 * @param scope ��������
	 */
	@SuppressWarnings({ "static-access", "unused" })
	public void action(SupAI ai, PlayerEntity playEntity, int harm) 
	{
		
		/*ScenceCode currMap = ScenceCode.getMapById(playEntity.getCurrMapID());
		
		if(playEntity == null) return;
		
		int x = playEntity.getTargetx();
		int y = playEntity.getTargety();
		
		List<Point> path = new PathSearch().findPath(currMap.getGrids(), ai.getNpcEntity().getLastPoint(), 
				playEntity.getLastPoint(),0);
		
		if(path ==null)
		{
			System.out.println("�޷��ҵ��������˵�·����");
			
			//�ظ�npc����ֵΪ��ʼֵ
			ai.setFightStatus(false);
			ai.getNpcEntity().setHp(ai.getNpcEntity().getInitHp());
			ai.getNpcEntity().setMp(ai.getNpcEntity().getInitMp());
			//ɾ��BUFF
			return;
		}
		
		else
		{
			ai.setRoleLocation(new int[]{x,y});//��¼��ұ������
			ai.setChangeMove(true);
			
		}*/
	}
}
