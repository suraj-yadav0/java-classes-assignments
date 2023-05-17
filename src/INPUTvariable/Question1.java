package INPUTvariable;

import java.util.Scanner;

//Q1 - Take 2 integer values in two variables x and y and print their product.
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter the two values You want to multiply:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multiplication of two number is:"+ a*b);
    }
}
