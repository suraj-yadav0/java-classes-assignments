package TwoDimensionalArray;

import java.util.Scanner;
//Q5. Check if an element x exists in the given sorted matrix or not. Each row and column
//        is sorted in itself. If it does not exist, return -1, else return its row and column index.
public class Question5 {
// i did this qiestion similar to question , maybe i was supposed to improve the time complexity
    static void print_matrix(int[][] arr,int r1,int c1){
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of 1st Array:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] arr = new int[r1][c1];
        System.out.println("Enter "+ r1*c1+  " elements in the array");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println("Enter value at "+i+j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                if (x==arr[i][j]){
                    System.out.println("Row = "+i);
                    System.out.println("Column = "+j);
                    ans = 1;
                    break;
                }else {
                     ans = -1;
                }
            }
        }
        if (0 > ans){
            System.out.println(ans);
        }
    }


}
