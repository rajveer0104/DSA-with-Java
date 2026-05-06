import java.util.*;

public class splitarray {
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
        System.out.println("enter no.of div");
        int m = sc.nextInt();
        int r = split(arr, m);
        System.out.println("rqd sum:" + r);
    }

    static int split(int[] arr, int m) {
        int l = 0;
        int h = 0;
        for (int i = 0; i < arr.length; i++) {
            l = Math.max(l, arr[i]);
            h += arr[i];
        }
        while (l < h) {
            int mid = l + (h - l) / 2;
            int sum = 0;
            int pieces = 1;
            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > mid) {
                    sum = arr[i];
                    pieces++;
                } else {
                    sum += arr[i];
                }
            }
            if (pieces > m) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return h;
    }
}
/*
 * spilts the array based on the no of div then adds each div and take the max
 * sum from each set of div after all of them,finally takes the min of all the
 * max as the final op
 * eg. [7 2 5 10 8], m=2
 * 
 * step 1- [7 2 5 10] [8]
 * sum div 1=24 & sum div 2=8 so,here max(24,8)=24
 * 
 * step 2- [7 2 5] [10 8]
 * sum div 1=14 & sum div 2=18 so,here max(14,18)=18
 * 
 * step 3- [7 2] [5 10 8]
 * sum div 1=9 & sum div 2=23 so,here max(9,23)=23
 * 
 * step 4- [7] [2 5 10 8]
 * sum div 1=7 & sum div 2=25 so,here max(7,25)=25
 * 
 * now, min of all the max => min[24,18,23,25]=18
 * so, o/p=18
 */