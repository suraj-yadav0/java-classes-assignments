package ProblemOnArray3;

import java.util.Scanner;

//Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum.
public class Question2 {
    static void print_array(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of elememnts of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //i could not understand this question even after seeing the solution
        int odd = 0,even= 0, sum = 0;
        for (int num : arr) {
            if (num % 2 == 1){
                int temp = odd;//swap odd and even
                even = temp;
                odd++;
            }else {
                even++;
            }
            sum += odd;
        }
        System.out.println(sum);


    }
}
