package INPUTvariable;

import java.util.Scanner;

//Q4 - Write a Java program to calculate the cube of a number.
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter any number number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Cube of the number is:" + n*n*n);
    }
}
