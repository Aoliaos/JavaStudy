package dong2;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//F输入华氏温度，输出摄氏温度
		int F;
		double C;
		Scanner in = new Scanner(System.in);
		F = in.nextInt();
		C = (F-32)/(9/5.0);
		System.out.println((int)C);

	}

}
