package Inputs;

import java.util.Scanner;

//Q1 - Input name, roll number and field of interest from user and print in the format below :
//        Name: xyz, Roll number: xyz, Field of interest: xyz
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name :");
        String name = sc.nextLine();
        System.out.print("Enter the Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the field interest of the user:");
        String inttr = sc.nextLine();
        System.out.println("The required result is:");

        System.out.println("Name:"+name);
        System.out.println("Roll No: "+roll);
        System.out.println("Field of Interest: "+inttr);
    }
}
