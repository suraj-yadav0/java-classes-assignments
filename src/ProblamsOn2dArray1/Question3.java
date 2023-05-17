package ProblamsOn2dArray1;

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
    static void toeplitz(int [][] arr,int row,int col){
        int n = arr.length;
        boolean ans = false;
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < col-1; j++) {
                if (arr[i][j] == arr[i+1][j+1]){
                    ans = true;
                }
            }
        }
        System.out.println(ans);
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
        toeplitz(arr,row,col);
    }
}
