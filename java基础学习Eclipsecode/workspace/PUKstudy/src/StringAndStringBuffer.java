import java.util.*;

class StringAndStringBuffer 
{
	public static void main(String[] args) 
	{
		String a = "a";
		String s = "";
		StringBuffer sb = new StringBuffer();

		final int N = 10000;

		long t0 = System.currentTimeMillis();
		for( int i=0; i<N; i++) s+=a;
		long t1 = System.currentTimeMillis();
		for( int i=0; i<N; i++) sb.append(a);
		long t2 = System.currentTimeMillis();//ms

		System.out.println(t1-t0);
		System.out.println(t2-t1);
		Date t3 = new Date(System.currentTimeMillis());//打印当前系统时间
		System.out.println(t3);
	}
}
