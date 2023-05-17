package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Collections.addAll(l1,3 ,5 ,1 ,-4 ,9 ,0 ,-2);
        System.out.println(l1);
        //For sorting ArrayList
        Collections.sort(l1);
        System.out.println(l1);
    }
}
