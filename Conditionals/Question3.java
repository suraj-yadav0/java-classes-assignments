package Conditionals;
//Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//calculate Profit or Loss.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price:");
        int cp = sc.nextInt();
        System.out.println("Enter the Selling Price:");
        int sp = sc.nextInt();
        if (cp<sp){
            int profit = sp - cp;
            System.out.println("The Profit is:"+profit);
        }else if(cp==sp){
            System.out.println("There is No Profit , No loss.");
        }else {
            int loss = cp-sp;
            System.out.println("The Loss is:"+loss);
        }
    }
}
