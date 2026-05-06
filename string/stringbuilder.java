public class stringbuilder {
    public static void main(String[] args) {
        String ser = "";
        for (int i = 0; i < 26; i++) {
            char x = (char) ('a' + i);
            ser += x;
        }
        System.out.println(ser);// here everytime the prvs string goes to garbage value and the replacement of the existing string is done in the manner of:{a,ab,abc,abcd,...,abcdefgh..yz}so everytime string is changed to a new value thus the garbage elements take up space so it takes O(n^2)//
        System.out.println();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char x = (char) ('a' + i);
            str.append(x);
        }
        System.out.println(str);// in this string builder we dont change the value of string everytime wejust modify it....strings are immutable so they can only be changed but not modified so we use string builder//
    }
}
