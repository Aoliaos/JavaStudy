package IO_study02;

import java.io.*;

/**
 * @PackageName:IO_study02
 * @ClassName: IO_Test04
 * @Description:
 *  文件字节输出流过程：
 *  * 1.创建源
 *  * 2.选择流
 *  * 3.操作（写出内容）
 *  * 4.释放资源
 * @author:Dong
 * @data 7月27-027 16:52
 */
public class IO_Test04 {
    public static void main(String[] args){
        //1.创建流
        File src = new File("dest.txt");
        //选择流
        OutputStream os = null;
        try{
            os = new FileOutputStream(src,true);//默认false不追加，true为追加内容在末尾
            String msg = "IO is so easy!";
            byte[] datas = msg.getBytes();
            os.write(datas,0,datas.length);
            os.flush();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //释放资源
            try{
                if(null != os){
                    os.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        }
}
