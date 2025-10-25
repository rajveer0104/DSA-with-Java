import java.util.*;
 
 public class inplacems {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter n");
 int n = sc.nextInt();
 int[] arr = new int[n];
 System.out.println("enter elements");
 for (int i = 0; i < arr.length; i++) {
 arr[i] = sc.nextInt();
 }
 inplacems(arr, 0, arr.length );
 System.out.println(Arrays.toString(arr));
 }
 
 static void inplacems(int[] arr, int s, int e) {
 int mid = (s + e) / 2;
 if (e - s == 1) {
 return;
 }
 inplacems(arr, s, mid);
 inplacems(arr, mid, e);
 inplacemerge(arr, s, mid, e);
 }
 
 static void inplacemerge(int[] arr, int s, int mid, int e) {
 int i = s;
 int j = mid;
 int k = 0;
 int[] mix = new int[e - s];
 while (i < mid && j < e) {
 if (arr[i] < arr[j]) {
 mix[k] = arr[i];
 k++;
 i++;
 } else {
 mix[k] = arr[j];
 k++;
 j++;
 }
 }
 while (i < mid) {
 mix[k] = arr[i];
 k++;
 i++;
 }
 while (j < e) {
 mix[k] = arr[j];
 k++;
 j++;
 }
 for (int l = 0; l < mix.length; l++) {
 arr[s + l] = mix[l];
 }
 }
 }
