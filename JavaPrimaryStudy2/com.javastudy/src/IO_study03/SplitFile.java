package IO_study03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @PackageName:IO_study03
 * @ClassName: RandomTest02
 * @Description:
 * @author:Dong
 * @data 7月30-030 9:26
 */
public class SplitFile {

    //源头
    private File src;
    //目的地
    private String destDir;
    //所有分割后的文件存储路径
    private List<String> destPaths;
    //每块大小
    private int blockSize;
    //块数：多少块
    private int size;

    public SplitFile(String srcPath,String destDir) {
        this(srcPath,destDir,1024);
    }
    public SplitFile(String srcPath,String destDir,int blockSize){
        this.src = new File(srcPath);
        this.destDir = destDir;
        this.blockSize = blockSize;
        this.destPaths = new ArrayList<String>();

        //初始化
        init();
    }

    //初始化
    private void init(){
        //总长度
        long len = this.src.length();
        //块数：多少块
        this.size = (int)Math.ceil(len*1.0/blockSize);
        //路径
        for(int i=0;i<size;i++){
            this.destPaths.add(this.destDir+"/"+ i +"-"+this.src.getName());
        }
    }
    /*
     *@Author:Dong
     *@Description:  分割 //TODO
     *@Date 11:01 7月30-030
     *@return
    **/

    public void split() throws IOException{
        //总长度
        long len = this.src.length();
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
            splitDetail(i,beginPos,actualSize);
        }
    }

    /*
     *@Author:Dong
     *@Description:
     * 指定第i块的起始位置和实际长度//TODO
     *@Date 10:29 7月30-030
     *@return
     **/

    public void splitDetail(int i,int beginPos,int actualSize)throws IOException{
        RandomAccessFile raf = new RandomAccessFile(this.src,"r");
        RandomAccessFile raf2 = new RandomAccessFile(this.destPaths.get(i),"rw");

        //随机读取
        raf.seek(beginPos);
        //读取
        byte[] flush = new byte[1024];
        int len = -1;
        while((len = raf.read(flush)) != -1){
            if(actualSize>len){
                raf2.write(flush,0,len);
                actualSize -= len;
            }else{
                raf2.write(flush,0,actualSize);
                break;
            }
        }
        raf2.close();
        raf.close();
    }
    /**
     * 文件的合并
     * @throws IOException
     */
    public void merge(String destPath) throws IOException {
        //输出流
        OutputStream os =new BufferedOutputStream( new FileOutputStream(destPath,true));
        Vector<InputStream> vi=new Vector<InputStream>();
        SequenceInputStream sis =null;
        //输入流
        for(int i=0;i<destPaths.size();i++) {
            vi.add(new BufferedInputStream(new FileInputStream(destPaths.get(i))));
        }
        sis =new SequenceInputStream(vi.elements());
        //拷贝
        //3、操作 (分段读取)
        byte[] flush = new byte[1024]; //缓冲容器
        int len = -1; //接收长度
        while((len=sis.read(flush))!=-1) {
            os.write(flush,0,len); //分段写出
        }
        os.flush();
        sis.close();
        os.close();
    }

    public static void main(String[] args) throws IOException{
        SplitFile sf = new SplitFile("dog1.jpg","dest");
        sf.split();
        sf.merge("newdog2.jpg");
    }
}
