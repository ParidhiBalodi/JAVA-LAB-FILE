package Mod5_Assignment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonField {
    String value();
}

public class userName {
    @JsonField("user_name")
    private String username;
}