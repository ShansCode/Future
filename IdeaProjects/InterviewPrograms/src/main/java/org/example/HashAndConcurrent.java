package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashAndConcurrent {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer,String> hmap=new HashMap<>();
        hmap.put(1,"santosh");
        hmap.put(2,"Ram");

        Thread thread1=new Thread(() -> {
            try {
                for (Map.Entry<Integer, String> itr : hmap.entrySet()) {
                    System.out.println("thread1 "+itr);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                System.out.println("Exception occured in thread 1");
            }
        });

        Thread thread2=new Thread(()->{
           try{
                   Thread.sleep(100);
               hmap.put(3, "Shyam");
               System.out.println("Thread2 added (3, Shyam) to HashMap");
           }catch (InterruptedException e) {
                System.out.println("Exception occured in thread 2");
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("\nFinal HashMap contents");
        for(Map.Entry<Integer,String >entry:hmap.entrySet()){
            System.out.println(entry);
        }

        ConcurrentHashMap<Integer,String> cmap= new ConcurrentHashMap<>();
        cmap.put(1, "santosh");
        cmap.put(2, "Ram");
        Thread thread3=new Thread(() ->{
            try{
                for(Map.Entry<Integer,String> ls:cmap.entrySet()){
                    System.out.println("thread3 "+ls);
                    Thread.sleep(300);
                }
            }catch(Exception e){
                System.out.println("Exception occured");
            }
        });

        Thread thread4=new Thread(()->{
           try{
                   Thread.sleep(200);
                    cmap.put(5,"robo");
                    System.out.println("thread4 add (5,robo)");
           }catch(Exception e){
               System.out.println("Error in thread 4");
           }
        });

        thread3.start();
        thread4.start();

        thread3.join();
        thread4.join();
        System.out.println("\nFinal ConcurrentHashMap contents");
        for(Map.Entry<Integer,String> entry:cmap.entrySet()){
            System.out.println(entry);
        }
    }
}
