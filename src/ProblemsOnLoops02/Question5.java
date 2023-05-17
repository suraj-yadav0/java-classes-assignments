package ProblemsOnLoops02;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j || i+j == n-1){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
