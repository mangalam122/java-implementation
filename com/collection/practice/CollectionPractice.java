package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionPractice{
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        

        List<Integer> list2=new ArrayList<>(list1);
      // so this is a deep copy of the list 

      // shallow copy of the list 
 /// sublist gives a view instead of a copy
     //List<Integer> copy = Collections.copy(list1);
    //  List<Integer> list4=Collections.copy(null, null);
    //  System.out.print(list4);


    //    List<Integer> list3=list2.subList(0, 3);
        // list3.set(0,200);
        // list3.add(500);
        // list3.add(898);
        // list2.add(7872);       
        // list1.remove(2);
        
        //   System.out.println(list2);
          //System.out.println(list3);

        //   ListIterator<Integer> it=list1.listIterator();
        //   System.out.println(it.next());
        //    System.out.println(it.next());
        //   System.out.println(it.previous());
        //           System.out.print(list1);

        List<Integer> link=new LinkedList<>();

        link.add(23);
        link.add(24);
        link.add(25);
       ListIterator<Integer> it=link.listIterator();
       while(it.hasNext()){
        System.out.print(it.next()+"  ");
       }



    }
}