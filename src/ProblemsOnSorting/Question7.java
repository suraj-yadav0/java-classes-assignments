package ProblemsOnSorting;

import java.util.Scanner;

public class Question7 {

    static void sort (int arr[],int n) {
        if (n <= 1) {
            return;
        }
        sort(arr,n-1);
        int last = arr[n-1];
        int j = n-2;
        while (j>=0 && arr[j] > last) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter elements of the Array:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr,n);
        for (int i:
             arr) {
            System.out.print(i + " ");
        }
    }
}
