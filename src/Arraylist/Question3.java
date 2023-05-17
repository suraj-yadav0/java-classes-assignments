package Arraylist;


import java.util.ArrayList;
import java.util.Collections;

//Q3. Write a Java program to swap two elements in an array list of size n.
public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        Collections.addAll(l,1,2,3,4,5,7);
        System.out.println(l);
        //for swaping two numbers
        int swap = l.get(0);
        l.set(0,l.get(1));
        l.set(1,swap);
        System.out.println(l);
    }
}

