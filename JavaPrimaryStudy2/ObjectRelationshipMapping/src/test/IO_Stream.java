package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @PackageName:test
 * @ClassName: IO_Stream
 * @Description:
 * @author:Dong
 * @data 8月2-002 14:09
 */
public class IO_Stream {

        //获取网络资源
public static String getURLContent(String urlStr, String charset){
    StringBuffer sb = new StringBuffer();
    try{
        URL url = new URL(urlStr);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), Charset.forName(charset)));
        String temp = "";
        while((temp=reader.readLine())!=null){
            sb.append(temp);
        }
        System.out.println(sb.toString());
    }catch(Exception e){
        e.printStackTrace();
    }
    return sb.toString();
}

//
    public static List<String> getMatherSubstrs(String destStr, String regexStr){
        Pattern p = Pattern.compile(regexStr);
        Matcher m = p.matcher(destStr);
        List<String> result = new ArrayList<String>();
        while(m.find()){
            result.add(m.group(1));
        }
        return result;
    }
    public static void main(String[] args){
        String destStr = getURLContent("https://www.163.com","gbk");

        List<String> result = getMatherSubstrs(destStr,"href=\"([\\w\\s./:]+?)\"");

        for(String temp:result){
            System.out.println(temp);
        }
    }
}
