package com.arpg.gline.core.ai;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import netBase.World;

import com.arpg.gline.core.ai.Inteface.ActionAll;
import com.arpg.gline.gameserver.module.npc.entity.NpcBaseEntity;
import com.arpg.gline.gameserver.module.person.entity.PlayerEntity;

/**
 * AI����
 * @date 2013.4.10
 */
public abstract class SupAI
{
	private int aId;//��ˮID
	
	private NpcBaseEntity npcEntity;//����ʵ��
	
	private ActionAll attack;//������Ϊ
	
	private ActionAll die ;//������Ϊ
	
	private ActionAll findTarger;//Ѱ��Ŀ����Ϊ
	
	private ActionAll guard;//������Ϊ
	
	private ActionAll hatred;//�����Ϊ
	
	private ActionAll hit;//��������Ϊ
	
	private ActionAll move;//�ƶ���Ϊ
	
	private ActionAll targetDie;//Ŀ��������Ϊ
	
	private ActionAll stop; //ֹͣ������Ϊ
	
	private float multiple;//�����˺�����(���������ΪѪ������ʱ�����ɵ��˺�����һ��������)
	
	//����б� <���id�����ֵ>
	private ConcurrentHashMap<Integer,Integer> hatredList = new ConcurrentHashMap<Integer,Integer>();
	
	private long moveTime;//��ʼ�ƶ�ʱ��(��)
	
	private long startStopMove;//ͣ����ʱ�䣨�룩
	
	private int roleId = 0;//��ǰ���������ID
	
	private int[] roleLocation = new int[2];//��¼����ϴ����
	
	private List<Integer> byAttackList = new ArrayList<Integer>();//����������

	private long attackTime;//�ϴι���ʱ��
	
	private boolean fightStatus = false;//ս��״̬   false: ��ս��״̬   true:ս��״̬
	
	private boolean changeMove = false;//�Ƿ����ƶ�λ�øı�(��ս��״̬�����)
	
	private long reviveTime = 0;//����ʱ��
	
	/**
	 * ��ʼ��
	 * @param die
	 * @param move
	 * @param guard
	 * @param hit
	 */
	public SupAI(ActionAll die,ActionAll move,ActionAll guard,ActionAll hit,ActionAll attack,ActionAll hatred,ActionAll findTarger,ActionAll targetDie,ActionAll stop)
	{
		this.die = die;
		this.move = move;
		this.guard = guard;
		this.hit = hit;
		this.attack = attack;
		this.hatred = hatred;
		this.findTarger = findTarger;
		this.targetDie =targetDie;
		this.stop = stop;
	}
	
	/**
	 * AI��ʼ������������ʵ��
	 */
	public abstract void init();
	
	/***********************************************AI����Ϊ*****************************************/
	
	/**
	 * ������Ϊ
	 */
	public void attack(PlayerEntity roleEntity)
	{
		this.attack.action(this, roleEntity, 0);
	}
	
	/**
	 * ������Ϊ(��ͬ�Ĺ����в�ͬ��������ʽ)
	 */
	private void die()
	{
		this.die.action(this,null,0);
	}
	
	/**
	 * Ѱ��Ŀ����Ϊ
	 */
	private void findTarger(PlayerEntity roleEntity)
	{
		this.findTarger.action(this,roleEntity,0);
	}
	
	/**
	 * ������Ϊ
	 */
	private void guard()
	{
		this.guard.action(this,null,0);
	}

	/**
	 * �����Ϊ
	 */
	private void hatred(PlayerEntity roleEntity, int harm)
	{
		this.hatred.action(this, roleEntity ,harm);
	}
	
	/**
	 * ��������Ϊ
	 */
	private void hit(int harm,PlayerEntity roleEntity)
	{
		this.hit.action(this,roleEntity,harm);
	}
	
	/**
	 * �ƶ���Ϊ
	 */
	private void move()
	{
		this.move.action(this,null,0);
	}
	
	/**
	 * Ŀ������
	 */
	private void targerDie(PlayerEntity roleEntity)
	{
		this.targetDie.action(this,roleEntity,0);
	}
	
	/**
	 * ֹͣ����
	 */
	private void stop()
	{
		this.stop.action(this,null,0);
	}
	/****************************************************AI��Ϊend************************************/
	/**
	 * �������,���ع����Ƿ�����
	 * @param roleEntity ���ʵ��
	 * @param harm  �����������Ϣ(��Ϊ����������AI����)
	 */
	public int isHit(PlayerEntity roleEntity,int harm)
	{
		int roleId = this.roleId;
		
		if(!this.fightStatus)//��ս��״̬�� ����Ӧ�����жϹ���Ŀ���Ƿ����ҵ�
		{
			this.findTarger(roleEntity);
		}
		
		this.hatred(roleEntity,harm);//�����ͻ������
		
		if(this.roleId != 0 && roleId == 0)//�����ս��״̬��ֹͣ��ǰ����
		{
			this.stop();
		}
		
		this.hit(harm,roleEntity);//�ܵ��˺�
		
		this.die();//����Ƿ�����
		
		return npcEntity.getLiveStatus();
	}
	
