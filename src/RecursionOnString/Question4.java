package RecursionOnString;

import java.util.Scanner;

public class Question4 {
    static int CountLowercase(String s,int idx, int count){
        if (idx >=s.length()){//base condition
            return count;
        }
        if (Character.isLowerCase(s.charAt(idx))){ // self Work
            count++;
        }
        int smallAns = CountLowercase(s,idx+1,count); // Recursive Work
        return smallAns;

    }
    public static void main(String[] args) {
        System.out.println("Enter the value of String:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Iterative approach
//        int count  = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (Character.isLowerCase(s.charAt(i))){
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println(CountLowercase(s,0,0));//My approach
        System.out.println(totalLowerCase(s,0));
    }
    // Phsics Wallah Aproach
    static int totalLowerCase(String s, int idx){
        if (idx == s.length()-1) {
            if (s.charAt(idx) >= 97 && s.charAt(idx) <= 122) {
                return 1;
            } else {
                return 0;
            }
        }
            if (s.charAt(idx) >= 97 && s.charAt(idx) <= 122){
                return totalLowerCase(s,idx+1) +1;
            }
            else {
                return totalLowerCase(s,idx+1);
            }
        }
    }

