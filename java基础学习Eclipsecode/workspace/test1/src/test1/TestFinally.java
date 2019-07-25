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
	        //return 6;//会覆盖try中的返回值；会消灭前面的异常
	    }
	}

}
