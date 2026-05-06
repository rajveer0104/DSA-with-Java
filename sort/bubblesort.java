import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
    }

    static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int f = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    f = 1;
                }
            }
            if (f == 0) {
                break;
            }
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
// best case o(n) , worst case o(n^2)
/*
 * comparing adjacent elements and swapping them whenever they are out of order.
 * After each pass, the largest remaining item “bubbles” to its correct position
 * at the end of the array, so the unsorted portion shrinks by one
 */