package RECURSION.PRoblemsonREcursion4;

import java.util.Scanner;

//Q3 - Given a number n, check whether it's a prime number or not using recursion.
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int ans = prime(n,n/2);
        if (ans==1){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
    static int prime(int n,int i){
        if (i==1){
            return 1;
        }
        if (n%i==0){
            return 0;
        }
        return prime(n,i-1);
    }
}
