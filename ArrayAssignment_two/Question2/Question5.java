package ArrayAssignment_two.Question2;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements in the Array:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter " + n + " Elements in the 2nd Array:");
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        boolean a = true;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=arr2[i]){
                a = false;
                break;
            }

        }
        System.out.println(a);

    }

}
