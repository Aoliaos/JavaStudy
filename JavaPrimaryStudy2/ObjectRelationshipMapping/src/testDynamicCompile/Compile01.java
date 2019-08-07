package testDynamicCompile;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;

/**
 * @PackageName:TestDynamicCompile
 * @ClassName: Compile01
 * @Description:
 * @author:Dong
 * @data 8月1-001 10:16
 */
public class Compile01 {
    public static void main(String[] args) throws InterruptedException, IOException {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result  = compiler.run(null,null,null,
                "D:/1JavaCode/helloworld.java");
        System.out.println(result==0?"编译成功！":"编译失败！");

        Runtime run = Runtime.getRuntime();
        Process process = run.exec("java -cp D:/1JavaCode  helloworld");

        InputStream in = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String info = "";
        while((info=reader.readLine())!=null ){
            System.out.println(info);
        }
        }
}
