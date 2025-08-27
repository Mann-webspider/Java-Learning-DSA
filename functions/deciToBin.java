public class deciToBin {
    public static int convert(int n) {
        int pow = 0;
        int bi = 0;
        while (n != 0) {
            bi = bi + ((n % 2) * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        return bi;
    }

    public static void main(String[] args) {
        System.out.println(convert(255));
    }
}
