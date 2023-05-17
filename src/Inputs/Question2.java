package Inputs;

import java.util.Scanner;

//Q2 - Input two different string and print them in same line.
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String first = sc.nextLine();
        System.out.println("Enter Second word:");
        String second  = sc.nextLine();
        System.out.println(first+second);
    }
}
