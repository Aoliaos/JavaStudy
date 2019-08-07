package IO_study03;

import java.io.*;

/**
 * @PackageName:IO_study03
 * @ClassName: DataTest
 * @Description:
 * @author:Dong
 * @data 7月29-029 21:28
 */
public class DataTest {
    public static void main(String[] args)throws IOException {
        //写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));

        //操作数据类型+数据
        dos.writeUTF("编码好");
        dos.writeInt(18);
        dos.writeBoolean(true);
        dos.writeChar('a');
        dos.flush();

        byte[] datas = baos.toByteArray();
        //读取
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        //顺序与书写一致
        String msg = dis.readUTF();
        int age = dis.readInt();
        boolean flag = dis.readBoolean();
        char ch = dis.readChar();
        System.out.println(flag);

        }
}
