package com.class_example;

import java.util.Arrays;
import java.util.Collections;

/**
 *  Ascending Order
 */
public class UsingMethodForArray {

    public static void main(String[] args) {
        int[] num;
        num =initialize();
        //Display
        display(sort(num));
    }
    static int[] initialize(){
        int[] numIn = {10,20,5,35,8,13};
        return numIn;
    }

    static int[] sort(int[] numIn){
        Arrays.sort(numIn);
        return numIn;
    }

    static void display(int[] numIn){
        for (int i = 0; i < numIn.length; i++) {
            System.out.print(numIn[i] + ", ");
        }
    }
}
