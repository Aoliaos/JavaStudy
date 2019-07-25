class A
		{
			A(){}
			A(int a){
				System.out.println("int a in A");
			}
		}
		class B extends A
		{
			B(){System.out.println("String s in B");}
		}
public class  Test{
	public static void main(String [] args) {
		//*****TestWorkSpace****
		A a = new B();
	}
}