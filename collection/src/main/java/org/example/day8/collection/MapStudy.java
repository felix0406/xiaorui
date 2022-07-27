package org.example.day8.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStudy {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("a",2);
        Integer map1 = map.get("a");
        System.out.println(map1);


        Set<Map.Entry<String,Integer>> set  = map.entrySet();
        for (Map.Entry<String,Integer>entry:set){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        //for (int i = 0;i < set.size();i++){
          //  System.out.println(set.toArray()[i]);
        //}
        System.out.println(map.getOrDefault("a",0));

    }
}
