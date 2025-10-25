import java.util.*;

public class mergesort {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter n");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("enter elements");
for (int i = 0; i < arr.length; i++) {
arr[i] = sc.nextInt();
}
int[] ans = new int[n];
ans = mergesort(arr);
for (int i = 0; i < ans.length; i++) {
System.out.print(ans[i] + " ");
}
}

static int[] mergesort(int[] arr) {
if (arr.length == 1) {
return arr;
}
int mid = arr.length / 2;
int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
return merge(left, right);
}
 
static int[] merge(int[] left, int[] right) {
int[] merge1 = new int[left.length + right.length];
int i = 0;
int j = 0;
int x = 0;
while (i != left.length && j != right.length) {
if (left[i] < right[j]) {
merge1[x] = left[i];
x++;
i++;
} else {
merge1[x] = right[j];
x++;
j++;
}
}
while (i != left.length) {
merge1[x] = left[i];
x++;
i++;
}
while (j != right.length) {
merge1[x] = right[j];
x++;
j++;
}
return merge1;
}
}
