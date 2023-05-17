package Operator;
//Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//        is taken with 5 and then multiply the resultant value by 5. Display the final result.

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("The required result is:"+(((x+8)/3)%5)*5);
    }
}
