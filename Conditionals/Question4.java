package Conditionals;

import java.util.Scanner;

//Q4 - Write a program to print positive number entered by the user, if user enters a negative
//        number, it is skipped
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value:");
        int x = sc.nextInt();
        if (x>=0){
            System.out.println(x);
        }else {
            System.out.println("It is skipped becuse , user entered a negative number.");
        }
    }
}
