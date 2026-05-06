import java.util.*;

public class first_last_position {
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
        System.out.println("\nenter rqd element");
        int x = sc.nextInt();
        // int[] p = rqd_positions(arr, x);
        // System.out.println("first and last position is" + Arrays.toString(p));
        binarysearch(arr, x);
    }

    /*
     * static int[] rqd_positions(int[] arr, int t) {
     * int[] ans = { -1, -1 };
     * int low = positions(arr, t, true);
     * int high = positions(arr, t, false);
     * ans[0] = low;
     * ans[1] = high;
     * return ans;
     * }
     * 
     * static int positions(int[] arr, int t, boolean dec) {
     * int ans = -1;
     * int low = 0;
     * int high = arr.length - 1;
     * while (low <= high) {
     * int mid = (low + high) / 2;
     * if (arr[mid] == t) {
     * ans = mid;
     * if (dec == true) {
     * high = mid - 1;
     * } else {
     * low = mid + 1;
     * }
     * } else if (arr[mid] > t) {
     * high = mid - 1;
     * } else {
     * low = mid + 1;
     * }
     * }
     * return ans;
     * }
     */

    static void binarysearch(int[] arr, int t) {
        int f = 0, g = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == t) {
                System.out.println("The element " + t + " is found at index " + mid);
                f = mid;
                g = mid;
                break;
            } else if (arr[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (f == 0) {
            System.out.println("not found");
        }
        /*
         * System.out.println("f:" + f);
         * System.out.println("g:" + g);
         */
        if (arr[f] == arr[f + 1]) {
            f++;
        }
        if (arr[g] == arr[g - 1]) {
            g--;
        }
        System.out.println("first position:" + g + " and last position:" + f);
    }
}

/*
 * gives first and last position of the key value
 * eg. i/p: 1 2 3 3 3 3 4 4 4 4 5 , key:3
 * o/p: 3
 */
