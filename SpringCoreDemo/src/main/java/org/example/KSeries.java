package org.example;

public class KSeries implements Engine{
    KSeries(){
        System.out.println("Kseries cons....");
    }
    @Override
    public int start() {
        System.out.println("Start kseries");
        return 1;
    }
}
