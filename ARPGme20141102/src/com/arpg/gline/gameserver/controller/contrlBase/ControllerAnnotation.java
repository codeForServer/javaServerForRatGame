package com.arpg.gline.gameserver.controller.contrlBase;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*  
 * ����ע�� Annotation  
 * ע���к�������Ԫ�� id �� description  
 * description Ԫ�� ��Ĭ��ֵ "no description"  
 */

@Target(ElementType.METHOD)//ע������Ϊ����
@Retention(RetentionPolicy.RUNTIME)//������ͬ���ע��
@Documented
@Inherited
public @interface  ControllerAnnotation{
	
	//�����
	public int key();
}
