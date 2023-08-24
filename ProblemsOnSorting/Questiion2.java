package ProblemsOnSorting;


// Given a string s, return the string which contains all characters of s in lexicographical
//         order.
public class Questiion2 {

    static void sort(String s){
        char arr[] = s.toCharArray();
        for (int i = 0; i < s.length() ; i++) {

            for (int j = 1; j <s.length()-i; j++) {
                if (arr[j] < arr[j-1]){
                    char temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {

      String s ="coding";
      sort(s);
      //  System.out.println(s);

    }
}
