package com.threads.practice;

public class Thread2  implements Runnable{
 
    public void run(){
        System.out.println("Inside Thread2 " +Thread.currentThread());
    }
}
