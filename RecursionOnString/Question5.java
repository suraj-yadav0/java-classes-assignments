package RecursionOnString;

import java.util.Scanner;

public class Question5 {
    static int ParseInt(String s, int res,int idx){
        if (idx >= s.length()) return res;
        res = res * 10 +  s.charAt(idx) - '0';// self work
        return ParseInt(s,res,idx+1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the String Int value:");
        Scanner sc =new Scanner(System.in);
        String n = sc.nextLine();
        // Iterative Approachres
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            result = result * 10  + n.charAt(i) - '0';
        }
        System.out.println(result);//Iterative One
        System.out.println(ParseInt(n,0,0));// Recursive One and My Approach

        System.out.println(rec(n,n.length()-1));
    }
    //Pw Approach
    static int rec(String s , int n){
        if ( n== 0) return s.charAt(0) - '0';
        return (rec(s,n-1)*10 +  s.charAt(n) - '0');
    }
}
