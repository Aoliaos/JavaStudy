package io_study;

import java.io.File;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName: FileDemo01
 * 构建file对象
 * 相对路径与绝对路径
 * 绝对路径：存在盘符：
 * 相对路径：不存在盘符
 * @Description:
 * @author:Dong
 * @data 7月26-026 14:38
 */
public class FileDemo02 {
    public static void main(String[] args){
        String path = "D:/1JavaCode/1test/dog1.jpg";
        File src = new File(path);
        System.out.println(src.getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
        
        }
}
