package hellow;

import java.util.Scanner;
 
public class NumberWhile {
	public static void main(String[] args) 
	{
		//�ж�����������λ��
		while(true)
		{
			System.out.println("������һ��������");
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
			System.out.println("��������Ǹ�"+count+"λ��");
		}
	}
}
