import java.util.Arrays;
import java.util.Scanner;

public class multiduplicate {
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
                ans[b++] = arr[idx];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
/*
 * find all duplicate in the array...after arranging in cycle sort the we check
 * whetther the elements of all the indexes are equal to the corr index no.+1 or
 * not...if no them the count increases and we store that index element in a new
 * array...finlly the new arrsy gives all the duplicate nos.
 * eg. 3 2 1 1 2
 * o/p:[1,2]
 */