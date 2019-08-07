package IO_study03;

import java.io.*;

/**
 * @PackageName:IO_study03
 * @ClassName: PrintTest01
 * @Description:
 * @author:Dong
 * @data 7月30-030 8:27
 */
public class PrintTest01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = System.out;
        ps.println("打印流");

        ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
        ps.println("打印流输入到文本");
        ps.println(true);

        //重定向输出端
        System.setOut(ps);
        System.out.println("change");
        //重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
        System.out.println("change");
        ps.close();
    }
}
