import java.util.*;

public class uniqueele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arraysize");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("unique element is:" + ans(arr));
    }

    static int ans(int[] arr) {
        int u = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            u = u ^ arr[idx];
        }
        return u;
    }
}
