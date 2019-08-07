package IO_study04;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * @PackageName:IO_study04
 * @ClassName: CIOTest03
 * @Description:读取内容
 * @author:Dong
 * @data 7月30-030 14:42
 */
public class CIOTest03 {
    public static void main(String[] args) throws IOException {
        //读取文件
        String msg = FileUtils.readFileToString(new File("emp.txt"),"UTF-8");
        System.out.println(msg);
        byte[] datas = FileUtils.readFileToByteArray(new File("emp.txt"));
        System.out.println(datas.length);

        //逐行读取
        List<String> msgs =  FileUtils.readLines(new File("emp.txt"),"UTF-8");
        for(String string:msgs){
            System.out.println(string);
        }
System.out.println("----------------------------------------------------");
        LineIterator it = FileUtils.lineIterator(new File("emp.txt"),"UTF-8");
        while(it.hasNext()){
            System.out.println(it.nextLine());
        }

        //写出文件
        FileUtils.write(new File("happy.txt"),"节日快乐！！\r\n","UTF-8");
        FileUtils.writeStringToFile(new File("happy.txt"),"节日快乐！！","UTF-8",true);
        FileUtils.writeByteArrayToFile(new File("happy.txt"),"节日快乐555！！".getBytes("UTF-8"),true);

    }
}
