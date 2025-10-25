import java.util.*;

public class bitonic_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        bitonic(arr);
    }

    static void bitonic(int[] arr) {
        int f = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println("Bitonic point is " + arr[mid] + " is found at index " + mid);
                f = 1;
                break;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (f == 0) {
            System.out.println("not a bitonic array");
        }
    }
}
/*
 * returns the greatest point in the hill shaped array
 * eg. 1 4 6 8 7 3 2
 * o/p:8
 */
