package IO_study03;

import java.io.*;

/**
 * @PackageName:IO_study03
 * @ClassName: PrintTest02
 * @Description:
 * @author:Dong
 * @data 7月30-030 8:53
 */
public class PrintTest02 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")),true);
        pw.println("打印流输入到文本");
        pw.println(true);
        pw.close();
        }
}
