package Assignment33;

public class Question2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            arr2[i] = arr[i] + arr[i+1];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
}
