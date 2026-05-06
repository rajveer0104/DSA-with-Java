import java.util.*;

public class no_with_evendigits {
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
    System.out.println();
    System.out.println("no with even digits");
    evenno_digits(arr);
    /*
     * int x=no_digits(134257);
     * System.out.println(x);
     */
    evenno_digits2(arr);
  }

  static void evenno_digits(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int ori = arr[i];
      int count = 0;
      while (ori > 0) {
        ori = ori / 10;
        count++;
      }
      if (count % 2 == 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }

  // shortcut to find no. of digits
  static int no_digits(int n) {
    return (int) (Math.log10(n)) + 1;
  }

  static void evenno_digits2(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int temp = no_digits(arr[i]);
      if (temp % 2 == 0) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
/*
 * only return ele with even digits
 * eg. 1 2 3 4 5
 * o/p: 2 4
 */
