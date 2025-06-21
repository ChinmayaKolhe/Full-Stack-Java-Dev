package org.example;

public class Car {
    private Engine engine;
    public Car(){
        System.out.println("Car cons...");
    }
    public Car(Engine engine){
        System.out.println("Car para cons...");
        this.engine=engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Car setter method");
        this.engine = engine;
    }

    public void drive(){
        int start=engine.start();
        if(start>=1){
            System.out.println("Car is running....");
        }
        else{
            System.out.println("Engine not running");
        }
    }
}
