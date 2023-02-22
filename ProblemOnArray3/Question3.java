package ProblemOnArray3;

import java.util.Scanner;

//Q3. You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
//        of the ith line are (i, 0) and (i, height[i]).
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//        Return the maximum amount of water a container can store.
//        Input:
//        n = 9
//        height = [1,8,6,2,5,4,8,3,7]
//        Expected Output:
//        49
public class Question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            height[i] = scn.nextInt();
        }
        int i = 0;
        int j = n-1;
        int ans = 0;
        while(i < j){
            int width = j-i;
            int ht = Math.min(height[i], height[j]);
            int area = ht * width;
            ans = Math.max(ans, area);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(ans);
    }

}
