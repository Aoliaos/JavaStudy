package Thread_study02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @PackageName:Thread_study02
 * @ClassName: BlockedSleep03
 * @Description:
 * @author:Dong
 * @data 7月31-031 10:06
 */
public class BlockedSleep03 {
    public static void main(String[] args) throws InterruptedException {
        //倒计时
        Date endTime =new Date(System.currentTimeMillis()+1000*10);
        long end = endTime.getTime();
        while(true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            Thread.sleep(1000);
            endTime = new Date(endTime.getTime()-1000);
            if(end-10000 > endTime.getTime()){
                break;
            }
        }
        }
}
