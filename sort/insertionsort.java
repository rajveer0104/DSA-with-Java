import java.util.*;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionsort(arr);
    }

    static void insertionsort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                } else {
                    break;
                }
            }
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
// best case:o(n) ,worst case:o(n^2)
/*
 * Starting with the second element, each value is compared backward through the
 * already-sorted left portion and “inserted” at the first position where it is
 * greater than the element to its left (or at the front if none).This requires
 * shifting larger elements right to make room,so the cost is dominated by these
 * shifts and comparisons.
 */
