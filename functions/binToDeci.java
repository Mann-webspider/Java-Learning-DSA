import java.util.Scanner;

/**
 * binToDeci
 */
public class binToDeci {
    public static int convert(String n) {

        int dec = 0;
        int bi = Integer.parseInt(n);
        for (int pow = 0; pow <= n.length(); pow++) {

            dec = dec + (bi % 10) * (int) Math.pow(2, pow);
            bi = (int) bi / 10;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your binary number: ");
        String n = sc.nextLine();
        int res = convert(n);
        System.out.println(res);
    }
}