public class factorial {
    public static int fac(int n) {
        if (n == 0) {
            return 0;
        } else {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int ans = fac(7);
        System.out.println(ans);
    }
}
