import java.util.*;

public class smallestgreaterchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("enter characters of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        System.out.println("enter key");
        String key = sc.next();
        smallestgreaterchars(arr, key);
    }

    static void smallestgreaterchars(String[] arr, String x) {
        int f = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].compareTo(x) == 0) {
                System.out.println("result is: " + arr[mid + 1]);
                f = 1;
                break;
            } else if (arr[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (f == 0) {
            System.out.println("result is: " + arr[low]);
        }
    }
}
/*
 * returns the char jst greater than the key char
 * eg. array a b d g i
 * key:b o/p:d
 * key:d o/p:g
 */