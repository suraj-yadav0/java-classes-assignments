package ProblemsOnArrays01;

import java.util.Scanner;

//Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a
//        pair in the array whose absolute difference is exactly x.(n>1)
public class Question1 {
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
        boolean ans = false;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[j]-arr[i]==x){
                 ans = true;
                    break;
                }
            }

        }
        System.out.println(ans);
//        if (ans == true){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }

    }
}
