package INPUTvariable;

import java.util.Scanner;
//Q5 - Write a Java program to swap two numbers with the help of a third variable.
public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b  = sc.nextInt();
        System.out.println("Befor Swap:");
        System.out.println("a="+a+" and b="+b);
        int temp  = a;
        a = b;
        b = temp;
        System.out.println("After Swap:");
        System.out.println("a="+a+" and b="+b);

    }
}
