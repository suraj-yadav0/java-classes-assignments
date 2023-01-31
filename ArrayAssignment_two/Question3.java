package ArrayAssignment_two;

import java.util.Arrays;
import java.util.Scanner;

//Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to
//        find the Kth smallest element in the given array. It is given that all array elements are
//        distinct.
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements of 1st the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements in the Array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        Arrays.sort(arr);

        System.out.println("The Kth smallest element is "+arr[k-1]);
    }
}
