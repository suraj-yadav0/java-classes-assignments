package ProblemsOnLoops02;

import java.util.Scanner;

//Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
public class Question1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt(); int a = 0;
        int b = 1;

        System.out.println("The Fibonacci Series is:");

        for (int i = 0; i < n ; i++) {

            int k = a+b;
            System.out.println(k);
            b = a;
            a = k;

        }

    }
}
