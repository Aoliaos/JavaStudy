package IO_study04;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.util.Collection;

/**
 * @PackageName:IO_study04
 * @ClassName: CIOTest02
 * @Description:
 * @author:Dong
 * @data 7月30-030 14:27
 */
public class CIOTest02 {
    public static void main(String[] args){
        Collection<File> files =  FileUtils.listFiles(new File("D:/1JavaCode/sxtStudy"), EmptyFileFilter.NOT_EMPTY, null);
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("---------------------------------------------");
        files =  FileUtils.listFiles(new File("D:/1JavaCode/sxtStudy"), EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("-----------------------------------------");

        files =  FileUtils.listFiles(new File("D:/1JavaCode/sxtStudy"), new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
        for(File file:files){
            System.out.println(file.getAbsolutePath());
        }
        }
}
