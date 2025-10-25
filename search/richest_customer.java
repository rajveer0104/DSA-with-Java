import java.util.*;

public class richest_customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int n = sc.nextInt();
        System.out.println("Enter column");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter array elemnts");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        richest(arr);
    }

    static void richest(int arr[][]) {
        int[] acc = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                acc[i] += arr[i][j];
            }
        }
        int max = acc[0];
        for (int i = 0; i < acc.length; i++) {
            if (acc[i] > max) {
                max = acc[i];
            }
        }
        System.out.println("Richest person's wealth is " + max);
    }
}
/*
 * row wise give customer name, column wise their indiv bank details
 * eg.
 * 20 30 40 ~customer A
 * 40 20 55 ~customer B
 * 60 25 10 ~customer C
 * o/p richest Customer B
 */