package ProblemsOn2dArrays03;

import java.util.Scanner;
//Q1 - Given a matrix arr[][] of integers, print the prefix sum matrix for it.
public class Question1 {
    static void print_Array(int[][] array,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void preFix(int[][] arr,int row,int col){
        int ans[][] = new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                ans[i][j]=arr[i][j];
                if (i==0&&j==0){
                    continue;
                }else if (i==0){
                    ans[i][j]+=ans[i][j-1];
                }else if (j==0){
                    ans[i][j]+=ans[i-1][j];
                }else {
                    ans[i][j]+=ans[i-1][j]+ans[i][j-1];
                }
            }
        }
        System.out.println("THe PRefix of this array:");
        print_Array(ans,row,col);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of 1st Array:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        System.out.println("Enter "+ n*m+  " elements in the array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter value at "+i+j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Array:");
        print_Array(arr,n,m);
        preFix(arr,n,m);
    }
}
