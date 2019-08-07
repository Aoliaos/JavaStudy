package testjavassist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @PackageName:testjavassist
 * @ClassName: TestRegex
 * @Description:
 * @author:Dong
 * @data 8月2-002 13:38
 */
public class TestRegex {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("\\w+");

        //创建Matcher对象
        Matcher matcher = pattern.matcher("asdsfdg233323");
        boolean yorn = matcher.matches();
        System.out.println(yorn);

        }
}
