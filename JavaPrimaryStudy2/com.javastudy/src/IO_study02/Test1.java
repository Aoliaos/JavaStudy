package IO_study02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @PackageName:IO_study02
 * @ClassName: Test1
 * @Description:
 * @author:Dong
 * @data 7月27-027 15:41
 */
public class Test1 {
    public static void main(String[] args){
        File src = new File("abc.txt");

        FileInputStream s = null;
        try{
            s = new FileInputStream(src);
            int temp;
            while((temp = s.read())!=-1){
                System.out.print((char)temp);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{if(null != s){
                s.close();}
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        }
}
