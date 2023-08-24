package ProblemsOnSorting;

import java.util.Scanner;


//- Given an array with N distinct elements, convert the given array to a form where all
//        elements are in the range from 0 to N-1. The order of elements is the same, i.e., 0
//        is placed in the place of the smallest element,
//        1 is placed for the second smallest element, … N-1 is placed for the largest element.
public class Question6 {

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                //swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

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

        int temp[] = new int[n];


        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        sort(temp);
//
//        for (int i:
//                temp ) {
//            System.out.print(i +  " ");
//        }

        //getting the indexes
        int pos = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (temp[i] == arr[j]) {
                    temp[pos++] = j;
                    break;
                }
            }
        }


        for (int i :
                temp) {
            System.out.print(i + " ");
        }
    }


}
