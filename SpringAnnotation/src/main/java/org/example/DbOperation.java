package org.example;

public class DbOperation {
    @LogExecutionTime
    public void readdata() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Task completed");
    }
}
