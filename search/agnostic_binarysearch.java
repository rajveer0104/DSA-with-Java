import java.util.*;

public class agnostic_binarysearch {
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
        binarysearch(arr, x);
    }

    static void binarysearch(int[] arr, int t) {
        int f = 0;
        int low = 0;
        int high = arr.length - 1;
        if (arr[0] < arr[arr.length - 1]) {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == t) {
                    System.out.println("The element " + t + " is found at index " + mid);
                    f = 1;
                    break;
                } else if (arr[mid] > t) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if (f == 0) {
                System.out.println("not found");
            }
        } else {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == t) {
                    System.out.println("The element " + t + " is found at index " + mid);
                    f = 1;
                    break;
                } else if (arr[mid] > t) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            if (f == 0) {
                System.out.println("not found");
            }
        }
    }
}
// search of an ele can be done in any order (inc or dec)
