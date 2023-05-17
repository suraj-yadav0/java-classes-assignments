package ProblamsOn2dArray1;

import java.util.Scanner;

public class Question4 {
    static void print_Array(int[][] array,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void Diagonal_traversel(int[][] arr, int row,int col){
        for (int g = 0; g < arr.length; g++) {
            for (int i = 0,j=g;j< arr.length; i++,j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
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
      //  print_Array(arr,row,col);
        Diagonal_traversel(arr,row,col);

    }
}
