package com.threads.practice;



public class StackCustom {

    private int stackTop;
    private int[] arr;
     Object lock;

    public StackCustom(int capacity){
        arr=new int[capacity];
        stackTop=-1;
        lock=new Object();
    }

    public boolean isEmpty(){
        return stackTop<0;
    }
      public boolean isFull(){
        return stackTop>=arr.length-1;
    }
    public synchronized boolean push(int element){
      if(isFull()){
            return false;
        }   
          stackTop++;
           try{Thread.sleep(1000);} catch(Exception e){ }
        
           
            arr[stackTop]=element;
           return true;
    
    }
    public synchronized int pop(){
       
            if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int poped=arr[stackTop];
        arr[stackTop]=Integer.MIN_VALUE;

         try{Thread.sleep(1000);} catch(Exception e){ }
     
         stackTop--;
        return poped;
    
    }
    
}
