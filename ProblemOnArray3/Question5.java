package ProblemOnArray3;

import java.util.Scanner;

//Q5. Given an array sorted in increasing order, return an array of squares of each number sorted in increasing
//        order
public class Question5 {
    static void print_array(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static int[] square_sort(int[] arr){
        int n = arr.length;
        int i = 0;
        int k = arr.length-1;
        int j = n-1;
        int ans[] = new int[n];
        while (i<=j){
            if (arr[i]*arr[i]>arr[j]*arr[j]){
                ans[k--] = arr[i] * arr[i];
                i++;
            }else {
                ans[k--] = arr[j] * arr[j];
                j--;
            }
        }
       return ans;
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
        print_array(arr);
        int ans[]  = square_sort(arr);
        print_array(ans);
    }
}
