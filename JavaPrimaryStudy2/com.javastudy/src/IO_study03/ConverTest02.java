package IO_study03;

import java.io.*;
import java.net.URL;

/**
 * @PackageName:IO_study03
 * @ClassName: ConverTest02
 * @Description:
 * @author:Dong
 * @data 7月29-029 20:59
 */
public class ConverTest02 {
    public static void main(String[] args){
        //
        try(BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(new URL("http://www.baidu.com").openStream(),"UTF-8"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"))){
            String msg;
            while((msg = reader.readLine())!=null){
                //System.out.print(msg);
                writer.write(msg);
                writer.newLine();
            }
            writer.flush();
        }catch(IOException e){
            System.out.println("操作异常");
        }

    }
}
