package com.kruvalgen.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// int arr[] = {1,1, 2, 1, 1,1 ,1,4, 5,6,7} посчитать количество каждой цифры и вывести на экран (цифра 1 встречается n раз)
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 1, 1, 1, 1, 4, 5, 6, 7};

//        Arrays.sort(arr);
//
//        int j = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == arr[i + 1]){
//                j++;
//            }else{
//                System.out.println("The number 1 occurs " + j + " times");
//                break;
//            }
//        }
        Map<Integer, Integer> arrMap = new HashMap<>();


        for (int i : arr) {
            int newValue = arrMap.getOrDefault(i, 0) + 1;
            arrMap.put(i, newValue);
        }

        printResult(arrMap);


    }

    public static void printResult (Map<Integer, Integer> arrMap){
        for (Map.Entry<Integer, Integer> pair : arrMap.entrySet()){
            Integer value = pair.getValue();
            Integer key = pair.getKey();
            System.out.println("Цифра " + key + " встечается " + value + " раз ");


        }
    }


}
