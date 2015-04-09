package com.arpg.gline.gameserver.message;

import netBase.util.GameClient;
import netWork.proxy.ConquestProxy;

import org.apache.log4j.Logger;

import com.arpg.gline.gameserver.controller.ControllerModel;

/**
 *  ƥ��ģ��
 * @author �����
 * @date  2014.8.19
 */
public class ConquestMessage extends SendManager {
	private static final Logger logfor = Logger.getLogger(ConquestMessage.class);
	
	/**
	 * ����ƥ���� 
	 * @param basis			���
	 * @param tankerType		    ��ʹ�õ�̹������ 
	 * 	@param generalId				����ID
	 */
	public static void GC_CONQUEST_INFO(GameClient client,int basis,int tankerType, int generalId)
	{
		logfor.info("����ƥ����1111 ");
		send(client, createBuffer(20), ControllerModel.TANKERMODEL, ConquestProxy.GC_CONQUEST_INFO, basis, tankerType,  generalId);
		logfor.info("����ƥ���� ");
		//�㲥���пͻ��ˣ��Ժ��Ϊ�㲥��ƥ�䵽�Ŀͻ���//
		//sends(World.newInstance().getChannelMap(), createBuffer(30), ControllerModel.TANKERMODEL, ConquestProxy.GC_CONQUEST_INFO, basis, tankerType,  generalId);
		
	}
}
