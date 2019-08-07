package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @PackageName:test
 * @ClassName: Demo01
 * @Description:
 * @author:Dong
 * @data 7月31-031 20:38
 */
public class Demo01 {
    public static void main(String[] args) {
        String path = "bean.User";
        try {
            Class<?> clazz = Class.forName(path);
            //获取包名类名
            System.out.println("获取包名.类名:"+clazz.getName());//获取包名+类名
            System.out.println("获取类名:"+clazz.getSimpleName());//获取类名

            //获取属性名,clazz.getFields()只能获得public修饰的属性;getDeclaredFields()获得所有属性
            Field[] fields = clazz.getFields();
            Field[] fields2 = clazz.getDeclaredFields();
            Field f = clazz.getDeclaredField("uname");
            System.out.println("public属性个数："+fields.length);
            System.out.println("所有属性个数："+fields2.length);
            for(Field temp:fields2){
                System.out.println("属性:"+temp);
            }

            //获取方法
            Method[] methods = clazz.getDeclaredMethods();
            Method m01 = clazz.getDeclaredMethod("");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
