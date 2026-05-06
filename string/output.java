import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("Anurima");
        System.out.println(new int[] { 5, 6, 7, 8 });
        System.out.println((new int[] { 5, 6, 7, 8 }).toString());
        int x[] = { 5, 3, 4, 6, 2 };
        System.out.println(Arrays.toString(x));
        Integer num = new Integer(50);
        System.out.println(num);
        System.out.println(num.toString());

        // pretty printing
        float f = 1.23432912145f;// 1.234
        float f1 = 1.24699f;// rounds up to 1.25
        System.out.printf("upto two decimal places %.3f", f);
        System.out.println();
        System.out.printf("upto two decimal places %.2f", f1);
        System.out.println();
        System.out.printf("PI value is: %.2f", Math.PI);// 3.14
        System.out.println();
        System.out.printf("PI value is: %.5f", Math.E);// 2.71828
    }
}
