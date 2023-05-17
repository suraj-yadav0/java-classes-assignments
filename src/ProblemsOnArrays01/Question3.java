package ProblemsOnArrays01;

import java.util.Arrays;
import java.util.Scanner;
//Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//        missing number from the first N integers. There are no duplicates in the list.
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in thr array:");
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        System.out.println("Enter "+n+" elements in the array:");
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int j =0;
        for (int i = 1; i <n+1 ; i++) {
            if(arr[j++]!=i){
                System.out.println(i);
                break;
            }
        }
    }
}
