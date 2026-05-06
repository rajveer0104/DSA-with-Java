import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionsort(arr);
    }

    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
// best case o(n^2) , worst case o(n^2)
/*
 * On each pass it scans the unsorted portion to find the smallest (or largest)
 * element, then swaps it with the left-most unsorted position,thereby expanding
 * the sorted region by one.Here, we have done the programme using the smallest
 * element
 */
