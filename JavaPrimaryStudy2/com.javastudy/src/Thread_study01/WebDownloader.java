package Thread_study01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @PackageName:Thread_study01
 * @ClassName: WebDownloader
 * @Description:
 * @author:Dong
 * @data 7月30-030 16:15
 */

public class WebDownloader {
    /**
     *@Description://TODO下载
     * @param url
    	 * @param name
     * @return void
     **/
    public void download(String url,String name){
        try{
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch(MalformedURLException e){
            e.printStackTrace();
            System.out.println("URL不合法！");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("下载失败");
        }
    }
}
