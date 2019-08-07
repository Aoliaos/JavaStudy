package Thread_study01;

/**
 * @PackageName:Thread_study01
 * @ClassName: Racer
 * @Description:
 * @author:Dong
 * @data 7月30-030 17:51
 */
public class Racer implements Runnable{
    private String winner;//胜利者
    @Override
    public void run(){
        for(int steps = 1; steps<=100; steps++){
        //模拟兔子休息
            if(Thread.currentThread().getName().equals("rabbit") && steps%10 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            //boolean flag = gameOver(steps);
            if(gameOver(steps) ){
                break;
            }
        }
    }
    private boolean gameOver(int steps){
        if(winner!= null){//存在胜利者
            return true;
        }else{
            if(steps == 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Racer racer = new Racer();
        new Thread(racer,"tortoise").start();
        new Thread(racer,"rabbit").start();
        }
}
