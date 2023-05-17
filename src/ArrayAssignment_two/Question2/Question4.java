package ArrayAssignment_two.Question2;

import java.util.Scanner;

//Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a
//        continuous sub-array which adds to a given number S.
//        In case of multiple subarrays, return the subarray which comes first on moving from left
//        to right.
//        You need to print the start and end index of answer subarray.
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements of 1st the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements in the Array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of S:");
        int s = sc.nextInt();

        int sum = 0;
       int j = 0;
       int i =0;
        while (i<n) {
                sum += arr[i];
                if(sum>s){
                    while (sum>s && j<i){
                        sum-=arr[j];
                        j++;
                    }

                }
                if (sum==s){
                    System.out.println("The required array is:"+ j + " " +  i);
                    break;
                }
                i++;
        }
    }
}
