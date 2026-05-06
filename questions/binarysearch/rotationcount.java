import java.util.Scanner;

public class rotationcount {
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
        int y = ele(arr);
        //clockwise
        System.out.println();
        System.out.println("rotation ="+(y+1));

        //anticlockwise
        int r=arr.length-(y+1);
        System.out.println("rotation ="+r);
    }
    static int ele(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            else if(arr[low]>arr[mid])
            {
                high=mid-1;
            }
            else if(arr[low]<arr[mid])
            {
                low=mid+1;
            }
        }
        return -1;
    } 
}
