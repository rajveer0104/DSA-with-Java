import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        isort(arr, 0, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void isort(int[] arr, int i, int j) {
        if (i == arr.length - 1) {
            return;
        }
        if (j == 0) {
            isort(arr, i + 1, i + 2);
        } else {
            if (arr[j] < arr[j - 1]) {
                int t = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = t;
            }
            isort(arr, i, j - 1);
        }
    }
}
