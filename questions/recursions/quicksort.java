import java.util.Arrays;
import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        qs(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void qs(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            } //1 2 6 8 3      1 2 3 8 6
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        qs(arr, low, e);
        qs(arr, s, high);
    }
}
