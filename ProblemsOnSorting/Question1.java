package ProblemsOnSorting;

//Q1 - Given an array of strings arr[]. Sort given strings using Bubble Sort and display the sorted
//       array.
public class Question1 {

    static void sort (String arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j <arr.length -i - 1 ; j++) {
               if (arr[j].compareTo(arr[j-1]) < 0){
                   String temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }
            }

        }
    }
    public static void main(String[] args) {

        String arr [] = {"Suraj","Ankit" , "Naina" , "Shiven"};

        sort(arr);
        for (String i:
            arr ) {
            System.out.print(i + " ");
        }
    }
}
