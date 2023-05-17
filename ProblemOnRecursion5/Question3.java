package ProblemOnRecursion5;

import java.util.Scanner;

public class Question3 {
    static void combinationUtil(int arr[], int n, int r, int index,
                                int data[], int i)
    {
        if (index == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+" ");
            System.out.println();
            return;
        }


        if (i >= n)
            return;


        data[index] = arr[i];
        combinationUtil(arr, n, r, index+1, data, i+1);

        combinationUtil(arr, n, r, index, data, i+1);
    }

    public static void main (String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elemnts of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of R:");
        int r = sc.nextInt();
        int data []=new int[r];
        combinationUtil(arr, n, r,0,data,0);
    }
}
