import java.util.*;
class TestHashMap
{
	public static void main( String[] args){
		//�����ֵ�
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "һ");
		map.put("two", "��");
		map.put("three", "��");
		map.put("four", "��");
		map.put("five", "��");

		System.out.println( map.get("three") );//keyֵ

		for( String key : map.keySet() )
			System.out.println( key +":" + map.get(key) );

		for( String value  : map.values() )
			System.out.println( value );

	}
}