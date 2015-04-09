package com.arpg.gline.gameserver.controller.contrlBase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import netBase.ReceivablePacket;
import netBase.Manager.ModuleManager;
import netBase.util.GameClient;

import org.jboss.netty.buffer.ChannelBuffer;

/**
 * @author timoSky
 * @Data 2012-12-20
 */
public class ControlRealize {
	
 
    /**
     * ִ�з���
     */
    public static void ControllerWait(GameClient mmo, ReceivablePacket pack) 
    		throws IllegalAccessException, IllegalArgumentException,InvocationTargetException
    {
    
        /*�����*/
        ChannelBuffer buff = pack.getBuffer();
      	/*ģ��*/
        int model = buff.readShort();
        /*����*/
        int order =  buff.readShort();
        
    	System.out.println("model"+model+"order"+order);   	
        	
    	//ͨ��ModuleManager��model���תΪclass
    	 Class<?> clazz = ModuleManager.getInstance().get(model);
    	
    	/*ͨ��������õ���������Ϊ���еķ���*/
    	Method[] methods = clazz.getDeclaredMethods();     	
    	
		List<Object> obj= new ArrayList<Object>(); 

		
    	for(Method method : methods)
    	{
    		 //�жϷ������Ƿ���ָ��ע�����͵�ע��    
            if (method.isAnnotationPresent(ControllerAnnotation.class)) 
            {  
          	
            	//�õ���ControllerAnnotatio����ע��ķ���
            	ControllerAnnotation annotation = method.getAnnotation(ControllerAnnotation.class);

            	//������������ע��ֵ��Ŀ�귽����ͬ
            	if(annotation.key()==order)
            	{

            		Type[] paramTypeList = method.getGenericParameterTypes();// �����Ĳ����б�
            		
	               	int n = 0;
	               		               	
	               	for (Type paramType : paramTypeList) 
	               	{	               		
	            		if(paramType == null || paramType instanceof ParameterizedType)/*����Ƿ������� ,�����*/
	            		{
	            				break;
	            		}
	            		else if(paramType == Integer.TYPE)
	                	{
	            			int a = buff.readInt();
	            			obj.add(a);
	            			n++;
	                	}
	                	
	            		else if(paramType ==  Byte.TYPE)
	            	    {
	            			obj.add(buff.readByte());
	            			n++;            	    		
	            	    }
	            		    	
	            		else if(paramType ==  String.class)
	            		{	            										
	            			StringBuffer stringbuff = new StringBuffer();
	            			char c =  buff.readChar();
	            			while(c!=0)
	            			{
	            				stringbuff.append(c);
	            				c = buff.readChar();
	            			}
	            			
	            			obj.add(stringbuff.toString());
	            			n++;
	            		}
	            		    	
	            		else if(paramType == Short.TYPE)
	            	    {
	            			obj.add(buff.readShort());
	            			n++;
	            	    }
	            	    	
	            	    else if(paramType == Long.TYPE)
	            	    {
	            	    	
	            	    	//TODO:读取LONG 有错
	            	    	obj.add(buff.readShort());
	            			n++;
	            	   	}
	            		    	          	
	                	else if (paramType ==Double.TYPE)
	                	{
	                		obj.add(buff.readDouble());
	            			n++;                		
	                	}
	                	
	                	else if (paramType ==Float.TYPE)
	                	{
	                		obj.add(buff.readFloat());
	            			n++;
	                	}
	                }
	               	 
	               	int lenth = n+1;
	               	
	                Object[] newobj = new Object[lenth];           
	                
	                newobj[0] =  mmo;
	                
	                for(int i=1; i<lenth; i++)
	                {
	                	 newobj[i] = obj.get(i-1);
	                }

	                
	               	method.setAccessible(true); 
	             	method.invoke(clazz,newobj);
	              }
	               	
            	}
            }          
    	}  	    	 
    }

