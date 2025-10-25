
import java.util.*;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int ori=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        if (rev==ori){
            System.out.println("Palindrome");
        }
    }
}

