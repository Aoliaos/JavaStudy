package Thread_study01;

/**
 * @PackageName:Thread_study01
 * @ClassName: Web12306
 * @Description:共享资源，并发（线程安全）
 * @author:Dong
 * @data 7月30-030 17:36
 */
public class Web12306 implements Runnable{
    //票数
    private int ticketNums = 99;
    @Override
    public void run() {
        while(true){
            if(ticketNums < 0){
                break;
            }
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "-->"+ticketNums--);
        }
    }
    public static void main(String[] args){
        //一份资源
        Web12306 web = new Web12306();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new Thread(web,"1号").start();
        new Thread(web,"5号").start();
        new Thread(web,"8号").start();

        }
}
