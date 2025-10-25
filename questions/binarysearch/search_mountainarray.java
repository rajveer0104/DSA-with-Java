import java.util.*;

public class search_mountainarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nenter rqd element");
        int x = sc.nextInt();
        int y = ele_in_bitonic(arr);
        System.out.println("bitonic at index" + y);
        int l = agbinarysearch(arr, x, 0, y - 1);
        int h = agbinarysearch(arr, x, y, n - 1);
        System.out.println("first position:" + l);
        System.out.println("last position:" + h);
    }

    static int ele_in_bitonic(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid + 1] > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int agbinarysearch(int[] arr, int t, int low, int high) {
        if (arr[low] < arr[low + 1]) {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == t) {
                    return mid;
                } else if (arr[mid] > t) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return -1;
        } else {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == t) {
                    return mid;
                } else if (arr[mid] > t) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }
    }
}
/*
 * here we find the first and last position of an element in a bitonic array
 * eg1: 1 2 3 2 1
 * o/p: first posi 1,last posi 3
 * eg2: 1 4 10 7 6 3 2
 * o/p: first posi -1,last posi 5
 */
