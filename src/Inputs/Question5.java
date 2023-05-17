package Inputs;

import java.util.Scanner;

//Q5 - Given few lines of input(number of lines unknown) where each line has two
//        strings, concatenate the strings.
public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter two Strings:");
        Scanner sc = new Scanner(System.in);
        String lin1  = sc.nextLine();
        String line2 = sc.nextLine();
        System.out.println(lin1+line2);
    }
}
