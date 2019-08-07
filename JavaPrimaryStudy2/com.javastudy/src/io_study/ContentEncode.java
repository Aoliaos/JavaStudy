package io_study;

import java.io.UnsupportedEncodingException;

/**
 * @PackageName:io_study
 * @ClassName: ContentEncode
 * @Description:编码：字符字符串-->字节
 * @author:Dong
 * @data 7月27-027 14:34
 */
public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "姓名生命使命";
        //编码：字节数组
        byte[] datas = msg.getBytes();//默认编码方式
        System.out.println(datas.length);

        //编码：其他字符集
        datas = msg.getBytes("UTF-16LE");
        System.out.println(datas.length);

        datas = msg.getBytes("GBK");
        System.out.println(datas.length);

        }
}
