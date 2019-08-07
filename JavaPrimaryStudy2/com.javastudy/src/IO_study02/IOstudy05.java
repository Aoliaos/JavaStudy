package IO_study02;

import java.io.*;

/**
 * @PackageName:IO_study02
 * @ClassName: IOstudy05
 * 文件字符输入流
 * @Description:
 * @author:Dong
 * @data 7月27-027 17:36
 */
public class IOstudy05 {
    public static void main(String[] args){
        //创建源
        File src = new File("abc.txt");
        //选择流
        Reader reader = null;
        try {
            reader = new FileReader(src);
            //操作()分段读取
            char[] flush = new char[1024];//缓冲容器
            int len = -1;//接收长度
            while((len = reader.read(flush))!=-1){
                //字节数组-->字符串
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
                if(null != reader){
                    reader.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
