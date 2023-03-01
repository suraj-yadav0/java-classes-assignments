package Inputs;

import java.util.Scanner;
//Q4 - Given two numbers, return their sum in the following format:
//        Int t representing number of test cases
//        T lines of Two integers representing the numbers to be added
public class Quetion4 {
    public static void main(String[] args) {
        System.out.println("Enter no. of pairs:");
        Scanner sc = new Scanner(System.in);
        int pair = sc.nextInt();
        for (int i = 1; i <=pair ; i++) {
            System.out.println("Enter value OF two integers:");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x+y);
        }
    }
}
