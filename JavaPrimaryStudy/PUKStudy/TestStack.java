import java.util.Stack;

public class TestStack {
	static String[] months = {"Janurary һ��","February ����","March ����",
			"April ����","May����","June����","July ����","August ����",
			"September ����","October ʮ��","November ʮһ��","December ʮ����"
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʮ���·�һ����ջ����ջ��
		Stack<String> stk = new Stack<>();
		for (int i=0; i < months.length;i++)
			     stk.push(months[i] + " ");
		System.out.println("stk =" + stk);
		System.out.println("poping elements:");
		while (!stk.empty())
			System.out.println(stk.pop());
	}
}
