
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//counter: for(int i=0;i<1000;i++)
		{
		System.out.print("请输入要判别是否为闰年的年份:");
		try{
		int year= in.nextInt();
		in.close();
		if((year%4==0&&year%100!=0)||(year%400==0))
				System.out.println(year+"is a leap year.");
		else 
			System.out.println(year+"is not a leap year.");
		}
		catch(Exception e){
			System.out.println(e+",testEx,catch exception!\n请输入整数年份！");
			//continue counter;
		}
		}
		
	}
}
