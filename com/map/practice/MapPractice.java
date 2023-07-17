package com.map.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("mangalam",1);
        map.put("simon",2);
        map.put("annie",3);
                
       map.remove("simon");
    //    System.out.println(map);
    //     System.out.println(map.get("mangalam"));
    //     boolean ans=map.containsKey("ksdvndsk");
    //     System.out.println(ans);
        map.remove("simon");

        Set<Map.Entry<String, Integer>> entrySt=map.entrySet();
        for(Map.Entry<String,Integer> entry:entrySt){
               // System.out.println(entry);
        }
        // 1-2
        // 3-4
        // 1-5


        Map<Integer,List<Integer>> map2=new HashMap<>();
        if(map2.get(1)==null){
            map2.put(1, new ArrayList<Integer>());
            map2.get(1).add(2);
            map2.get(1).add(5);
        }
          //System.out.println(map2);

          

          NavigableMap<Integer,String> tmap=new TreeMap<>();

          tmap.put(0,"mangalam");
          tmap.put(2,"rahul");
          tmap.put(3,"sanam");
          System.out.println(tmap);
          System.out.println(tmap.ceilingEntry(1));
          Set<Map.Entry<Integer,String>> et=tmap.entrySet();

          for(Map.Entry<Integer,String> e:et){
            System.out.println(e.getKey()+"  "+e.getValue());
          }
    }
}
