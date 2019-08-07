package IO_study03;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @PackageName:IO_study03
 * @ClassName: RandomTest02
 * @Description:
 * @author:Dong
 * @data 7月30-030 9:26
 */
public class RandomTest02 {
    public static void main(String[] args) throws IOException {
        File src = new File("src/IO_study03/DataTest.java");
        //总长度
        long len = src.length();
        //每块大小
        int blockSize = 512;
        int size = (int)Math.ceil(len*1.0/blockSize);
        System.out.println(size);

        //起始位置和实际大小
        int beginPos = 0;
        int actualSize = (int)(blockSize>len?len:blockSize);
        for(int i=0;i<size;i++){
            beginPos = i*blockSize;
            if(i==size-1){//最后一块
                actualSize = (int)len;
            }else{
                actualSize = blockSize;
                len -= actualSize;//剩余量
            }
            System.out.println(i+"-->"+beginPos+"-->"+actualSize);
            split(i,beginPos,actualSize);
        }


}
/*
 *@Author:Dong
 *@Description:
  * 指定第i块的起始位置和实际长度//TODO
 *@Date 10:29 7月30-030
 *@return
**/

    public static void split(int i,int beginPos,int actualSize)throws IOException{
        RandomAccessFile raf = new RandomAccessFile(new File("src/IO_study03/DataTest.java"),"r");

        //随机读取
        raf.seek(beginPos);
        //读取
        byte[] flush = new byte[1024];
        int len = -1;
        while((len = raf.read(flush)) != -1){
            if(actualSize>len){
                System.out.println(new String(flush,0,len));
                actualSize -= len;
            }else{
                System.out.println(new String(flush,0,actualSize));
                break;
            }
        }
        raf.close();
    }
    }
