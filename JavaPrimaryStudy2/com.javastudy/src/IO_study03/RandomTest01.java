package IO_study03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @PackageName:IO_study03
 * @ClassName: RandomTest011
 * @Description:
 * @author:Dong
 * @data 7月30-030 9:01
 */
public class RandomTest01 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("src/IO_study03/DataTest.java"),"r");
        //随机读取
        raf.seek(2);
        //读取
        byte[] flush = new byte[1024];
        int len = -1;
        while((len = raf.read(flush)) != -1){
            System.out.println(new String(flush,0,len));
        }
        raf.close();

        }

}
