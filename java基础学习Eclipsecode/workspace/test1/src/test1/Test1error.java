package test1;

public class Test1error {
	
	    static
	    {
	        System.out.println("1");
	    }
	    {
	        System.out.println("2");
	    }
	    public Test1error()
	    {
	        System.err.println("3");
	    }
	    public static void main(String[] args)
	    {
	        new Test1error();
	    }
	}