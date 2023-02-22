package ProblemOnArray3;

import java.util.Scanner;
//Q4. Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two
//        numbers such that they add up to a specific target number.
//        Return the indices of the two numbers added by one. Return -1 if pair does not exist.
public class Question4 {
    static void print_array(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void sum_up(int[] arr,int x){
      int n = arr.length;
      int count = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] + arr[i+1] == x){
                System.out.println(i+" "+(i+1));
                count++;
                return;
            }else {
                count = -1;
            }
        }
        if (count<0){
            System.out.println(count);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elememnts of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter the elements of the array:");
        for (int i = 1; i < n+1; i++) {
            arr[i] = sc.nextInt();
        }
        print_array(arr);
        System.out.println("Enter the value of the target");
        int x  = sc.nextInt();
        sum_up(arr,x);

    }
}
