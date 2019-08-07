package io_study;

import java.io.File;

/**
 * @PackageName:io_study
 * @ClassName: DirDemo01
 * 1.mkdir()确保上级目录存在
 * 2.mkdirs()上级可以不存在，不存在一同创建（多用这条语句）
 * @Description:
 * @author:Dong
 * @data 7月26-026 15:32
 */
public class DirDemo01 {
    public static void main(String[] args){

        File dir = new File("D:/1JavaCode/IO_study01/dir/test");
        boolean flag = dir.mkdirs();
        System.out.println(flag);
    }
}
