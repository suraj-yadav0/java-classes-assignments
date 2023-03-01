package Conditionals;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        int marks = sc.nextInt();
        if (100>=marks && marks>90){
            System.out.println("Your Grade is A+");
            return;
        }
        if (90>=marks && marks>80){
            System.out.println("Your Grade is A");
            return;
        }
        if (80>=marks && marks>70){
            System.out.println("Your Grade is B+");
            return;
        }
        if (70>=marks && marks>60){
            System.out.println("Your Grade is B");
            return;
        }
        if (60>=marks && marks>50){
            System.out.println("Your Grade is C");
            return;
        }
        if (50>=marks && marks>40){
            System.out.println("Your Grade is D");
            return;
        }
        if (40>=marks && marks>30){
            System.out.println("Your Grade is E");
            return;
        }
        if (30>=marks && marks>0){
            System.out.println("Your Grade is F");
            return;
        }else {
            System.out.println("Invalid Input.");
        }
    }
}
