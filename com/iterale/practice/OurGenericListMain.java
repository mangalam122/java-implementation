package com.iterale.practice;

import java.util.Iterator;

public class OurGenericListMain {
    public static void main(String[] args) {
        OurGenericList<Integer> list=new OurGenericList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
     
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
