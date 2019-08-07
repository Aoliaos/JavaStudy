package Thread_study01;

import java.util.Scanner;

/**
 * @PackageName:Thread_study01
 * @ClassName: LambdaTest02
 * @Description:
 * @author:Dong
 * @data 7月30-030 22:19
 */
public class LambdaTest02 {
    public static void main(String[] args){
        ILove love = (int a)->{
            System.out.println("i love lambda -->" + a);
        };
        love.lambda(100);

        //简化,只有一个参数
        love = a->{System.out.println("i love lambda -->" + a);
        };
        love.lambda(5);

        //简化：只有一行代码时
        love = a-> System.out.println("i love lambda -->" + a);
        love.lambda(0);

        }
}
interface ILove{
    void lambda(int a);
}
//外部类
class Love implements ILove{
    @Override
    public void lambda(int a) {
        System.out.println("i love lambda -->" + a);
    }
}
