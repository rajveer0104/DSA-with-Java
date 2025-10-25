package search;
import java.util.*;
public class binarysearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row of array");
        int m = sc.nextInt();
        System.out.println("Enter column of array");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter array elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
            arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nenter rqd element");
        int x = sc.nextInt();
        binarysrch2D(arr, x);
    }
    static void binarysrch2D(int[][] arr,int t){
        int f=0;
            int low=0;
            int high=arr.length-1;
            while(low<arr.length && high>=0)
            {
                if(arr[low][high]==t){
                    f=1;
                    System.out.println("The element "+t+" is found at index("+low+","+high+")");
                    break;
                }
                else if(arr[low][high]<t){
                    low++;
                }
                else{
                    high--;
                }
            }
            if(f==0){
                System.out.println("not found");
            }
        }
}
