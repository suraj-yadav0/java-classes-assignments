package BinarySearchAssignment1;

public class Question1 {

//    1. Given an sorted array of integers and a key element, you need to print the index where the element is
//    present. If the target element is not present in the array, print -1.
    public static void main(String[] args) {
        int arr[] = { 1,3, 3, 4, 5, 8, 9, 11, 15, 15};
        int target = 5;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    
    static int search(int arr[], int key) {
        
        int st = 0;
        int end= arr.length - 1;
        while (st <= end) {
            
            int mid = (st + end)/2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] == arr[st] && arr[mid] == arr[end]) {
                st++;
                end --;
            } else if (arr[mid] <= arr[end]) {//right side iteration
                if (key <= arr[end] && arr[mid] < key) {
                    st = mid +1;
                }else {
                    end = mid -1;
                }
            }else { //left side iteration
                if (key >= arr[st] && arr[mid] > key) {
                    end = mid -1;
                }else {
                    st = mid +1 ;
                }
            }
        }
        return -1;
    }
}
