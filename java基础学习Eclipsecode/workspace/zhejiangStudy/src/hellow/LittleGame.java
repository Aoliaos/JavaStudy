package hellow;

import java.util.Scanner;

public class LittleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������Ϸ
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1);//[0,1)-->[0,100)-->[0,100]
		int a;
		int count = 0;
		do
		{
			System.out.println("������������������֣�");
			a = in.nextInt();
			count +=1;
			if(a > number)
			{
				System.out.println("ƫ��");
			}
			else if(a < number)
			{
				System.out.println("ƫС");
			} 
		}while(number!=a);
		
		System.out.println("��ϲ��¶��ˣ������"+count+"�Ρ�");
		in.close();

	}
	

}
