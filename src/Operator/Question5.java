package Operator;

import java.util.Scanner;

//Q5 - Find the total number of bits needed to be flipped to convert x to y.
public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a^b;
        int count  = 0;
        while ( n!= 0){
            n = n&(n-1);
            count++;
        }

        System.out.println("Total number of bits required: "+count);

    }
}
