package Thread_study03;

/**
 * @PackageName:Thread_study03
 * @ClassName: SynBlockTestMyself
 * @Description:
 * @author:Dong
 * @data 7月31-031 14:12
 */
public class SynBlockTestMyself {
    public static void main(String[] args){
        SynWeb666 st = new SynWeb666();
        new Thread(st,"张三").start();
        new Thread(st,"李四").start();
        new Thread(st,"王五").start();

    }
}

class SynWeb666 implements Runnable{
    //票数
    private int ticketNums = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while(flag){
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            test5();
        }
    }
    public void test5(){
        if(ticketNums <=0){
            flag = false;
            return;
        }
        synchronized(this){
            if(ticketNums <=0){
                flag = false;
                return;
            }
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
        }
    }
}