package ProblemsOnArrays4;

import java.util.Scanner;
//Q4. Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest (Medium)
//        amongst all the possible ones).
//        A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums
//        [middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
//        If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1,
//        the right side sum is considered to be 0.
//        Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
public class Question4 {
    static void print_array(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefix_sum(int[] arr,int k,int j){
        int n = j;
        int [] ans = new int[n];

        for ( int i = k; i <n ; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in thr array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int middleIndex;
        for ( middleIndex = 0; middleIndex < n; middleIndex++) {
            if (prefix_sum(arr,1,middleIndex)==prefix_sum(arr,middleIndex+1, arr.length)){
                System.out.println("Required Middle Index = "+middleIndex);
                break;
            }
            else {
                System.out.println("Middle Index = -1");
            }
        }
    }
}
