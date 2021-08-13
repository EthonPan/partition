package com.limitation.ann;

import java.lang.annotation.*;

/**
 * 算法分界注解
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Demarcation {

    String name() default "";

}
