package IO_study02;

import java.io.*;

/**
 * @PackageName:IO_study02
 * @ClassName: IO_Test03
 * @Description:
 *  文件字节输入流过程：
 *  * 1.创建源
 *  * 2.选择流
 *  * 3.操作
 *  * 4.释放
 * @author:Dong
 * @data 7月27-027 15:57
 */
public class IO_Test03 {
    public static void main(String[] args){
        //创建源
        File src = new File("abc.txt");
        //选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //操作()分段读取
            byte[] flush = new byte[4];//缓冲容器
            int len = 0;//接收长度
            while((len = is.read(flush))!=-1){
                //字节数组-->字符串（解码）
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            //释放资源
            try{
                if(null != is){
                    is.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
