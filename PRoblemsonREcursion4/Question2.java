package RECURSION.PRoblemsonREcursion4;

import java.util.Scanner;

public class Question2 {
//    Q2 - Given two number x and y find product using recursion.
    static int mult(int a,int b){
        if (a==0 || b== 0){
            return 0;
        }
        if (a==1){
            return b;
        }
        return mult(a-1,b) + b;
    }
    public static void main(String[] args) {
        System.out.println("Enter two values for Multiplication:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(mult(a,b));

    }
}
