package com.queue.practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class queuePractice {
    public static void main(String[] args) {
        // offer , poll ,peek are three important methods in Queue interface that needs to be implemented by the classes that inherit it 

         // if we want to use queue the implementation we prefer is linked list one
         // if we want to use stack the implementatio we prefer is ArrayQueue one 
        // Deque interface extends the Queue interface and it hass doubly ended queues
       int arr[]=new int[100];
       for(int i=0;i<arr.length;i++){
        arr[i]=100+i;
       }
       //FIFO queue
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        // System.out.println(q.peek());
        // while(!q.isEmpty()){
        //     System.out.print(q.peek()+" ");
        //     q.poll();
        // }

       System.out.println();
        //Stack

        Stack<Integer> stack=new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // while(!stack.isEmpty()){
        //     System.out.print(stack.peek()+ " ");
        //     stack.pop();
        // }

        // ArrayDequeue

        // Deque<Integer> dq=new ArrayDeque<>();
        // dq.offerFirst(1);
        // dq.offerFirst(2);
        // System.out.println(dq.peekLast());

        // dq.offerLast(100);
        // dq.offerLast(200);
        // System.out.println(dq);
            
         //Priority Queue
          // this comparator is known as 
         PriorityQueue<Integer> pq=new PriorityQueue<>(new CustomComparator());
         pq.offer(100);
         pq.offer(2);
         pq.offer(0);
         pq.offer(300);
         pq.offer(-1);

         List<Integer> list=new ArrayList<>();
         int index=1;
        //  System.out.println(pq);
         while(!pq.isEmpty()){
            if(index==3){
                break;
            }
            list.add(pq.poll());
            index++;
         }
         System.out.println(list);
        //   System.out.println(pq);

        // List<StudentMarks> stMarks=new ArrayList<>();
        // stMarks.add(new StudentMarks(54,100));
        // stMarks.add(new StudentMarks(84,76));
        // stMarks.add(new StudentMarks(95,89));
        // stMarks.add(new StudentMarks(88,96));
        // stMarks.add(new StudentMarks(45,56));

        // PriorityQueue<StudentMarks> spq=new PriorityQueue<>(stMarks);

        // List<StudentMarks> temp=new ArrayList<>();

        // index=1;
        //  //System.out.println(spq);
        //  while(!spq.isEmpty()){
        //     if(index==3){
        //         break;
        //     }
        //     temp.add(spq.poll());
        //     index++;
        //  }
        //     System.out.println(temp);
        // }
        }
}
