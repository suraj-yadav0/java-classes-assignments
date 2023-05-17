package ProblemOnRecursion5;

import java.util.Scanner;

//Q2 - Given an array of integers, print a sum triangle from it such that the first level(the bottom
//        level in triangular fashion) has all array elements. From then, at each level, the number of
//        elements is one less than the previous level and elements at the level is the sum of
//        consecutive two elements in the previous level.
public class Question2 {
    static void rec_print(int [] arr,int n,int start){


        if (start>=n){
            return;
        }

        for (int i = 0; i < n-1; i++) {
            int k = i;
          arr[i] = arr[i] + arr[k+1];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rec_print(arr,n-1,start);

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr [] = new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rec_print(arr,n,0);
       // print(arr,n);

    }
//    static void print(int[] arr,int n){
//        for (int i = 0; i <= n; i++) {
//            System.out.print(arr[i] + arr[i+1]);
//        }
//    }
}
