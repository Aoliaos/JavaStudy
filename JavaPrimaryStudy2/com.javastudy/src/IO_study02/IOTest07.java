package IO_study02;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @PackageName:IO_study02
 * @ClassName: IOTest07
 * @Description:
 * 文件字节输出流过程：
 *  1.创建源
 *  2.选择流
 *  3.操作（写出内容）
 *  4.释放资源
 * @author:Dong
 * @data 7月28-028 21:12
 */
public class IOTest07 {
    public static void main(String[] args){
        //1.创建源
        byte[] src = "talk is cheap show me the code".getBytes();
        //2.选择流
        InputStream is = null;
        try{
            is = new ByteArrayInputStream(src);
            //3.操作（分段读取）
            byte[] flush = new byte[5];//缓冲容器
            int len = -1;
            while((len =is.read(flush))!= -1){
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        }catch(IOException e){
            e.printStackTrace();

        }
        //
    }
}
