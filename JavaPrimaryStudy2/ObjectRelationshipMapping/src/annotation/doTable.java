package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName: Table
 * @Description:
 * @author:Dong
 * @data 7月31-031 17:53
 */

@Target(value={ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface doTable {
    String value();
}
