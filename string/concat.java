import java.util.ArrayList;

public class concat {
    public static void main(String[] args) {
        System.out.println('a' + 'b');// adds the ascii values of this characters
        System.out.println('a' + 5);// adds ascii values of the character and the integer
        System.out.println((char) ('a' + 5));// first adds the ascii of char and the input then converts the ascii output into its character value
        System.out.println("a" + "b");// converts into string and concats the two strings together
        System.out.println();// Now,if any one of the i/p is string then converts rest of the i/ps to string
        System.out.println("a" + 5);// 5 coverted to string so,a5
        System.out.println("Anu" + 'r');// r coverted to string so,Anur
        System.out.println("Anu" + new Integer(55));
        // object 55 coverted to string, so Anu55
        System.out.println();
        System.out.println("Anurima" + new ArrayList<>());// the empty arraylist is added to the string
        // System.out.println(56+new ArrayList<>());//shows incompatible data type as
        // for any addition/concatination of non primitive datatypes there should
        // atleast be a string...(exception for primitive datatypes can be added wihtout
        // a string)
        System.out.println(56 + "" + new ArrayList<>());// here the addition can be now done as a string (here empty string "") is added

    }
}
