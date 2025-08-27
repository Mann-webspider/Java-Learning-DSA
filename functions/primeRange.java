import java.util.Scanner;

public class primeRange {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("enter your number to prime : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 2; i <= a; i++) {
            boolean b = isPrime(i);
            if (b) {

                System.out.println(i + " is prime number ");
            } else {
                System.out.println(i + " is not prime number");
            }
        }
    }
}
