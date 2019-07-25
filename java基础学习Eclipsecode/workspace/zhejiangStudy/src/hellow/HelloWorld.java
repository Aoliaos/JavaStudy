package hellow;

import java.util.Scanner;

public class HelloWorld {
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     * 找零
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 打印 Hello World
        Scanner in = new Scanner(System.in);
        int balance=0;
        //System.out.println("echo:" + in.nextLine());
        //System.out.println("2+3="+(2+3));
        //int price=0;
        //int amount = 100;
        while(true)
        {
	        System.out.println("请投币：");
	        int amount = in.nextInt();
	        balance = balance+amount;
	        if(balance>=10)
	        {
	        	//打印车票
	        	System.out.println("****************");
	        	System.out.println("*JAVA城际铁路专线*");
	        	System.out.println("*  无指定座位票    *");
	        	System.out.println("*   票价：10元     *");
	        	System.out.println("****************");
	        	//计算并打印找零
	        	System.out.println("找零："+(balance-10)+"元");
	        	balance=0;
	        }
//	        else 
//	        {
//				System.out.println("投入总额大于10元");
//	        }
        }
//        System.out.println("请输入金额：");
//        price = in.nextInt();
//        System.out.println("找零:"+amount+"-"+price+"="+(amount-price));
    }
}