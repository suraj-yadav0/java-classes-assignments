package ProblemsOnSorting;

import java.util.Scanner;

public class question5 {

    static void sort (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
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

        sort(arr);

        for (int i:
            arr ) {
            System.out.print(i + " ");
        }
        System.out.println();
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            if ( i%2 == 0) {
                x = x * 10 + arr[i];
                System.out.println(x);
            }else {

                y  = y * 10 + arr[i];
            }
        }

        System.out.println("Required Sum:"+ (x+y));
    }
}
