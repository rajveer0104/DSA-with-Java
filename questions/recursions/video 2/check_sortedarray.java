import java.util.*;

public class check_sortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sorted(arr, i + 1);
    }
}
