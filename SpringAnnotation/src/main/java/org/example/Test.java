package org.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation{
    String Value();
}

@MyAnnotation(Value = "Chinmaya Kolhe")
public class Test {
    public static void main(String[] args) {
        Class<Test> obj= Test.class;
        if(obj.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation annotation = obj.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.Value());
        }
    }
}
