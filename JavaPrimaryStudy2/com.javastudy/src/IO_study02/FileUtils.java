package IO_study02;

import java.io.*;
import java.security.IdentityScope;

/**
 * @PackageName:IO_study02
 * @ClassName: FileUtil
 * @Description:
 * 分装
 * @author:Dong
 * @data 7月29-029 15:53
 */
public class FileUtils {
    public static void main(String[] args) {
        //文件到文件,加入字节缓冲流提高性能
        try {
            InputStream is = new BufferedInputStream(new FileInputStream("abc.txt"));
            OutputStream os = new BufferedOutputStream(new FileOutputStream("abc-copy.txt"));
            long t1 = System.currentTimeMillis();
            copy(is,os);
            long t2 = System.currentTimeMillis();
            System.out.println(t2-t1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //文件到字节数组
        byte[] datas = null;
        try {
            InputStream is = new FileInputStream("dog1.jpg");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            copy(is,os);
            datas = os.toByteArray();
            System.out.println(datas.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(datas);
            OutputStream os = new FileOutputStream("copy-dog1.jpg");
            copy(is,os);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    /*
     *@Author:Dong
     *@Description:
      * 对接输入输出流 //TODO
     *@Date  7月29-029
     *@return
    **/
    public static void copy(InputStream is,OutputStream os) {
        //文件到文件
        try {
            //3.操作（分段读取）
            byte[] flush = new byte[5];//缓冲容器
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            close(is,os);
        }
    }
//    public static void close(InputStream is,OutputStream os){
//        try {
//            if (null != is) {
//                is.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void close(Closeable... ios){
        for(Closeable io:ios){
            try {
                if (null != io) {
                    io.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
