package ProblamsOn2dArray1;

import java.util.Scanner;

public class QuestionFive {
    static void print_Array(int[][] array,int row,int col){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void over_Lpping(int[][] arr,int n,int m){
        int count =0;
        int i = 0;
        while (i<n-1){
            if (arr[i++][1]>=arr[i][1]){
                count++;
            }
        }
        System.out.println("The number of overlapping variable:");
        System.out.println(count);
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
        over_Lpping(arr,n,m);

    }
}
