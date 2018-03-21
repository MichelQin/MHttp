package im.wangchao.http.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Description  : Get.</p>
 * <p/>
 * <p>Author       : wangchao.</p>
 * <p>Date         : 15/10/17.</p>
 * <p>Time         : 下午6:38.</p>
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Get {

    /**
     * the request url
     */
    String url();

    /**
     * the request tag
     */
    String tag() default "";

    @Deprecated
    int timeout() default 0;

    /**
     * request heads
     */
    String[] heads() default {};
}
