import java.io.File;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName: FileDemo01
 * 构建file对象
 * @Description:
 * @author:Dong
 * @data 7月26-026 14:38
 */
public class FileDemo01 {
    public static void main(String[] args){
        String path = "d:/1test/dog1.jpg";
        File src = new File(path);
        System.out.println(src.length());

        }
}
