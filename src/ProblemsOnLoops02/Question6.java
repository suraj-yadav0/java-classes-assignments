package ProblemsOnLoops02;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the pattern:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (char i = 'a'; i <'g' ; i++) {
            for (char j = 'a'; j <'g' ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
