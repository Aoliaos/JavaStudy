package io_study;

import java.io.UnsupportedEncodingException;

/**
 * @PackageName:io_study
 * @ClassName: ContentDecode
 * @Description:
 * @author:Dong
 * @data 7月27-027 14:43
 */
public class ContentDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "姓名生命使命";
        //编码：字节数组
        byte[] datas = msg.getBytes();//默认编码方式
        //System.out.println(datas.length);
        msg = new String(datas,0,datas.length,"utf8");
        System.out.println(msg);

        //乱码
        //原因1、字节数不够
        //原因2、字符集不统一

    }
}
