package lgscourse.javacore.lesson21.Min;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Genreser {
	String value() default "";
}