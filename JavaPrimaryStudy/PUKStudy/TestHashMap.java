import java.util.*;
class TestHashMap
{
	public static void main( String[] args){
		//类似字典
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "一");
		map.put("two", "二");
		map.put("three", "三");
		map.put("four", "四");
		map.put("five", "五");

		System.out.println( map.get("three") );//key值

		for( String key : map.keySet() )
			System.out.println( key +":" + map.get(key) );

		for( String value  : map.values() )
			System.out.println( value );

	}
}