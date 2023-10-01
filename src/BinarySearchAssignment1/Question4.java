package BinarySearchAssignment1;

public class Question4 {
    public static void main(String[] args) {
        int [] arr = { 1 ,3 ,3 ,4 ,5 ,5 ,5 ,11 ,15, 15};
        int target = 5;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int arr[] , int target) {
        int count  = 1;
        int st = 0, end = arr.length -1;
        while (st <= end) {
            int mid = (st + end)/2;
            if (arr[mid] == target) {
                while (arr[mid] != arr.length &&arr[mid + count] == target ) {
                    count++;
                }
                int k = 1;
                while (arr[mid - k ] == target) {
                    count++;
                    k++;
                }
                break;
            }else if (arr[mid] < target) {
                st = mid + 1;
            }else {
                end = mid-1;
            }
        }
        return count;
    }
}
