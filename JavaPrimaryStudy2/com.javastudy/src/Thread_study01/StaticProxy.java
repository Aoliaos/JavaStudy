package Thread_study01;

/**
 * @PackageName:Thread_study01
 * @ClassName: StaticProxy
 * @Description:静态代理
 * 公共接口：
 * 1.真实角色
 * 2.代理角色
 * 用途：登录日志等
 * @author:Dong
 * @data 7月30-030 21:39
 */
public class StaticProxy {
    public static void main(String[] args){
        new WeddingCompany(new You()).happyMarry();

        //new Thread(线程对象).start();
        }
}
interface Marry{
    void happyMarry();
}

//真实角色
class You implements Marry{
    @Override
    public void happyMarry(){
        System.out.println("you and your lover get marry！");
        }
}
//代理角色
class WeddingCompany implements Marry{
    //真实角色
    private Marry target;
    public WeddingCompany(Marry target){
        this.target = target;
    }
    @Override
    public void happyMarry(){
        ready();
        this.target.happyMarry();
        after();
    }
    private void ready(){
        System.out.println("各项准备");
    }
    private void after(){
        System.out.println("婚礼结束");
    }
}

/*
//lambda
like = ()->{
System.out.println("I like lambda");};
like.lambda();

 */
