package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Q5. Given an array of integers, print an arraylist containing only all positive integers present in
//        the array.If no positive integers found, print “NA”.
public class Question5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,-4, 0, 8, -3, -2);
        System.out.println(list);
        System.out.println("Required Result:");
        int count  = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>=0){
                System.out.println(list.get(i));
                count++;

            }
        }
        if (count<=0){
            System.out.println("NA");
        }
    }
}
