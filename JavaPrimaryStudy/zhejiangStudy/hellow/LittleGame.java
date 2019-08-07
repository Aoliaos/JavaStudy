package hellow;

import java.util.Scanner;

public class LittleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//猜数字游戏
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);//[0,1)-->[0,100)-->[0,100]
		int a;
		int count = 0;
		do
		{
			System.out.println("请输入你所猜想的数字：");
			a = in.nextInt();
			count +=1;
			if(a > number)
			{
				System.out.println("偏大");
			}
			else if(a < number)
			{
				System.out.println("偏小");
			} 
		}while(number!=a);
		
		System.out.println("恭喜你猜对了！你猜了"+count+"次。");
		in.close();

	}
	

}
