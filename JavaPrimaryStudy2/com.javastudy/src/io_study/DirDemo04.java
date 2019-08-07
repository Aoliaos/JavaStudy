package io_study;

import java.io.File;

/**
 * @PackageName:io_study
 * @ClassName: DirDemo03
 * @Description:
 * 递归：方法自己调用自己
 * 递归头：何时结束递归
 * 递归体：重复调用
 * @author:Dong
 * @data 7月26-026 15:52
 */
public class DirDemo04 {
    public static void main(String[] args){
        File src = new File("D:/1JavaCode/IO_study01");
        printName(src,0);
        }
    public static void printName(File src,int deep){
        for(int i=0; i<deep; i++){
            System.out.print("-");
        }
        System.out.println(src.getName());
        if(null == src || !src.exists()){
            return;
        }else if(src.isDirectory()){
            for(File s:src.listFiles()){
                printName(s,deep+1);
            }
        }

    }
}
