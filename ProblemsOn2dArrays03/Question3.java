package ProblemsOn2dArrays03;
//Q3. Write a user defined function upper() which takes an integer square matrix as an input

import java.util.Scanner;

public class Question3 {
    static void print_Array(int[][] array,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Upper(int[][] array,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = i; j <col ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
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
        Upper(arr,n,n);

    }
}
