package Thread_study01;

/**
 * @PackageName:Thread_study01
 * @ClassName: TDownloader
 * @Description:
 *  创建线程方式二:
 *  * 1、创建：实现Runnable+重写run
 *  * 2、启动: 创建实现类对象 +Thread对象+ start
 *  *
 *  * 推荐: 避免单继承的局限性，优先使用接口
 *  * 方便共享资源
 * @author:Dong
 * @data 7月30-030 17:08
 */
public class TDownloader extends Thread {
    private String url;//路径
    private String name;//名字

    public TDownloader(String url, String name) {
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
        td1.start();
        td2.start();
        td3.start();
    }
}
