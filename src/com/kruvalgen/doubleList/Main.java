package com.kruvalgen.doubleList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> doubleList = new ArrayList<>();

        doubleList.add("red");
        doubleList.add("orange");
        doubleList.add("blue");
        doubleList.add("green");
        doubleList.add("yellow");
        doubleList.add("pink");
        doubleList.add("purple");
        doubleList.add("blue");
        doubleList.add("red");
        doubleList.add("orange");

//        Set<String> set = new LinkedHashSet<>(doubleList);
//        String[] rev = set.toArray(new String[set.size()]);               //ПЕРВЫЙ СПОСОБ
//        for (int i = rev.length - 1; i >= 0 ; i--) {
//            System.out.println(rev[i]);
//        }

        List<String> noRepeat = new ArrayList<>();
        for (int i = 0; i < doubleList.size() - 1 ; i++) {
            for (int j = i + 1; j < doubleList.size() ; j++) {
                if(doubleList.get(i).equals(doubleList.get(j))){

                }
            }

        }



    }
}
