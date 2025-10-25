import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int ori=n;
        double sum=0;
        int c=0;
        while(n!=0){
            n=n/10;
            c++;
        }
        n=ori;
        while(n!=0){
            double a=Math.pow((n%10),c);
            sum=sum+a;
            n=n/10;
        }
        if(ori==sum){
            System.out.println("Armstrong no.");
        }
        else{
            System.out.println("Not Armstrong no.");
        }
    }
}
