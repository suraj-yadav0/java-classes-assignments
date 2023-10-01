package BinarySearchAssignment1;

public class Question5 {
    public static void main(String[] args) {
        int arr[] = {6 ,7 ,11 ,13 ,15,16 ,1 ,2 ,3 ,4 ,5};
        int ans = search(arr);
        System.out.println(ans);

    }

    static int search(int [] arr){
        int mx  = -1;
        int st = 0, end  = arr.length -1;
        while (st<= end) {
            int mid = (st  + end)/2;
            if (arr[mid] > arr[mid + 1]) {
                mx = mid;
                break;
            } else if (arr[mid]< arr[end]) {
                st = mid +1;
            }else {
                end = mid -1;
            }
        }
        return mx;
    }
}
