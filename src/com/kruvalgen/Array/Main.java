package com.kruvalgen.Array;

import java.util.Arrays;
// int arr[] = {1,1, 2, 1, 1,1 ,1,4, 5,6,7} посчитать количество каждой цифры и вывести на экран (цифра 1 встречается n раз)
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 1, 1, 1, 1, 4, 5, 6, 7};

        Arrays.sort(arr);

        int j = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[i + 1]){
                j++;
            }else{
                System.out.println("The number 1 occurs " + j + " times");
                break;
            }
        }
    }
}
