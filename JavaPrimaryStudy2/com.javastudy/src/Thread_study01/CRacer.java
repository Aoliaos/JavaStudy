package Thread_study01;

import java.util.concurrent.*;

/**
 * @PackageName:Thread_study01
 * @ClassName: Racer
 * @Description:
 * @author:Dong
 * @data 7月30-030 17:51
 */
public class CRacer implements Callable<Integer> {
    private String winner;//胜利者
    @Override
    public Integer call()throws Exception{
        for(int steps = 1; steps<=100; steps++){
        //模拟兔子休息
            if(Thread.currentThread().getName().equals("rabbit") && steps%10 == 0) {
                    Thread.sleep(100);
                }
            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            boolean flag = gameOver(steps);
            if(flag){
                return steps;
            }
        }
        return null;
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
    public static void main(String[] args)throws InterruptedException, ExecutionException {
        CRacer racer = new CRacer();
        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(2);
        //提交执行结果
        Future<Integer> result1 = ser.submit(racer);
        Future<Integer> result2 = ser.submit(racer);

        //获取结果
        Integer r1 = result1.get();
        Integer r2 = result2.get();

        System.out.println(r1+"-->"+r2);
        //关闭服务
        ser.shutdownNow();
        }
}
