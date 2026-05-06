import java.util.*;

public class linearsearch3 {
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
         * ArrayList<Integer> ans = ls3(arr, x, 0, new ArrayList<>());
         * System.out.println("found at position" + ans);
         */
        System.out.println("found at index" + ls4(arr, x, 0));
    }

    /*
     * static ArrayList<Integer> ls3(int[] arr, int target, int index, ArrayList<Integer> list) {
     * if (index == arr.length) {
     * return list;
     * }
     * if (arr[index] == target) {
     * list.add(index);
     * }
     * return ls3(arr, target, index + 1, list);
     * }
     */
    static ArrayList<Integer> ls4(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> belowans = ls4(arr, target, i + 1);
        list.addAll(belowans);
        return list;
    }
}
