package hellow;

import java.util.Scanner;

public class PingJun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int sum = 0;
		int count = 0;
		number = in.nextInt();
		
		while(number != -1)
		{
			sum += number;
			count += 1;
			number = in.nextInt();
		}
		if( count>0) {
		System.out.println("һ������"+count+"����\n"+"ƽ����="+(double)sum/count);
		}
	}

}
