package ProblemsOn2dArrays03;

import java.util.Scanner;
//Q2. A square matrix is said to be an perfect Matrix if both of the following conditions hold:
//        a) All the elements in the diagonals of the matrix are non-zero integers.
//        b) All other elements except the diagonal elements are 0.
//        Given a 2D integer array grid of size n*n representing a square matrix, return true if grid is a perfect matrix. Otherwise, return false.
public class Question2 {
    static void print_Array(int[][] array,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void check(int [][] arr,int row ,int col){
//
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j || i + j == row - 1) {
                    if (arr[i][j] == 0) {
                        System.out.println("False");
                        return;
                    }

                } else {
                    if (arr[i][j] != 0) {
                        System.out.println("False");
                        return;
                    }
                }
            }
        }
            System.out.println("True");
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of 1st Array:");
        int n = sc.nextInt();
        
        int [][] arr = new int[n][n];
        System.out.println("Enter "+ n*n+  " elements in the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter value at "+i+j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array:");
        print_Array(arr,n,n);
        check(arr,n,n);
    }
}
