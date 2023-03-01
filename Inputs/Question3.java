package Inputs;
//Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//        100), write a program to calculate his total marks and percentage marks.
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the student in three subjects out of 100 each:");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        float total  =  marks1+marks2+marks3;
        System.out.println("Total marks:"+(marks1+marks2+marks3));
        System.out.println("Percentage Marks:"+((total/300))*100+"%");
    }
}
