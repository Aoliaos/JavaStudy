package Thread_study02;

/**
 * @PackageName:Thread_study02
 * @ClassName: TeminateThread
 * @Description:
 * * 终止线程
 *  * 1、线程正常执行完毕-->次数
 *  * 2、外部干涉 -->加入标识
 *  * 不要使用stop destroy
 *  *
 * @author:Dong
 * @data 7月31-031 9:47
 */
public class TeminateThread implements Runnable{
    private boolean flag = true;
    private String name;

    public TeminateThread(String name){
        this.name = name;
    }


    @Override
    public void run(){
        int i = 0;
        while(flag){
            System.out.println(name+"-->"+i++);
        }
    }
    public void Teminate(){
        this.flag = false;
    }
    public static void main(String[] args){
        TeminateThread tt = new TeminateThread("C罗");
        new Thread(tt).start();

        for(int i=0; i<100; i++){
            if(i==80){
                tt.Teminate();
            }
            System.out.println("main-->"+i);
        }
        }
}
