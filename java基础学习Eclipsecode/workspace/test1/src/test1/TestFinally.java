package test1;

public class TestFinally {
	public static void main(String[] args)
	{
	    int re = bar();
	    System.out.println(re);
	}
	private static int bar() 
	{
	    try{
	        return 5;
	    } finally{
	        System.out.println("finally");
	        //return 6;//�Ḳ��try�еķ���ֵ��������ǰ����쳣
	    }
	}

}
