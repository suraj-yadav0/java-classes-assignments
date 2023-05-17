package TwoDimensionalArray;

import java.util.Scanner;
//Q4. Given a 2D array for n rows and m columns, reverse each row.
public class Question4 {
    static void print_array(int[][] arr,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void swap(int arr[]){
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
    static void reverse_aray(int[][] arr,int row,int col){
        for (int i = 0; i < row; i++) {
            swap(arr[i]);
        }
        print_array(arr,row,col);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the Array:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the values of the Two Dimensional Array:");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the values at "+i+j);
                arr[i][j] = sc.nextInt();
            }
        }
        print_array(arr,row,col);
       // reverse_aray(arr,row,col);
        for (int i = 0; i < row; i++) {
            swap(arr[i]);
        }
        print_array(arr,row,col);



    }
}
