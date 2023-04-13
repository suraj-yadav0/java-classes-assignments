package RECURSION.PRoblemsonREcursion4;

import java.util.Scanner;
//armstrong number using recursiion
public class Question1 {
    static int isArmstrong(int num){
      if (num<10)
          return num*num*num;
      return (num%10)*(num%10)*(num%10) + isArmstrong(num/10);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = isArmstrong(num);
        if (ans==num){
            System.out.println(num + " is a Armstrong Number.");
        }else {
            System.out.println(num + " ia not a armstrong Number");
        }


    }
}
