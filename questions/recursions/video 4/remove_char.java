import java.util.*;

public class remove_char {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter string");
String arr = sc.nextLine();
StringBuilder chars = new StringBuilder();
StringBuilder ans = new StringBuilder();
//ans = removechar(arr, 0, chars);
//ans = removestring(arr, 0, chars);
ans = removeapp_not_apple(arr, 0, chars);
for (int i = 0; i < ans.length(); i++) {
System.out.print(ans.charAt(i));
}
}

static StringBuilder removechar(String arr, int i, StringBuilder chars) {
StringBuilder s = new StringBuilder();
if (i == arr.length()) {
return chars;
}
if (arr.charAt(i) == 'a') {
return removechar(arr, i + 1, chars);
}
chars.append(arr.charAt(i));
return removechar(arr, i + 1, chars);
}


static StringBuilder removestring(String arr, int i, StringBuilder chars) {
String p = "apple";
StringBuilder s = new StringBuilder();
if (i == arr.length()) {
return chars;
}
if (arr.startsWith(p, i)) {
return removestring(arr, i + p.length(), chars);

}
chars.append(arr.charAt(i));
return removestring(arr, i + 1, chars);
}


static StringBuilder removeapp_not_apple(String arr, int i, StringBuilder
chars) {
String p = "app";
StringBuilder s = new StringBuilder();
if (i == arr.length()) {
return chars;
}
if (!arr.startsWith("apple", i) && arr.startsWith(p, i)) {
return removeapp_not_apple(arr, i + p.length(), chars);

}
chars.append(arr.charAt(i));
return removeapp_not_apple(arr, i + 1, chars);
}
}
 