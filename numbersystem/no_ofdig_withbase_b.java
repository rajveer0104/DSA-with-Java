public class no_ofdig_withbase_b {
    public static void main(String[] args) {
        int n = 17;
        int b = 10;
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println("no of digits rqd:" + ans);
    }
}
