import java.util.Scanner;

public class search_rotatedarray {
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
        int y = ele(arr);
        System.out.println("pivot at index:" + y);
        int l = binarysearch(arr, x, 0, y);
        int h = binarysearch(arr, x, y + 1, n - 1);
        if (l == -1) {
            System.out.println("found at index:" + h);
        } else {
            System.out.println("found at index:" + l);
        }
    }

    static int ele(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] > arr[mid]) {
                return mid - 1;
            } else if (arr[low] > arr[mid]) {
                high = mid - 1;
            } else if (arr[low] < arr[mid]) {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int t, int low, int high) {
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
    }
}
