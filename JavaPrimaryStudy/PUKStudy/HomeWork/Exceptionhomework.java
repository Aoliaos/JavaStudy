package HomeWork;

import java.lang.Exception;
import java.util.Scanner;


/**
 * �Զ����쳣��ʹ���쳣
 * @author Dong
 *
 */
public class Exceptionhomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("�����������");
		int score = in.nextInt();
		
		CheckScore check = new CheckScore();
		try {
			check.check(score);
		}catch (MyExcepiton e) {// ���Լ����쳣���������쳣 
			e.printStackTrace();
		}
	}
}

class MyExcepiton extends Exception{
	//private static final long serialVersionUID = 1L;
	// �ṩ�޲����Ĺ��췽��
	public MyExcepiton() {
	}
	public MyExcepiton(String message) {
		super(message);// �Ѳ������ݸ�Throwable�Ĵ�String�����Ĺ��췽�� 
	}
}

class CheckScore{
	public void check(int score) throws MyExcepiton {
		if(score >150 || score <0) {
			//�������Ϸ�
			throw new MyExcepiton("�������Ϸ�");
		}
		else {
			System.out.println("��ķ�����"+ score+"�֣�");
		}
	}
}



