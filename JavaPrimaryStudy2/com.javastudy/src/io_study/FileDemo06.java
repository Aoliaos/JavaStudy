package io_study;

import java.io.File;
import java.io.IOException;

/**
 * @PackageName:io_study
 * @ClassName: FileDemo05
 * @Description:
 * @author:Dong
 * @data 7月26-026 15:20
 */
public class FileDemo06 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:/1JavaCode/io.txt");
        boolean flag = src.createNewFile();
        System.out.println(flag);
        }
}
