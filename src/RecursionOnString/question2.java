package RecursionOnString;

import java.util.Scanner;

public class question2 {
    static String FirstUpperCase(String s, int idx){
        if (idx == s.length()) return "";
        if (Character.isUpperCase(s.charAt(idx))) return s.substring(idx);
        return FirstUpperCase(s,idx+1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the required string:");
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
//        int x = -1 ;  ITERATIVE APPROACH
//        for (int i = 0; i < S.length(); i++) {
//            if (Character.isUpperCase(S.charAt(i))){
//                 x = i;
//            }
//        }
//        System.out.println(S.substring(x,S.length()));
        System.out.println(FirstUpperCase(S,0));
    }
}
