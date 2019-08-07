package IO_study02;

import java.io.*;

/**
 * @PackageName:IO_study02
 * @ClassName: IOTest09
 * 1、图片读取到字节数组
 * 2、字节数组写出到文件
 * @Description:
 * @author:Dong
 * @data 7月28-028 22:03
 */
public class IOTest09 {
    public static void main(String[] args) {
        //图片转成字节数组
        byte[] datas = fileToByteArray("dog1.jpg");
        System.out.println(datas.length);

        byteArrayToBytoFile(datas, "newdog1.jpg");
    }

    /*1、图片读取到字节数组
    a.图片到程序  InputStream
    b.程序到字节数组    ByteArrayOutputStream
    */
    public static byte[] fileToByteArray(String filePath) {
        //创建源与目的地
        File src = new File(filePath);
        byte[] dest = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(src);
            baos = new ByteArrayOutputStream();
            //操作()分段读取
            byte[] flush = new byte[1024 * 10];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
                //写出到字节数组
                baos.write(flush, 0, len); //写出到字节数组中
            }
            baos.flush();
            return baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            try {
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /*2、字节数组写出到文件
    a.字节数组到程序  ByteArrayInputStream
    b.程序到文件    FileOutputStream
    */
    public static void byteArrayToBytoFile(byte[] src, String filePath) {
        //1.创建源
        File dest = new File(filePath);
        //2.选择流
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);
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
            try {
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
