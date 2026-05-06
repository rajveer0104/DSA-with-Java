import java.util.*;
public class fibonacei {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of terms");
        int n=sc.nextInt();
        System.out.println(n);
        System.out.println("Fibonacei series");
        for(int i=0;i<n;i++)
        {
            int t=a;
            a=b;
            System.out.println(t);
            b=t+a;
        }
    }
}
