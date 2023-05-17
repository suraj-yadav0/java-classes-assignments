package Conditionals;

import java.util.Scanner;

//Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
//        and division.
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator (+, -, *, /):");
        int operator = sc.nextInt();
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (operator){
            case 1 :
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}
