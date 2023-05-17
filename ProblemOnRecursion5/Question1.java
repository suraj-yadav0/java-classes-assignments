package ProblemOnRecursion5;

import java.util.Scanner;
//Q1 - Count all the possible paths on an m x n grid from top left (grid[0][0]) to bottom right
// (grid[m-1][n-1]) having constraints that from each cell you can either move only to right or down.
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of M:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        System.out.println("Required result is:"+min_path(m,n));


    }
    static int min_path(int m,int n){
        if (m==1 || n == 1){
            return 1;
        }

        return min_path(m-1,n) + min_path(m,n-1);
    }
}
