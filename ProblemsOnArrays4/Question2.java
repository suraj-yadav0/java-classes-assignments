package ProblemsOnArrays4;

import java.util.Arrays;
import java.util.Scanner;

//Q2. Given an integer array arr consisting of 0’s and 1’s only, return the max length of sequence
//        which contains equal numbers of 0 and 1. If no such subarray exists, print -1.
public class Question2 {
    //print function
    static void print_array(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //this method counts the variables for us
    static void max_length(int[] arr){
        int j = arr.length-1;
        int count = 0;
        int i =0;
        //sort the array
        Arrays.sort(arr);
        while (i<=j){
            if (arr[i]!=arr[j]){
                count =count+2;//count +2 because we are counting pairs
            }
            i++;
            j--;
        }
        if (count>0){
            System.out.println("The value of count is:"+count);
        }else {
            System.out.println("-1");
        }



    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" in the array in thei:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print_array(arr);
        //call the function
        max_length(arr);

    }
}
