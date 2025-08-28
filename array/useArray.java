import java.util.Scanner;

/**
 * useArray
 */
public class useArray {

    public static void main(String[] args) {
        // initializing the size of an array
        int marks[] = new int[5];

        // in this we should not initialize the size of the array java compiler
        // automatically create a size of it

        int number[] = { 6, 8, 4, 2, 1 };

        Scanner sc = new Scanner(System.in);

        // giving value to array from user
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int perc = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage is " + perc);

        // function of array to use
        // marks.length returns the size of the array
        System.out.println(marks.length);

    }
}