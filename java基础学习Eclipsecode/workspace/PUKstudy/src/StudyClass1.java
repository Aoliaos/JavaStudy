
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

		System.out.println("������һ��������ֵ��");
		int a = in.nextInt();
		System.out.println("�������ֵ��:"+ a);
		
		System.out.println("�����봮�ַ���");
		String s = inlang.readLine();
		int n = Integer.parseInt(s);
		in.close();
			
		
		System.out.println("������ַ����ǣ�"+n);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("�밴Ҫ�����룡in procedure,Exception:"+e);
		}
//		finally {
//			System.out.println("���ͣ�");
//		}
	}

}
