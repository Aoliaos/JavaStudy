package test1;

import java.util.*;

class SystemProperties
{
	public static void main(String[] args) 
	{
		//ϵͳ����
		Properties props = System.getProperties();
		Enumeration keys = props.propertyNames();//ö����
		while(keys.hasMoreElements() ){
			String key = (String) keys.nextElement();
			System.out.println( key + " = " + props.getProperty(key) );
		}
	}
}
