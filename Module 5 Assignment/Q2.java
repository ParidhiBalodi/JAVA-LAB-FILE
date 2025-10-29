package Mod5_Assignment;

import java.lang.reflect.Field;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        User user = new User();
        Class<?> clazz = user.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MinLength.class)) {
                MinLength annotation = field.getAnnotation(MinLength.class);
                System.out.println(field.getName() + " Min Length: " + annotation.value());
            }
        }
    }
}