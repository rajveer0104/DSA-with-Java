import java.util.*;
public class strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        int ori=n;
        int sum=0;
        while(n!=0){
        sum=sum+fact(n%10);
        n=n/10;
        }
        if (sum==ori){
            System.out.println("strong no");
        }
        else{
            System.out.println("Not strong no.");
        }
    }
    static int fact(int n){
    int f=1;
       for(int i=1;i<=n;i++){
        f=f*i;
       }
        return f;
    }

}

