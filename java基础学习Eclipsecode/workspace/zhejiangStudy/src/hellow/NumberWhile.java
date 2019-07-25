package hellow;

import java.util.Scanner;
 
public class NumberWhile {
	public static void main(String[] args) 
	{
		//判断输入整数的位数
		while(true)
		{
			System.out.println("请输入一个整数：");
			Scanner in = new Scanner(System.in);
			long number = in.nextLong();
			//in.close();
			long count = 0;
			
			do
			{
				number = number / 10;
				count = count + 1;
				//System.out.println("number:"+number+";count:"+count);
			}while(number >0);
			System.out.println("输入的数是个"+count+"位数");
		}
	}
}
