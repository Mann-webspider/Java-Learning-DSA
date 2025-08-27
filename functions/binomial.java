public class binomial {
    public static int factorial(int f) {
        int a = 1;
        for (int i = 1; i <= f; i++) {
            a *= i;
        }
        return a;
    }

    public static int bio_coef(int n, int r) {
        int fr = factorial(r);
        int fn = factorial(n);
        int nr = factorial(n - r);
        int bio = fn / (fr * nr);
        return bio;
    }

    public static void main(String[] args) {
        int n = 7;
        int r = 2;

        System.out.println(bio_coef(n, r));

    }
}
