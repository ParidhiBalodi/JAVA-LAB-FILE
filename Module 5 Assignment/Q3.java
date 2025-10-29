package Mod5_Assignment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AuthorInfo {
    String author();
    String version();
}

@AuthorInfo(author = "John Doe", version = "1.0")
public class MyClass {}