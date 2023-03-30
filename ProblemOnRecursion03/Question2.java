package ProblemOnRecursion03;
import java.util.Scanner;
//Q2 - Find m-th summation of first n natural numbers where m-th summation of first n natural
//        numbers is defined as following:
//        If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
//        Else :SUM(n, 1) = Sum of first n natural numbers.
public class Question2 {//copied pasted the code cuz did not understood even the question
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number n and m: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(rec(n, m));
    }
    public static int rec(int n, int m) {
        if (m == 1)
            return sumofn(n);

        int sum = rec(n, m - 1);
        return sumofn(sum);
    }
    public static int sumofn(int n){
        int ans = 0;
        if(n == 1){
            ans++;
            return ans;
        }
        ans += n + sumofn(n-1);
        return ans;
    }
}
