package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutionException;

/**
 * @PackageName:annotation
 * @ClassName: Demo03
 * @Description:
 * @author:Dong
 * @data 7月31-031 18:10
 */
public class GetAnnotations {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("annotation.Student");

            //获取类的所有有效注解
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a);
            }
            doTable dt = (doTable) clazz.getAnnotation(doTable.class);
            System.out.println(dt.value());

            //获得类的属性注解
            Field f = clazz.getDeclaredField("studentName");
            doFiled dofiled = f.getAnnotation(doFiled.class);
            System.out.println(dofiled.columnName()+"--"+dofiled.type()+"--"+dofiled.length());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}