import java.util.*;

public class firstmissingpstveno {
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
            if (arr[i] > 0) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int t = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = t;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int in = 0; in < arr.length; in++) {
            if (arr[in] <= 0) {
                System.out.println("missing element is " + (in + 1));
            }

        }
    }
}
