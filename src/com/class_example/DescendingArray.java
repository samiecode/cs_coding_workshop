package com.class_example;

import java.util.Arrays;
import java.util.Collections;

public class DescendingArray {

    public static void main(String[] args) {

        Integer[] num = {10,20,5,35,8,13};
        Arrays.sort(num, Collections.reverseOrder());

        for(int i=0; i<num.length; i++){
            System.out.print(num + ", ");
        }

    }
}
