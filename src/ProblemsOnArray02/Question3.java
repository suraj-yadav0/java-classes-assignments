package ProblemsOnArray02;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Trains:");
        int n = sc.nextInt();
        System.out.println("Enter time of arrival" + n + " trains:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter time of departure" + n + " trains:");
        int dep[] = new int[n];
        for (int i = 0; i < n; i++) {
            dep[i] = sc.nextInt();
        }
        int platform_needed = 1;
        int result  = 1;

        for (int i = 1; i < n; i++) {
            //min platform needed

            platform_needed = 1;
            for (int j = 0; j < n; j++) {
                if(i!=j){
                    //check for overlap
                    if (arr[i]>=arr[j]&&dep[j]>=arr[i]){
                        platform_needed++;
                    }
                    //update result
                    result = Math.max(result,platform_needed);
                }


            }


        }
        System.out.println("The minimum Number of Trains Required:" + result);
    }
}
