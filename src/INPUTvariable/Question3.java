package INPUTvariable;

import java.util.Scanner;

//Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the rectangle:");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        int breadth = sc.nextInt();
        // area of rectangle is length into breadth
        System.out.println("Area of rectangle is:"+ len*breadth);
    }
}
