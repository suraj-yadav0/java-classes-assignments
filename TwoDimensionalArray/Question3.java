package TwoDimensionalArray;

import java.util.Scanner;
//Q3. Given a 2D array of n rows and m columns, return the sum of elements along the range of row
//        and column specified.
public class Question3 {
    static void print_array(int[][] arr,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =   new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter eleement at "+i+j);
                arr[i][j] = sc.nextInt();
            }
        }

        print_array(arr,m,n);//printing the array for referance

        System.out.println("Enter the Row value of the range:");
        //taking input of the rows of the range
        int row1 = sc.nextInt();
        int row2 = sc.nextInt();
        System.out.println("Enter the Column values of the range:");
        //taking input of the cols of the range
        int col1 = sc.nextInt();
        int col2 = sc.nextInt();
        int sum = 0;//declared the sum variable
        while (row1<=row2){//this while loop for row section iteration
            while (col1<=col2){//this while loop for col iteration
                sum+=arr[row1][col1];
                col1++;
            }
            row1++;
        }
        System.out.println("Sum="+sum);
    }
}
