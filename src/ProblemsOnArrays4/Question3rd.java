package ProblemsOnArrays4;

import java.util.Scanner;

//Q3. There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
//        The biker starts his trip on point 0 with altitude equal 0.
//        You are given an integer array gain of length n where gain[i] is the net gain in altitude between
//        points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
public class Question3rd {
    static void print_array(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void prefix_sum(int[] arr){
        int n = arr.length;
        for (int i = 1; i <n ; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        print_array(arr);
    }
    static void greatest(int[] arr){
        int n = arr.length;
        int ans = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println("The Required Ans is:");
        System.out.println(ans);
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
        prefix_sum(arr);
        greatest(arr);

    }
}
