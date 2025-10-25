import java.util.*;

public class bs_using_rec {
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
        System.out.println("Found at index: ");
        System.out.print(bs(arr, x, 0, arr.length - 1));
    }

    static int bs(int[] arr, int x, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return bs(arr, x, s, mid - 1);
        }
        return bs(arr, x, mid + 1, e);
    }
}
