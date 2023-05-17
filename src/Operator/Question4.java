package Operator;
//Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
//i) both the conditions 'a < 50' and 'a < b' are true.
//        ii) at least one of the conditions 'a < 50' or 'a < b' is true.
public class Question4 {
    public static void main(String[] args) {
        int a  = 55;
        int b = 70;
        //checking first condition and printing result
        boolean ans = false;
        if (a<50 && a<b){
            ans = true;
        }
        if (a<50 || a< b){
            ans  = true;
        }
        System.out.println(ans);
    }
}
