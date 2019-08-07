package Thread_study01;

/**
 * @PackageName:Thread_study01
 * @ClassName: LambdaTest04
 * @Description:
 * @author:Dong
 * @data 7月30-030 22:32
 */
public class LambdaTest04 {
    public static void main(String[] args){
        new Thread(()->{
            for(int i=0; i<100; i++){
            System.out.println("一边学习");}
        }).start();
        new Thread(()-> System.out.println("一边codding")).start();

        }
}
