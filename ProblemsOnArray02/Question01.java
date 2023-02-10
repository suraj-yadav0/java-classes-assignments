package ProblemsOnArray02;
//Q1. Given an array arr[] of size n, find the first repeating element. The element should occur more than
//        once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1.


import java.util.Scanner;


public class Question01 {
    static int repeat(int[] arr) {
        int n  = arr.length;
        int x = -1;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]==arr[j]){
                    x = i;
                    break;
                }
            }

        }
        return x;
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
//        System.out.println("The required result is:");
//        System.out.println(repeat(arr));
//        Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
//        every positive number is followed by a negative and vice-versa maintaining the order of appearance.
//                The number of positive and negative numbers need not be equal. Begin with a negative number.
//                If there are more positive numbers, they appear at the end of the array. If there are more negative
//        numbers, they too appear at the end of the array.



    }


}
