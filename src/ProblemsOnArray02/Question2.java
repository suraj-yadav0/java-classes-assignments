package ProblemsOnArray02;
//Q2. Given an array of positive and negative numbers, arrange them in an alternate fashion such that
//        every positive number is followed by a negative and vice-versa maintaining the order of appearance.
//        The number of positive and negative numbers need not be equal. Begin with a negative number.
//        If there are more positive numbers, they appear at the end of the array. If there are more negative
//        numbers, they too appear at the end of the array.
import java.util.Scanner;
// my code only worked for equal number of positive and negaitbe number so i checked the solution.
public class Question2 {
    //print function
    static void print_array(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //method to alternate arrange the order
//    static void alternate_arrange(int [] arr){
//        int n = arr.length;
//        int i = 0;
//        int j = 1;
//        int ans[] = new int[n];
//        for (int k = 0; k < n; k++) {
//            if (arr[k]<0){
//                ans[i] = arr[k];
//                i = i+2;
//            }else {
//                ans[j] = arr[k];
//                j = j+2;
//            }
//        }
//        print_array(ans);
//    }
    static void rightrotate(int arr[],int n,int outofplace,int cur){
        int tmp = arr[cur];
        for (int i = cur; i > outofplace ; i--) {
            arr[i] = arr[i-1];
            arr[outofplace]  = tmp;
        }
    }
    static void rearange(int arr[],int n){
        int outplace = -1;
        for (int i = 0; i < n; i++) {
            if (outplace>=0){
                if (((arr[i]>=0)&&(arr[outplace]<0))||((arr[i] < 0)&& (arr[outplace]>=0))){
                    rightrotate(arr,n,outplace,i);
                    //the new out of place entry is now 2 , step ahead
                    if (i-outplace >= 2){
                        outplace = outplace +2;
                    }else {
                        outplace = -1;
                    }
                }
                //if no entry has been flagged out of place
                if (outplace == -1){
                    //check if current entry is out of place
                    if (((arr[i] >=0) && ((i & 0x01)==0)) || ((arr[i] <0)&&(i & 0x01)==1)){
                        outplace = i;
                    }
                }
            }
        }
        print_array(arr);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number of elements in the array:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" in the array in the:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        print_array(arr);
        System.out.println("Rearranged array");
        rearange(arr,n);
//        alternate_arrange(arr);

    }
}
