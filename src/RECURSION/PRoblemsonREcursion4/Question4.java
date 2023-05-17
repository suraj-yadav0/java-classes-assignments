package RECURSION.PRoblemsonREcursion4;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        System.out.println("Enter a decimal number:");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println(binary(n));
    }
    static int binary(int n){
        if (n==0){
            return 0;
        }else
            return(n%2+10 * binary(n/2)) ;

    }
}
