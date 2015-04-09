package com.arpg.gline.gameserver.controller;

import java.util.List;

import netBase.util.GameClient;
import netWork.proxy.SkillProxy;

import com.commons.network.modulecore.IController;
import com.commons.network.modulecore.MethodAnnotation;
import com.commons.network.modulecore.model.CommandModel;

/**
 * 技能控制器
 * @author 	欧阳
 * @date	2012-11-13
 */
public class SkillController implements IController
{

	@Override
	public List<CommandModel> getCommands()
	{
		return SkillProxy.DATA_MODE();
	}
	
	/**
	 * 废弃暂时用
	 * @param client
	 * @param id
	 * @create 2012-11-1
	 * @deprecated
	 */
	@MethodAnnotation(key = SkillProxy.CG_LEARN_SKILL)
	public void leanSkill(GameClient client, long id)
	{
		
	}
}
