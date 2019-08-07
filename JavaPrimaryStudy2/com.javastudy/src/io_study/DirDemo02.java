package io_study;

import java.io.File;

/**
 * @PackageName:io_study
 * @ClassName: DirDemo02
 * @Description:
 * 列出下一级
 * list()：当前层级名称
 * listFiles()：下级对象
 * @author:Dong
 * @data 7月26-026 15:38
 */
public class DirDemo02 {
    public static void main(String[] args){
        File dir = new File("D:/1JavaCode");

        //下级名称  list()
        String[] subNames = dir.list();
        for(String s:subNames){
            System.out.println(s);
        }

        System.out.println("----------------------");
        //下级对象 listFiles()
        File[] subFiles = dir.listFiles();
        for(File s:subFiles){
            System.out.println(s);
            //System.out.println(s.getAbsolutePath());
        }
        }
}
