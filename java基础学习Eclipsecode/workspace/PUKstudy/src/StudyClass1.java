
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.*;

public class StudyClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		Scanner in = new Scanner(System.in);
		BufferedReader inlang = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("请输入一个整型数值：");
		int a = in.nextInt();
		System.out.println("输入的数值是:"+ a);
		
		System.out.println("请输入串字符：");
		String s = inlang.readLine();
		int n = Integer.parseInt(s);
		in.close();
			
		
		System.out.println("输入的字符串是："+n);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("请按要求输入！in procedure,Exception:"+e);
		}
//		finally {
//			System.out.println("加油！");
//		}
	}

}
