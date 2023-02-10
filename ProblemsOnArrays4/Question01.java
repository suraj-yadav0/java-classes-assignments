package ProblemsOnArrays4;
//I have seen this code from GFg
import java.util.Scanner;
//Q1. Given an array of integers of length n, and an integer m, (m < n), divide the array into
//        2 subarrays such that 1 part contains m elements and the other part contains the rest of
//        the elements. This division has to be done such that the difference between the sum of
//        elements of both the sub arrays is the maximum. You have to print the maximum difference
//        in the sum possible.
public class Question01 {
    public static int ans = 10000000;
    //print function
    static void print_array(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void solve(int[] arr,int n,int m,int index,int sum,int max_sum){



        //M=1 is the base case
        if (m==1){
            max_sum = Math.max(max_sum,sum);
            sum = 0;
            for (int i = index; i < n; i++) {
                sum += arr[i];
            }
            //we update maxsum
            max_sum  = Math.max(max_sum,sum);
            //the answer is stored in ans
            ans = Math.min(ans,max_sum);
            return;
        }
        sum = 0;
        //using for loop to divide the sub array into  m- subaray
        for (int i = index; i < n; i++) {
            sum+=arr[i];
            //for each sub array we calculate sum ans update maxsum
            max_sum = Math.max(max_sum,sum);
            //calling function again
            solve(arr,n,m-1,i+1,sum,max_sum);
        }

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" in the array in thei:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print_array(arr);
        System.out.println("Enter the value of M:");
        int m = sc.nextInt();
        solve(arr,n,m,0,0,0);
        System.out.println("The required ans:");
        System.out.println(ans + " \n");

    }
}
