package IO_study04;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @PackageName:com.dong.commons
 * @ClassName: CIOTest01
 * @Description:
 * @author:Dong
 * @data 7月30-030 12:47
 */
public class CIOTest01 {
    public static void main(String[] args)throws IOException {
        //文件大小
        long len = FileUtils.sizeOf(new File("abc.txt"));
        System.out.println(len);
        //目录大小
        len = FileUtils.sizeOf(new File("D:/1JavaCode/sxtStudy"));
        System.out.println(len);
    }
}
