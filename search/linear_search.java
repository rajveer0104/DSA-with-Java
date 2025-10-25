package search;

import java.util.*;

public class linear_search {
   /* public static void main(String[] args) {
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
        linearsearch(arr, x);
    }

    static void linearsearch(int[] arr, int target) {
        int f = 0;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("element found at index " + i);
                f = 1;
                break;
            }
           }
           if (f == 0) {
            System.out.println("not found");
        }
    }*/

    //string search
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str = sc.next();
    System.out.println("\nenter rqd element");
    for (int i = 0; i < str.length(); i++) {
    char x = sc.next().charAt(i);
    stringsearch(str, x);
    }
    
}
static void stringsearch(String str, char target) {
    int f = 0;
    for (int i = 0; i < str.length(); i++) {
        if (target == str.charAt(i)) {
            System.out.println("element found at index " + i);
            f = 1;
            break;
        }
       }
       if (f == 0) {
        System.out.println("not found");
    }
}
}
