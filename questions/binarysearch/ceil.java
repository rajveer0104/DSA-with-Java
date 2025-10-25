import java.util.*;

public class ceil {
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
        ceils(arr, x);
    }

    static void ceils(int[] arr, int t) {
        int f = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == t) {
                System.out.println("Ceil value is " + arr[mid] + "at index" + mid);
                f = 1;
                break;
            } else if (arr[mid] > t) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        if (f == 0) {
            System.out.println("Ceil value is " + arr[low] + "at index" + low);

            // for floor it will be arr[high]
        }
    }
}
/*
 * returns the value jst greater than the key value
 * eg. array 1 3 4 6 8
 * key:3 o/p:3
 * key:5 o/p:6
 */
