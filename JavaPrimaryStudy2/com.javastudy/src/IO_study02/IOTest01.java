package IO_study02;

import java.io.*;

/**
 * @PackageName:IO_study02
 * @ClassName: IOTest01
 * @Description:
 * 过程：
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放
 * @author:Dong
 * @data 7月27-027 15:17
 */
public class IOTest01 {
    public static void main(String[] args){
        //创建源
        File src = new File("abc.txt");
        //选择流
        try {
            //读取操作
            InputStream is = new FileInputStream(src);
            int data1 = is.read();
            int data2 = is.read();
            int data3 = is.read();

            System.out.println((char)data1);
            System.out.println((char)data2);
            System.out.println((char)data3);
            //释放资源
            is.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }


        }
}
