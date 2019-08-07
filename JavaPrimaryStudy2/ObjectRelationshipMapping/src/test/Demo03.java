package test;

import bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @PackageName:test
 * @ClassName: Demo03
 * @Description:
 * @author:Dong
 * @data 7月31-031 20:58
 */
public class Demo03 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("bean.User");
            //通过反射API调用构造方法，构造对象
            User u = (User) clazz.newInstance(); //调用User无参构造方法
            System.out.println(u.getClass());

            Constructor<User> c = (Constructor<User>) clazz.getDeclaredConstructor(int.class, int.class, String.class);
            User u2 = c.newInstance(1001, 15, "dong");
            System.out.println(u2.getUname());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
