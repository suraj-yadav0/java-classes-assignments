package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Q1. Write a Java program to insert an element into given array list of size n at the first position.
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);
        //TO insert an element to the list
        System.out.println("Enter the value of X:");
        int x = sc.nextInt();
        list.add(0,x);
        System.out.println(list);

    }
}
