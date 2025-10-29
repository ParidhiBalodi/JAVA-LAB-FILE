package Mod5_Assignment;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RolesAllowed {
    String[] value();
}

@RolesAllowed({"ADMIN", "USER"})
public class SecureService {}