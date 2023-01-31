package ArrayAssignment_two;

import java.util.Scanner;

public class ArrayAssignment2 {

public static void main(String[] args) {
        //        Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
//        all negative elements at the end of array without changing the order of positive elements
//        and negative elements
        System.out.println("Enter number of elements in the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements in the Array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
        }
        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
        }
//        System.out.println();
//
//        int ans[] = new int[n];
//        int idx = 0;
//        for (int i = 0; i < arr.length; i++) {
//                if (arr[i]>= 0){
//                        ans[idx] = arr[i];
//                        idx++;
//                }
//
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//                if (arr[i]<0){
//                        ans[idx] = arr[i];
//                        idx++;
//                }
//
//        }
//        System.out.println("The array after the change:");
//        for (int i = 0; i < ans.length; i++) {
//                System.out.print(ans[i]+" ");
//        }



//        Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a
//        continuous sub-array which adds to a given number S.
//                In case of multiple subarrays, return the subarray which comes first on moving from left
//        to right.
//        You need to print the start and end index of answer subarray.
        System.out.println("Please enter the vlaue of s:");
        int s = sc.nextInt();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j<n){
                sum+=arr[j];
                if (sum>s){
                        while (sum>s && i<j){
                                sum-=arr[i];
                                i++;

                        }
                }

                if (sum==s){
                        System.out.print(i + " " + j);
                        break;
                }
                j++;
        }


   }


        }
