import java.util.*;

public class cyclesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        cyclesort(arr);
    }

    static void cyclesort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int t = arr[i];
                arr[i] = arr[correct];
                arr[correct] = t;
            } else {
                i++;
            }
        }
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
// 1 2 3 4 5 value
// 0 1 2 3 4 index
