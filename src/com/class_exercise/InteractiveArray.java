package com.class_exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Declare an array using this figures: 10,20,5,35,8,13.
 * And arrange the array in ascending order
 *
 * Note: the user is to determine the size of the arrays.
 *       The user would input the values
 */
public class InteractiveArray {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] num;
        System.out.print("Enter the amount of values you want to input: ");
        int size = keyboard.nextInt();

        num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter " + (i+1) + "Number");
            num[i] = keyboard.nextInt();
        }

        Arrays.sort(num);
        for(int i=0; i<num.length; i++){
            System.out.print(num + ", ");
        }
    }
}

