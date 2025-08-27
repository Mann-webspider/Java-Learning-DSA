public class primeF {
    public static boolean isPrime(int n) {

        if (n == 1) {
            System.out.println("only for more than 1 value");
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(1));
    }
}
