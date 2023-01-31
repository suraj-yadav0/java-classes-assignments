package ArrayAssignment_two.Question2;

import java.util.Scanner;
//Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
//        union between these two arrays and print the number of elements of the union set.
//        Union of the two arrays can be defined as the set containing distinct elements from both
//        the arrays. If there are repetitions, then only one occurrence of element should be printed
//        in the union.
public class Question_2 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements of 1st the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements in the Array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of elements of 2nd the array:");

        int n2 = sc.nextInt();
        System.out.println("Enter another array:");
        int arr1[] = new int[n];
        for (int i = 0; i < n2; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==arr1[i]){
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]!=arr1[i]){
                count++;
            }
        }

        System.out.println("Number of union elements between the elements is:"+count);


    }
}
