package Conditionals;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value:");
        int x = sc.nextInt();
        int val = Math.abs(x);
        System.out.println("The absolute value is:"+val);
    }
}
