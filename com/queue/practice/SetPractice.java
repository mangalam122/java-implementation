package com.queue.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(0);
        list.add(2);

        Set<Integer> set1=new HashSet<Integer>();
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2=new HashSet<Integer>();

        set2.addAll(list);
  
    //     System.out.println(set2);
    //     set2.removeAll(set1);
    //   System.out.println("After retaining");
    //        System.out.println(set2);
        System.out.println(set1);

        List<StudentMarks> stMarks=new ArrayList<>();
        stMarks.add(new StudentMarks(54,100));
        stMarks.add(new StudentMarks(84,76));
        stMarks.add(new StudentMarks(95,89));
        stMarks.add(new StudentMarks(88,96));
        stMarks.add(new StudentMarks(45,56));
         Set<StudentMarks> set3=new HashSet<>(stMarks);
      
    //   System.out.println(set3);
               
    //     Iterator<Integer> it=set1.iterator();
    //        while(it.hasNext()){
    //         System.out.print(it.next()+" ..");
    //        }

         System.out.println(set3.contains(new StudentMarks(54,100)));

         NavigableSet<Integer> treeset=new TreeSet<>();
         treeset.add(2);
         treeset.add(3);

         treeset.add(4);
         treeset.add(0);

         System.out.println(treeset.higher(3));


    }
}
