package com.arpg.gline.gameserver.scence;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * �������г���
 *
 */
public class ScenceEntity implements Serializable , Cloneable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * ��ͼId
	 */
	private int id;
	
	/**
	 * ��ͼ���
	 */
	//private ScenceCode sceneCode;
	
	/**
	 * ��ͼ����[��ͨ��ͼ,������ͼ]
	 */
	private int mapType;
	

	/**
	 * ��ͼ��NPC ϵͳ���
	 */
	private List<Integer> npcs=new ArrayList<Integer>();
	
	/**
	 * ��ͼ�ϵ���ұ���б�
	 */
	private List<Integer> roles=new ArrayList<Integer>();
	
	
	/**
	 * ͨ��id��ȡ��ʼ����
	 */
	
	
	
	/**
	 * ��ͼ�л����б�
	 *//*
	private List<SceneChangePoint> changePoints=new ArrayList<SceneChangePoint>();

	*//**
	 * ��ͼ�ɼ����
	 *//*
	private List<GatherArticleVO> gatherArticle=new ArrayList<GatherArticleVO>();

	*//**
	 * ��ͼ�ɼ����
	 *//*
	public List<GatherArticleVO> getGatherArticle() {
		return gatherArticle;
	}

	*//**
	 * ��ͼ�ɼ����
	 *//*
	public void setGatherArticle(List<GatherArticleVO> gatherArticle) {
		this.gatherArticle = gatherArticle;
	}

	*//**
	 * ��ȡ ��ͼ�л����б�
	 * @return ��ͼ�л����б�
	 *//*
	public List<SceneChangePoint> getChangePoints() {
		return changePoints;
	}

	*//**
	 * ����  ��ͼ�л����б�
	 * @param changePoints ��ͼ�л����б�
	 *//*
	public void setChangePoints(List<SceneChangePoint> changePoints) {
		this.changePoints = changePoints;
	}
*/
	/**
	 * ��ͼ��Ӧ����ӪID
	 */
	private int campid;
	
	/**
	 * �л���ͼ��ʱ������
	 */
	private int quest_id;
	
	
	
	public int getEvent_id() {
		return quest_id;
	}

	public void setEvent_id(int quest_id) {
		this.quest_id = quest_id;
	}

	public int getCampid() {
		return campid;
	}

	public void setCampid(int campid) {
		this.campid = campid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//public ScenceCode getSceneCode() {
		//return sceneCode;
	//}

	//public void setSceneCode(ScenceCode sceneCode) {
		//this.sceneCode = sceneCode;
	//}

	public List<Integer> getNpcs() {
		return npcs;
	}

	public void setNpcs(List<Integer> npcs) {
		this.npcs = npcs;
	}

	public List<Integer> getRoles() {
		return roles;
	}

	public void setRoles(List<Integer> roles) {
		this.roles = roles;
	}
	
	/**
	 * ��ȡ ��ͼ����[��ͨ��ͼ,������ͼ]
	 * @return ��ͼ����[��ͨ��ͼ,������ͼ]
	 */
	public int getMapType() {
		return mapType;
	}

	/**
	 * ���� ��ͼ����[��ͨ��ͼ,������ͼ]
	 * @param mapType ��ͼ����[��ͨ��ͼ,������ͼ]
	 */
	public void setMapType(int mapType) {
		this.mapType = mapType;
	}

	/*public SceneEntity(int quest_id,int id,SceneCode sceneCode,int campId,int mapType,List<GatherArticleVO> gatherArticle){
		this.id=id;
		this.quest_id = quest_id;
		this.sceneCode=sceneCode;
		this.campid = campId;
		this.mapType = mapType;
		this.gatherArticle.addAll(gatherArticle);
	}
	*/
	
	public ScenceEntity clone(){
		try{
			ScenceEntity sceneEntity = (ScenceEntity)super.clone();
			sceneEntity.setNpcs(new ArrayList<Integer>());
			sceneEntity.setRoles(new ArrayList<Integer>());
			return sceneEntity;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}

