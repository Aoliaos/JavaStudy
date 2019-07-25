package hellow;

import java.util.Scanner;

public class Fenjie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//分解整数
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		do 
		{
			int digit = number %10;
			result = result*10+digit;
			System.out.print(digit);
			number /=10;
		} while (number >0);
		System.out.println();
		System.out.println(result);
		in.close();

	}

}
