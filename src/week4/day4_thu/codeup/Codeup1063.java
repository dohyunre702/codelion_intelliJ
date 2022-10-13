package week4.day4_thu.codeup;
import java.util.Scanner;

public class Codeup1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = a > b ? a : b;
        System.out.printf("%d", c);

    }
}
