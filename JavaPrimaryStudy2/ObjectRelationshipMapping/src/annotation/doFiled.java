package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PackageName:annotation
 * @ClassName: doFiled
 * @Description:
 * @author:Dong
 * @data 7月31-031 17:58
 */
@Target(value={ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface doFiled {
    //列名
    String columnName();
    //类型
    String type();
    //长度
    int length();
}
