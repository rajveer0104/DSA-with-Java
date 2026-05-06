import java.util.*;

public class duplicateno {
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
        System.out.println("duplicate: " + arr[arr.length - 1]);
    }
}
/*
 * find a single duplicate no. in the array...after sraanging in cycle sort the
 * duplicate no.gets shifter to the last index..so duplicate no is the element
 * of the last index after sorting
 * eg. 4 2 1 3 2
 * after sorting: 1 2 3 4 2
 */