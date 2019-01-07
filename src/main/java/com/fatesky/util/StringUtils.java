package com.fatesky.util;

import java.util.regex.Pattern;
/**
 * 字符串工具类
 * */
public class StringUtils {
	/**判断字符串是否为数字*/
	public static boolean isInteger(String str) {  
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
        return pattern.matcher(str).matches();  
	}
}
