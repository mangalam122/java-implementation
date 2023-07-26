package com.threads.practice;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("this is main thread starting ");
        //  Thread1 thread1=new Thread1("theodere thread");
        //  thread1.start();

         // Thread.sleep(10000);
          
          System.out.println("waking up after sleeping");
        //   Thread thread=new Thread(null, new Thread2(), "theard2", 0, false);

        //   Thread thread2=new Thread(()->{
        //     for(int i=0;i<5;i++){
        //         System.out.println("this is thread 2 using lambda function ");
        //     }
        //   },"thread2");
        //   thread2.start();
        //  thread.start();
                //  StackCustom stack=new StackCustom(10);
                // Thread thread1=new Thread(()->{
                //         for(int i=0;i<9;i++){
                //             System.out.println("stack pushed"+stack.push(100));
                //         }
                // },"Pushed");

                // Thread thread2=new Thread(()->{
                //       for(int i=0;i<9;i++){
                //         System.out.println("Stack pop -> "+stack.pop());
                //       }
                // },"Poped");

                //  thread1.start();
                //  thread2.start();


            // Thread thread3=new Thread(()->{        
            //     try {
            //            Thread.sleep(1);
            //         for(int i=10000;i>0;i--);
            //     } catch (InterruptedException e) {
                   
            //         e.printStackTrace();
            //     }
            // },"States");
            // thread3.start();
            // while(true){
            //     Thread.State states=thread3.getState();
            //     System.out.println(states);
            //     if(states==Thread.State.TERMINATED) break;
            // }

                // Thread thread4=new Thread(()->{
                //         System.out.println("this is child process and this is makes an asynchronous call");
                // },"Child thread");
                //    Thread thread5=new Thread(()->{
                //         System.out.println("thithread 5 with higher priority and should be executed before thread 4");
                // },"Child thread");
                // thread4.start();
                // thread5.start();
                // thread5.setPriority(1);
                // //System.out.println(thread4.getPriority());




                String lock1="mangalam";
                String lock2= "chaubey";

                    Thread thread6=new Thread(()->{
                            synchronized(lock1){
                                try {
                                    Thread.sleep(1);
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                                synchronized(lock2){
                                    System.out.println("lock aquired");
                                }
                            }
                    },"Thread1");


                    Thread thread7=new Thread(()->{
                         synchronized(lock2){
                                try {
                                    Thread.sleep(1);
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                                synchronized(lock1){
                                    System.out.println("lock aquired");
                                }
                            }
                    },"thread2");
                   
                    thread6.start();
                    thread7.start();
                     thread6.join();
                    thread7.join();

         System.out.println("main thread exiting ");



    }
}
