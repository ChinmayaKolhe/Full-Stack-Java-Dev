package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        DbOperation db=new DbOperation();
        Method method=DbOperation.class.getMethod("readdata");
        if(method.isAnnotationPresent(LogExecutionTime.class)){
            long start=System.currentTimeMillis();
            method.invoke(db);
            long end=System.currentTimeMillis();
            System.out.println("Execution time="+(end-start));
        }
    }
}
