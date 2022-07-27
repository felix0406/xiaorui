package org.example.day8.collection;
import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Random;

public class StreamStudy {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>(20);
        for (int i = 0;i<10;i++){
            list1.add(new Random().nextInt(10));
        }
        for (int i = 0;i<10;i++){
            Integer o = list1.get(i);
            System.out.println(list1.get(i));
        }
        list1.stream().forEach(o -> {
            Integer i = o + 1;
            System.out.println(i);
        });
        Set<Integer>set = new HashSet<>();
        for (int i = 0;i<10;i++){
            list1.add(new Random ().nextInt(10));
        }
        //排序
        list1.stream( )
                .sorted((o1,o2) -> o2-o1)
                .filter(o -> 0 > 1)
                .distinct()
                .forEach( o -> {
                    System.out.println(o);
                });
        //map
        Set<String >set2 = list1.stream().map(o -> {
            return o.toString();
        }).collect(Collectors.toSet());



    }
}
