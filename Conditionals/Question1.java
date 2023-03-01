package Conditionals;

import java.util.Scanner;

//Q1 - Write a program which takes the values of length and breadth from user and check if it is
//a square or not.
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Length:");
        int len = sc.nextInt();
        System.out.println("Enter the value of Breadth:");
        int breadth = sc.nextInt();
        if (len==breadth){
            System.out.println("It is a Square.");
        }else {
            System.out.println("It is a rectangle.");
        }

    }
}
