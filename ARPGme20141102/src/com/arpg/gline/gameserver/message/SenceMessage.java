package com.arpg.gline.gameserver.message;

import netBase.util.GameClient;
import netWork.proxy.SceneProxy;

import com.arpg.gline.gameserver.controller.ControllerModel;

/**
 *  ����ģ��
 * @author �����
 * @date  2014.8.19
 */
public class SenceMessage  extends SendManager{
	
	/**
	 * ���� ����ս����ͼ  
	 * 	@param generalId				����ID
	 */
	public static void GC_Enter_Map(GameClient client,int generalId)
	{
		send(client, createBuffer(30), ControllerModel.SCENEMODEL, SceneProxy.CG_MOVE,  generalId);
		
	}
}