	/**
	 * �߳��õķ���
	 */
	public void action()
	{
		PlayerEntity roleEntity = null;
		for(int i = 0 ; i < this.byAttackList.size() ; i++)
		{
			this.hit(i, roleEntity);
			this.hatred(roleEntity, i);
		}
		if(this.fightStatus)
		{
			//��ϵͳ������ȡ����ҽ�ɫ
			roleEntity = World.newInstance().getChannel(roleId).getPlayer();
			
			if(roleEntity == null)
			{
				
			}
			this.findTarger(roleEntity);
			this.move();
			this.attack(roleEntity);
			this.targerDie(roleEntity);//��ʱ������
		}
		else
		{
			this.guard();
			this.move();
		}
	}


	/********************************************��������get��set����***********************************/
	
	public ConcurrentHashMap<Integer, Integer> getHatredList() 
	{
		return hatredList;
	}
	
	public int getRoleId() 
	{
		return roleId;
	}

	public void setRole(int role) 
	{
		this.roleId = role;
	}

	public NpcBaseEntity getNpcEntity() 
	{
		return npcEntity;
	}

	public void setNpcEntity(NpcBaseEntity npcEntity) 
	{
		this.npcEntity = npcEntity;
	}

	public float getMultiple() 
	{
		return multiple;
	}

	public void setMultiple(float multiple) 
	{
		this.multiple = multiple;
	}

	public long getAttackTime() 
	{
		return attackTime;
	}

	public void setAttackTime(long attackTime) 
	{
		this.attackTime = attackTime;
	}

	public boolean isFightStatus() 
	{
		return fightStatus;
	}

	public void setFightStatus(boolean fightStatus) 
	{
		this.fightStatus = fightStatus;
	}
	public long getReviveTime() 
	{
		return reviveTime;
	}
	public void setReviveTime(long reviveTime) 
	{
		this.reviveTime = reviveTime;
	}
	
	public long getMoveTime() {
		return moveTime;
	}
	public void setMoveTime(long moveTime) 
	{
		this.moveTime = moveTime;
	}
	public long getStartStopMove() 
	{
		return startStopMove;
	}
	public void setStartStopMove(long startStopMove) 
	{
		this.startStopMove = startStopMove;
	}
	public ActionAll getAttack() 
	{
		return attack;
	}
	public void setAttack(ActionAll attack) 
	{
		this.attack = attack;
	}
	public ActionAll getDie() {
		return die;
	}
	public void setDie(ActionAll die) 
	{
		this.die = die;
	}
	public ActionAll getFindTarger() 
	{
		return findTarger;
	}
	public void setFindTarger(ActionAll findTarger) 
	{
		this.findTarger = findTarger;
	}
	public ActionAll getGuard() 
	{
		return guard;
	}
	public void setGuard(ActionAll guard) 
	{
		this.guard = guard;
	}
	public ActionAll getHatred() 
	{
		return hatred;
	}
	public void setHatred(ActionAll hatred) 
	{
		this.hatred = hatred;
	}
	public ActionAll getHit() 
	{
		return hit;
	}
	public void setHit(ActionAll hit) 
	{
		this.hit = hit;
	}
	public ActionAll getMove() 
	{
		return move;
	}
	
	public void setMove(ActionAll move) 
	{
		this.move = move;
	}
	
	public ActionAll getTargetDie() 
	{
		return targetDie;
	}
	
	public void setTargetDie(ActionAll targetDie) 
	{
		this.targetDie = targetDie;
	}
	
	public ActionAll getStop() 
	{
		return stop;
	}
	
	public void setStop(ActionAll stop) 
	{
		this.stop = stop;
	}
	
	public void setHatredList(ConcurrentHashMap<Integer, Integer> hatredList) 
	{
		this.hatredList = hatredList;
	}
	
	public int[] getRoleLocation() 
	{
		return roleLocation;
	}
	
	public void setRoleLocation(int[] roleLocation) 
	{
		this.roleLocation = roleLocation;
	}
	
	public boolean isChangeMove() 
	{
		return changeMove;
	}
	
	public void setChangeMove(boolean changeMove) 
	{
		this.changeMove = changeMove;
	}
	public List<Integer> getByAttackList() 
	{
		return byAttackList;
	}
	public void setByAttackList(List<Integer> byAttackList) 
	{
		this.byAttackList = byAttackList;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}
	
}
