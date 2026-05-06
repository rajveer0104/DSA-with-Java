import java.util.*;

public class strfunction {
    public static void main(String[] args) {
        String str = "Anur ima Sar kar";
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.indexOf('a'));// returns first index of the given char if repeated more than once in the
                                             // string
        System.out.println("char at index 3:" + str.charAt(3));
        System.out.println("last index of char a:" + str.lastIndexOf('a'));
        System.out.println("   Anurima   ".strip());// strips away the spaces at the beginning and at the end
        System.out.println(Arrays.toString(str.split("a")));// strips wrt a given character..here 'a'
    }
}
