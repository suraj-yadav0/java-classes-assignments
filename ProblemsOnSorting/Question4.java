package ProblemsOnSorting;

import java.util.Scanner;

//Q4 - Given an array of n elements, the task is to find the elements that are greater than half of elements in an array.
// In case of odd elements, we need to print elements larger than floor(n/2) elements where n is the total number of elements in the array
public class Question4 {

    static void sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j] < arr[j-1]) {
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
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = n/2;
        if (n%2 == 0){
            sort(arr);
            for (int i = arr.length-1; i >= x; i++) {
                System.out.println(arr[i]);
            }
        }else {

            sort(arr);
            for (int i = arr.length-1; i >= x; i--) {
                System.out.println(arr[i]);
            }
        }



    }
}
