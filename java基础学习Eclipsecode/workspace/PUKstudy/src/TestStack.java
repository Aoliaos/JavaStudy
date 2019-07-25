import java.util.Stack;

public class TestStack {
	static String[] months = {"Janurary 一月","February 二月","March 三月",
			"April 四月","May五月","June六月","July 七月","August 八月",
			"September 九月","October 十月","November 十一月","December 十二月"
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将十二月份一次入栈，出栈。
		Stack<String> stk = new Stack<>();
		for (int i=0; i < months.length;i++)
			     stk.push(months[i] + " ");
		System.out.println("stk =" + stk);
		System.out.println("poping elements:");
		while (!stk.empty())
			System.out.println(stk.pop());
	}
}
