import java.util.*;
public class position_in_infinitearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("\nenter rqd element");
        int x = sc.nextInt();
        pos(arr,x);
    }
    static int pos(int[] arr,int t){
        int l=0;
        int h=1;
        while(t>arr[h]){
            int temp=h+1;
            h=h*2;
            l=temp;
        }
        return binarysrch(arr,t,h,l);         
    }

    static int binarysrch(int[] arr,int t,int high,int low){
      while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(arr[mid]==t){
                    System.out.println("The element "+t+" is found at index "+mid);
                    return mid;
                }
                else if(arr[mid]>t){
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            return -1;
        }
}

