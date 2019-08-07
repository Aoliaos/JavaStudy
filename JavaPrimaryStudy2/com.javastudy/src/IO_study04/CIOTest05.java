package IO_study04;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.io.IOException;

/**
 * @PackageName:IO_study04
 * @ClassName: CIOTest05
 * //文件拷贝，重点掌握
 * @Description:
 * @author:Dong
 * @data 7月30-030 15:18
 */
public class CIOTest05 {
    public static void main(String[] args) throws IOException {
        //复制文件
        FileUtils.copyFile(new File("dog1.jpg"),new File("copydog22222.jpg"));

        //拷贝文件到目录
        FileUtils.copyFileToDirectory(new File("dog1.jpg"),new File("src"));
        }
}
