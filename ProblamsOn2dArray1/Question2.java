package ProblamsOn2dArray1;

import java.util.Scanner;

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
    static void swap(int[] arr){
        int j = arr.length-1;
        int i = 0;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate_anticlockwise(int[][] arr,int row ,int col){
        for (int i = 0; i < row; i++) {
            swap(arr[i]);
        }
        for (int i = 0; i < row; i++) {
            for (int j = i; j <col ; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print_Array(arr,row,col);
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
        print_Array(arr,row,col);
        rotate_anticlockwise(arr,row,col);

    }
}
