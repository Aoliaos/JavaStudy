package hellow;

import java.util.Scanner;

public class HelloWorld {
    /* ��һ��Java����
     * ������ӡ�ַ��� Hello World
     * ����
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // ��ӡ Hello World
        Scanner in = new Scanner(System.in);
        int balance=0;
        //System.out.println("echo:" + in.nextLine());
        //System.out.println("2+3="+(2+3));
        //int price=0;
        //int amount = 100;
        while(true)
        {
	        System.out.println("��Ͷ�ң�");
	        int amount = in.nextInt();
	        balance = balance+amount;
	        if(balance>=10)
	        {
	        	//��ӡ��Ʊ
	        	System.out.println("****************");
	        	System.out.println("*JAVA�Ǽ���·ר��*");
	        	System.out.println("*  ��ָ����λƱ    *");
	        	System.out.println("*   Ʊ�ۣ�10Ԫ     *");
	        	System.out.println("****************");
	        	//���㲢��ӡ����
	        	System.out.println("���㣺"+(balance-10)+"Ԫ");
	        	balance=0;
	        }
//	        else 
//	        {
//				System.out.println("Ͷ���ܶ����10Ԫ");
//	        }
        }
//        System.out.println("�������");
//        price = in.nextInt();
//        System.out.println("����:"+amount+"-"+price+"="+(amount-price));
    }
}