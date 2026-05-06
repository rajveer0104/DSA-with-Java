import java.util.*;

public class disappearedno {
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
        System.out.println(Arrays.toString(arr));
        int c = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                c++;
            }
        }
        int[] ans = new int[c];
        int b = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] != idx + 1) {
                ans[b++] = idx + 1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
