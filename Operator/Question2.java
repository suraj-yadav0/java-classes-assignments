package Operator;

import java.util.Scanner;

//Q2 - Swap two numbers without the use of third variable.
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Original Values:");
        System.out.println(num1);
        System.out.println(num2);

        num1 = num2+num1;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("Swapped Values:");
        System.out.println(num1);
        System.out.println(num2);
    }
}
