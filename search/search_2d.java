package search;

import java.util.*;

public class search_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter r");
        int r = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter array elemnts");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter element");
        int t = sc.nextInt();
        search2d(arr, t);
    }

    static void search2d(int arr[][], int x) {
        int f = 0;
        if (arr.length == 0) {
            System.out.println("empty");
        }
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (x == arr[r][c]) {
                    System.out.println("element found at index [" + r + "]" + "[" + c + "]");
                    f = 1;
                }
            }
        }
        if (f == 0) {
            System.out.println("not found");
        }
    }
}
