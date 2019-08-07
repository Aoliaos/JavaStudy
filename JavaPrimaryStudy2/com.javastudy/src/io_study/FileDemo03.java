package io_study;

import java.io.File;

/**
 * @PackageName:io_study
 * @ClassName: FileDemo03
 * getName()
 *
 * @Description:
 * @author:Dong
 * @data 7月26-026 14:54
 */
public class FileDemo03 {
    public static void main(String[] args){
        String path = "D:/1JavaCode/dog1.jpg";
        File src = new File(path);

        System.out.println("是否存在："+src.exists());
        System.out.println("是否是文件："+src.isFile());
        System.out.println("名称："+src.getName());
        System.out.println("路径："+src.getParent());
        System.out.println("绝对路径："+src.getAbsolutePath());
        }
}
