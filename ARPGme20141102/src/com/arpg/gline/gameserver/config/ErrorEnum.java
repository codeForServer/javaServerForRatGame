package com.arpg.gline.gameserver.config;


public enum ErrorEnum {	
	
	ERROR0(0,"sucess"),
	ERROR1(1,"name.length() > 14"),
	ERROR2(2,"sex wrong!"),
	ERROR3(3,"profession wrong!"),
	ERROR4(4,"name exists"),
	
	
	
	
	
	ERROR100(100,"");
	
	
	private int index;
	private String explain;
	
	private ErrorEnum(int index,String explain)
	{
		this.index = index;
		this.explain = explain;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}

    public static String getName(int index) {   
        for (ErrorEnum c : ErrorEnum.values()) {   
            if (c.getIndex() == index) {   
                return c.explain;   
            }   
        }   
        return null;   
    }   

}
