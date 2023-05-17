package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Q2. Write a Java program to remove the third element from given arraylist of size n.
public class Question2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Collections.addAll(l1,1,2,3,4,5,6);
        System.out.println(l1);
        // to remove the third element
        l1.remove(2);
        System.out.println(l1);

    }
}
