import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // user input
        /*
         * Scanner sc=new Scanner(System.in);
         * int[] arr= new int[5];
         * System.out.println("Enter array elements");
         * for(int i=0;i<arr.length;i++){
         * arr[i]= sc.nextInt();
         * }
         * System.out.println(Arrays.toString(arr));
         * for(int i=0;i<arr.length;i++){
         * System.out.print(arr[i]+" ");
         * }
         */
        // direct input
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));

        // String
        /*
         * Scanner sc=new Scanner(System.in);
         * System.out.println("Enter n");
         * int n=sc.nextInt();
         * String[] arr= new String[n];
         * System.out.println("Enter array elements");
         * for(int i=0;i<arr.length;i++){
         * arr[i]= sc.next();
         * }
         * System.out.println(Arrays.toString(arr));
         */

        // 2d array
        /*
         * int[][] arr= {{1,2,3},
         * {4,5},
         * {6,7,8,9}};
         * // System.out.println(Arrays.toString(arr));
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr[i].length; j++) {
         * System.out.print(arr[i][j]+" ");
         * }
         * System.out.println();
         * }
         */

        // user input
        /*
         * Scanner sc=new Scanner(System.in);
         * System.out.println("Enter row");
         * int n=sc.nextInt();
         * System.out.println("Enter column");
         * int m=sc.nextInt();
         * String[][] arr=new String[n][m];
         * System.out.println("Enter array elemnts");
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j <m; j++) {
         * arr[i][j]=sc.next();
         * }
         * }
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < m; j++) {
         * System.out.print(arr[i][j]);
         * }
         * System.out.println();
         * }
         * }
         */
    }
}