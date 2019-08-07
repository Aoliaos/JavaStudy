package IO_study02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @PackageName:IO_study02
 * @ClassName: FileUtiles2
 * @Description:try...with...resours
 * @author:Dong
 * @data 7月29-029 16:40
 */
public class FileUtiles2 {
    public static void copy(InputStream is, OutputStream os) {
        //文件到文件
        try (is; os) {
            //3.操作（分段读取）
            byte[] flush = new byte[5];//缓冲容器
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
