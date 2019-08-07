package Thread_study01;

/**
 * @PackageName:Thread_study01
 * @ClassName: TDownloader
 * @Description:
 * @author:Dong
 * @data 7月30-030 17:08
 */
public class TDownloader2 implements Runnable {
    private String url;//路径
    private String name;//名字

    public TDownloader2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader wd = new WebDownloader();
        wd.download(url, name);
    }

    public static void main(String[] args) {
        TDownloader td1 = new TDownloader("http://i0.hdslb.com/bfs/article/12f6ff92c25256515be6c1cc0d6d0766743bedd6.jpg", "动漫.jpg");
        TDownloader td2 = new TDownloader("http://pic51.nipic.com/file/20141025/8649940_220505558734_2.jpg", "草原.jpg");
        TDownloader td3 = new TDownloader("http://pic16.nipic.com/20111006/6239936_092702973000_2.jpg", "家园.jpg");

        //启动三个线程
        new Thread(td1).start();
        new Thread(td2).start();
        new Thread(td3).start();
    }
}
