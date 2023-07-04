package RecursionOnString;

import java.util.Scanner;

public class Question1 {
    static String merge(String s1, String s2){
        String ans = "";
        if (s1.length() == 0){
            ans += s2;
            return ans;
        }
        if (s2.length() == 0){
            ans += s1;
            return ans;
        }
        ans += s1.substring(0,1);
        ans += s2.substring(0,1);
        ans += merge(s1.substring(1,s1.length()),s2.substring(1,s2.length()));
        return  ans;

    }
    public static void main(String[] args) {
        System.out.println("Enter Two Strings:");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        //  ITERATIVE APPROACH
//        String ans = "";
//
//        for (int i = 0; i < s1.length() || i<  s2.length(); i++) {
//            if (i < s1.length()){
//                ans += s1.charAt(i);
//            }
//            if (i < s2.length()){
//                ans += s2.charAt(i);
//            }
//
//        }
//        System.out.println(ans);
        // RECURSIVE APROACH
        System.out.println(merge(s1,s2));

    }
}
