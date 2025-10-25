import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ssort(arr, 0, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void ssort(int[] arr, int i, int j) {
        if (i == arr.length) {
            return;
        }
        if (j == arr.length) {
            ssort(arr, i + 1, i + 1);
        } else {
            int min = i;
            if (arr[min] > arr[j]) {
                min = j;
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
            ssort(arr, i, j + 1);
        }
    }
}
