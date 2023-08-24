package ProblemsOnSorting;

import java.util.Scanner;

// Given an integer array and an integer k where k<size of array, We need to return the kth smallest element of the array.
public class question3 {

    static void sort (int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j] < arr[j-1]){
                int temp =arr[j];
                arr[j] = arr[j-1];
                arr[j-1]  = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int i :
           arr  ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Enter the value of k:");

        int k = sc.nextInt();
        System.out.println( k + " position smallest element is: " + arr[k-1]);
    }
}
