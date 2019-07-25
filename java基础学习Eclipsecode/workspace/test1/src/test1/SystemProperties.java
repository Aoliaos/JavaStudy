package test1;

import java.util.*;

class SystemProperties
{
	public static void main(String[] args) 
	{
		//系统属性
		Properties props = System.getProperties();
		Enumeration keys = props.propertyNames();//枚举器
		while(keys.hasMoreElements() ){
			String key = (String) keys.nextElement();
			System.out.println( key + " = " + props.getProperty(key) );
		}
	}
}
