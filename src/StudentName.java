//A program that holds 10 names of students using for loop to receive the student name.

import java.util.Scanner;

public class StudentName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] names = new String[10];

        System.out.println("Enter 10 Student Names");
        for (int i = 0; i < names.length; i++) {
            System.out.print((i+1) + " Student Name: ");
            names[i] = input.nextLine();
        }
        
        System.out.println("Using for loop to display the 10 student name: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }
        System.out.println(); // blank line.

        System.out.println("Using enhanced for loop to display the 10 student name: ");
        for(String item : names){
            System.out.print(item + ", ");
        }

    }
}