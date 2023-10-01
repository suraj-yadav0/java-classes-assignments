package BinarySearchAssignment1;

public class Question3 {

//    You are given a sorted array containing N integers and a number target. Implement the lower bound
//    function that returns the index of the first element that is greater than or equal to the ‘target’ value. If there
//    exists no such element then return -1.
//
//    Note:  The target may not be present in the array.
    public static void main(String[] args) {
        int [] arr = {1, 3, 3, 4, 5, 8, 9, 11, 15, 15};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);

    }

    static int search(int [] arr, int target) {
        int st = 0;
        int end= arr.length -1;
        while (st <= end) {
            int mid = (st + end)/2;
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] < target) {
                st = mid +1;

            }else {
                end = mid -1;
            }
        }
        return  -1;
    }
}
