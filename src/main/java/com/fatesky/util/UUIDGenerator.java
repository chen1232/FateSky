package com.fatesky.util;
import java.util.UUID;   
  
public class UUIDGenerator {   
    public UUIDGenerator() {   
    }   
  
    public static String getUUID() {   
        UUID uuid = UUID.randomUUID();   
        String str = uuid.toString();   
        // 去掉"-"符号   
        String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);   
        return str+","+temp;   
    }
    public static String getUUID32(){
    	 UUID uuid = UUID.randomUUID();   
         String str = uuid.toString(); 
         String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);   
         return temp;
    }
    public static String getToken64(){
    	return getUUID32()+getUUID32();
    }
    public static String getCaptcha4(){
    	String uuid = getUUID32();
    	String captcha = "";
    	for(int i =0;i<4;i++){
    		int n =(int)(Math.random()*32);
    		captcha+=uuid.substring(n,n+1);
    	}
    	return captcha;
    }
    public static String getCaptcha4Num(){
    	int random = (int)((Math.random()*9+1)*1000);
    	return random+"";  
    }
}
