package BinarySearchAssignment1;

public class Question2 {

//    You are given a sorted array containing N integers and a number target. Implement the upper bound
//    function that returns the index of an element just greater than the target element. If there exists no such
//    element then return -1.
//
//    Note:  The target may not be present in the array.
    public static void main(String[] args) {
        int [] arr = {1, 3, 3, 4, 5, 8, 9, 11, 15, 15};
        int target = 3;

        int ans = search2(arr,target);
        System.out.println(ans);

    }

    static int search2(int [] arr, int target) {
        int st = 0;
        int end = arr.length-1;
        while (st <= end) {
            int mid = (st + end)/2;
            if (arr[mid] == target){
                                for (int i = mid; i < arr.length - 1; i++) {
                    if (arr[i] == target && arr[i +1] != target) {
                        return i+1;
                    }
                }
            }else if (arr[mid] < target){
                st = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }

}
