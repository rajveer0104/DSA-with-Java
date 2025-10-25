public class palindrome {
    public static void main(String[] args) {
        String str = "abccbe";
        System.out.println(palindrome(str));
    }

    static boolean palindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char st = str.charAt(i);
            char en = str.charAt(str.length() - 1 - i);
            if (st != en) {
                return false;
            }
        }
        return true;
    }
}
