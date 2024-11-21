package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceProgram {
    private final AtomicInteger num=new AtomicInteger();

    public static void main(String[] args){
        ExecutorServiceProgram example=new ExecutorServiceProgram();
        example.executorExample();
    }

    public void executorExample(){
        ExecutorService executorService= Executors.newFixedThreadPool(5);

        for(int i=0;i<10;i++){
            executorService.submit(this::incrementCounter);
        }
        executorService.shutdown();
        while(!executorService.isTerminated()){
            //wait for all tasks to finish
        };
        System.out.println("Final num value"+ num.get());
    }

    private void incrementCounter() {
        int newValue=num.incrementAndGet();
        System.out.println("Thread number "+Thread.currentThread().getName()+" num incremented to"+newValue);
    }

}
