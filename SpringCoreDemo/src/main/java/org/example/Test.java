package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //ApplicationContext ap=new ClassPathXmlApplicationContext("Beans.xml");
        BeanFactory bFac=new ClassPathXmlApplicationContext("Beans.xml")
//        Car car=ap.getBean(Car.class);
//        KSeries ks=ap.getBean(KSeries.class);
//        car.drive();
    }
}
