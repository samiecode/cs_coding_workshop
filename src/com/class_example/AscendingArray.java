package com.class_example;

import java.util.Arrays;

/**
 * Declare an array using this figures: 10,20,5,35,8,13.
 * And arrange the array in ascending order
 */
public class AscendingArray {

    public static void main(String[] args) {

        int[] num = {10,20,5,35,8,13};
        Arrays.sort(num);

        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + ", ");
        }
    }
}
