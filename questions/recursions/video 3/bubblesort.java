import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bsort(arr, 0, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * static void sort(int[] arr, int i, int j) {
     * if (i == arr.length) {
     * return;
     * }
     * if (j == arr.length) {
     * sort(arr, i + 1, i + 2);
     * } else {
     * if (arr[i] > arr[j]) {
     * int t = arr[i];
     * arr[i] = arr[j];
     * arr[j] = t;
     * }
     * sort(arr, i, j + 1);
     * }
     * }
     */

    static void bsort(int[] arr, int i, int j) {
        if (i == arr.length) {
            return;
        }
        if (j == arr.length - 1) {
            bsort(arr, i + 1, 0);
        } else {
            if (arr[j] > arr[j + 1]) {
                int t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
            }
            bsort(arr, i, j + 1);
        }
    }

}
