package TwoDimensionalArray;
//Question in process
import java.util.Arrays;
import java.util.Scanner;
//Q2. Convert a 1D sorted array of length n*m to a 2D array of n rows and m columns. The matrix
//        should also be sorted.
public class Question2 {
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
        System.out.println("Enter the number of elements in thr array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of M:");
        int m = sc.nextInt();
        System.out.println("Enter the value of N:");
        int X = sc.nextInt();
        int ans[][] = new int[m][X];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < X; j++) {
                ans[i][j] = arr[k++];
            }
        }
        Arrays.sort(ans);
        print_matrix(ans,m,X);
    }
}
