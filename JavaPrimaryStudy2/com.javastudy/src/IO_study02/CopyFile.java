package IO_study02;

import java.io.*;

/**
 * @PackageName:IO_study02
 * @ClassName: CopyFile
 * @Description:
 * 使用文件输入和输出流，达到文件拷贝
 * @author:Dong
 * @data 7月27-027 17:10
 */
public class CopyFile {
    public static void main(String[] args) {
        copy("abc.txt","dest.txt");
    }

    /**
     *@ PackageName:IO_study02
     *@ClassName:copy
     *@Description://TODO
     * @param srcPath
    	 * @param goalPath 
     * @return void
     * @author DONG
     * @date 7月30-030 16:50
     **/
    public static void copy(String srcPath,String goalPath){        //1.创建流
        File src = new File(srcPath);
        File goal = new File(goalPath);
        //选择流
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(src);
            os = new FileOutputStream(goal,true);//默认false不追加，true为追加内容在末尾
            byte[] flush = new byte[1024];//缓冲容器
            int len = 0;//接收长度
            while((len = is.read(flush))!=-1) {
                //字节数组-->字符串（解码）
                os.write(flush,0,len);
            }
            os.flush();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            //释放资源 分别关闭,先打开的后关闭
            try{
                if(null != os){
                    os.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(null != os){
                    is.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
