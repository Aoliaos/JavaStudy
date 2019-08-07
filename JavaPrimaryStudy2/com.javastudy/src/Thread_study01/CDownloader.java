package Thread_study01;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

/**
 * @PackageName:Thread_study01
 * @ClassName: TDownloader
 * 了解创建线程方法三
 * @Description:
 * @author:Dong
 * @data 7月30-030 17:08
 */
public class CDownloader implements Callable<Boolean> {
    private String url;//路径
    private String name;//名字

    public CDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception{
        WebDownloader wd = new WebDownloader();
        wd.download(url, name);
        System.out.println(name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CDownloader cd1 = new CDownloader("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1564492889&di=ef883a4cbbbc25a8d6923cc3173a204e&src=http://pic33.nipic.com/20130914/13161858_000932329000_2.jpg", "动漫.jpg");
        CDownloader cd2 = new CDownloader("http://pic51.nipic.com/file/20141025/8649940_220505558734_2.jpg", "草原.jpg");
        CDownloader cd3 = new CDownloader("http://pic16.nipic.com/20111006/6239936_092702973000_2.jpg", "家园.jpg");

        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //提交执行结果
        Future<Boolean> result1 = ser.submit(cd1);
        Future<Boolean> result2 = ser.submit(cd2);
        Future<Boolean> result3 = ser.submit(cd3);
        //获取结果
        boolean r1 = result1.get();
        boolean r2 = result2.get();
        boolean r3 = result3.get();
        System.out.println(r3);
        //关闭服务
        ser.shutdownNow();
    }
}
