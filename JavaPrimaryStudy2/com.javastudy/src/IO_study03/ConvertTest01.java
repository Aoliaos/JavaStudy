package IO_study03;

import java.io.*;

/**
 * @PackageName:IO_study03
 * @ClassName: ConvertTest
 * @Description:
 * 转换流：InputStreamReader  OutputStreamReader
 * 1.以字符流的形式操作字节流（纯文本）
 * 2.指定字符集
 * @author:Dong
 * @data 7月29-029 20:14
 */
public class ConvertTest01 {
    public static void main(String[] args){
        //
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));){
            String msg = "";
            while(!msg.equals("exit")){
                msg = reader.readLine();//循环读取
                writer.write(msg);//循环写出
                writer.newLine();
                writer.flush();//强制刷新，一般在最后写
            }

        }catch(IOException e){
        System.out.println("操作异常");
        }

        }
}
