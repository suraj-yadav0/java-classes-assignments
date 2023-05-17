package ProblemOnArray3;

import java.util.Arrays;
import java.util.Scanner;
//Q1. Given an integer m, n, and n integers, return true if the number of unique integers among the n integers is
//        greater than or equal to m, else return false.(Integers appearing multiple times are all considered as 1 unique
//        integer)
public class Question1 {
    static void print_array(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elememnts of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        print_array(arr);
        System.out.println("Enter the value of M:");
        int m = sc.nextInt();
        int count = 0;
        int j = 1;
        for (int i = 0; i < n-1; i++) {
            if (arr[i]!=arr[i+1]){
                count++;
            }
        }
        if (count>=m){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
