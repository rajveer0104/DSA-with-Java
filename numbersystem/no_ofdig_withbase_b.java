public class no_ofdig_withbase_b {
    public static void main(String[] args) {
        int n = 1000;
        int b = 10;
        int ans = (int)(Math.log(n) / Math.log(b) +1e-10) + 1;
        System.out.println("no of digits rqd:" + ans);
    }
}
