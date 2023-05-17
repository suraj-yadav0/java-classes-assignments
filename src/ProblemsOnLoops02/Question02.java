package ProblemsOnLoops02;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value;");
            int x = sc.nextInt();
            if (x<0){
                ans = -1;
            }

            sum+=x;
        }
        if (ans>=0){
            System.out.println("The required sum is:"+sum);
        }else {
            System.out.println("Answer:"+ans);
        }

    }
}
