package io_study;

import java.io.File;

/**
 * @PackageName:io_study
 * @ClassName: DirCount
 * @Description:
 * @author:Dong
 * @data 7月26-026 16:25
 */
public class DirCount {
    private long len;
    private String path;
    private int fileSize;

    //源
    private File src;

    public DirCount(String path){
        this.path = path;
        this.src = new File(path);
        count(this.src);
    }

    public static void main(String[] args){

        DirCount dir = new DirCount("D:\\1JavaCode\\IO_study01");
        System.out.println("文件夹总大小："+dir.getLen());
        System.out.println("文件个数："+dir.getFilesize());
        }

    //统计大小
    private void count(File src){
        //获取大小
        if(null!=src && src.exists()){
            if(src.isFile()){
                len += src.length();
                this.fileSize++;
            }else {
                for(File s:src.listFiles()){
                    count(s);
                }
            }
        }
    }

    public long getLen() {
        return len;
    }

    public int getFilesize() {
        return fileSize;
    }
}
