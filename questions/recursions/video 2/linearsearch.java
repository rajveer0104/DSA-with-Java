import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter x");
        int x = sc.nextInt();
        /*
         * if (ls(arr, x, 0) == -1) {
         * System.out.println("not found");
         * } else {
         * System.out.println("found at index " + ls(arr, x, 0));
         * }
         */
        duplicate_ls(arr, x, 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("found at index " + list.get(i));
        }
    }

    /*
     * static int ls(int[] arr, int x, int i) {
     * if (i == arr.length) {
     *  return -1;
     * }
     * if (x == arr[i]) {
     *  return i;
     * }
     * return ls(arr, x, i + 1);
     * }
     */

    // return both index in case of duplicate elements
    static ArrayList<Integer> list = new ArrayList<>();

    static void duplicate_ls(int[] arr, int x, int i) {
        if (i == arr.length) {
            return;
        }
        if (x == arr[i]) {
            list.add(i);
        }
        duplicate_ls(arr, x, i + 1);
    }
}
