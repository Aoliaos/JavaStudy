package HomeWork;

import java.lang.Exception;
import java.util.Scanner;


/**
 * 自定义异常并使用异常
 * @author Dong
 *
 */
public class Exceptionhomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入分数：");
		int score = in.nextInt();
		
		CheckScore check = new CheckScore();
		try {
			check.check(score);
		}catch (MyExcepiton e) {// 用自己的异常类来捕获异常 
			e.printStackTrace();
		}
	}
}

class MyExcepiton extends Exception{
	//private static final long serialVersionUID = 1L;
	// 提供无参数的构造方法
	public MyExcepiton() {
	}
	public MyExcepiton(String message) {
		super(message);// 把参数传递给Throwable的带String参数的构造方法 
	}
}

class CheckScore{
	public void check(int score) throws MyExcepiton {
		if(score >150 || score <0) {
			//分数不合法
			throw new MyExcepiton("分数不合法");
		}
		else {
			System.out.println("你的分数是"+ score+"分！");
		}
	}
}



