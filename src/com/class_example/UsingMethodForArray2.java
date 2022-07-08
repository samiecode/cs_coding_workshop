package com.class_example;

import java.util.Arrays;

public class UsingMethodForArray2 {

    public static void main(String[] args) {
        Integer[] num;
        num = initialize();
        //Display
        display(sort(num));
    }
    static Integer[] initialize(){
        Integer[] numIn = {10,20,5,35,8,13};
        return numIn;
    }
    static Integer[] sort(Integer[] numIn){
        Arrays.sort(numIn);
        return numIn;

    }
    static void display(Integer[] numIn){
        for (int i = 0; i < numIn.length; i++) {
            System.out.print(numIn[i] + ", ");
        }
    }
}
