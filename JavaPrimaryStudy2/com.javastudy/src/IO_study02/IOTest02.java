package IO_study02;

import java.io.*;

/**
 * @PackageName:IO_study02
 * @ClassName: IOTest01
 * @Description:
 * 文件字节输入流过程：
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放
 * @author:Dong
 * @data 7月27-027 15:17
 */
public class IOTest02 {
    public static void main(String[] args){
        //创建源
        File src = new File("abc.txt");
        //选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //读取操作
            int temp;
            while((temp = is.read())!=-1){
                System.out.println((char)temp);
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
