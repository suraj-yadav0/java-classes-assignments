package RecursionOnString;

import java.util.Scanner;

public class Question3 {
    static  int CountConsonents(String s, int idx,int count){

        if (idx >= s.length()) return count;
        if (s.charAt(idx) != 'a' && s.charAt(idx) != 'e' && s.charAt(idx) != 'i' && s.charAt(idx) != 'o' && s.charAt(idx) != 'u'&& s.charAt(idx) != 'A' && s.charAt(idx) != 'E' && s.charAt(idx) != 'I' && s.charAt(idx) != 'O' && s.charAt(idx) != 'U') {
            count++;
        }
        int i = CountConsonents(s, idx + 1, count);
        return i;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        int count = 0;  // ITERATIVE APPROACH
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'&& s.charAt(i) != 'A' && s.charAt(i) != 'E' && s.charAt(i) != 'I' && s.charAt(i) != 'O' && s.charAt(i) != 'U'){
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println(CountConsonents(s,0,0));
    }
}
