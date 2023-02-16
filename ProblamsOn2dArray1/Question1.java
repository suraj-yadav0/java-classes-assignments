package ProblamsOn2dArray1;

import java.util.Scanner;

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
    static void mult_matrix(int[][] arr,int row1,int col1,int[][] arr2,int row2,int col2){
        int ans[][] = new int[row1][col2];
        if (col1!=row2){
            System.out.println("Invalid input!");
            return ;
        }else {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        ans[i][j] += (arr[i][k]*arr2[k][j]);
                    }
                }
            }
        }
        System.out.println("The Product of two matrixes is:");
        print_Array(ans,row1,col2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row and columens of Two dimensional Array:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the element at "+i+j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Row and columens of Two dimensional Array:");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int arr2[][] = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Enter the element at "+i+j);
                arr2[i][j] = sc.nextInt();
            }
        }
        print_Array(arr,row,col);
        print_Array(arr2,row2,col2);
        mult_matrix(arr,row,col,arr2,row2,col2);
    }
}
