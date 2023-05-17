package Operator;

import java.util.Scanner;

//Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter any three digit number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int remainder = x%10;
             sum = remainder + sum;
        }
        System.out.println("The required value is:"+sum);
    }
}
