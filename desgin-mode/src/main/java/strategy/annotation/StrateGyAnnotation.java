package strategy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *      用户类型注解
 * </pre>
 *
 * @author shidijian@ycs168.cn
 * @version 1.00.00
 * @Date 2019-11-15 10:32
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StrateGyAnnotation {
    String value();
}
