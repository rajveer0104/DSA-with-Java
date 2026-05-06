package array;
import java.util.*;

public class swap {
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
        System.out.println(Arrays.toString(arr));
        System.out.println("array length"+arr.length);

        //swaps(arr,3,4);
        reverse(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    static void swaps(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int arr[]){
        for(int i=0;i<=arr.length/2;i++){
            swaps(arr, i, arr.length-i-1);
        }
    }
}
