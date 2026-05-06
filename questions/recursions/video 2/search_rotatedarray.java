import java.util.*;

public class search_rotatedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter x");
        int x = sc.nextInt();
        System.out.println("found at index " + rotatedsearch(arr, x, 0, arr.length - 1));
    }

    static int rotatedsearch(int[] arr, int t, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == t) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (t >= arr[s] && t <= arr[mid]) {
                return rotatedsearch(arr, t, s, mid - 1);
            } else {
                return rotatedsearch(arr, t, mid + 1, e);
            }
        }
        if (t >= arr[mid] && t <= arr[e]) {
            return rotatedsearch(arr, t, mid + 1, e);
        }
        return rotatedsearch(arr, t, s, mid - 1);
    }
}
