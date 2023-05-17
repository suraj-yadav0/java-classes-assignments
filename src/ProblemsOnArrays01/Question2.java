package ProblemsOnArrays01;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in thr array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the values of X:");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println("The value is present "+count+" times in the given array.");
    }
}
