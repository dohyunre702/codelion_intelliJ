package week4.day2_tue.codeup;
//나눗셈처리
import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long sum = a + b + c;
        float ave = (a + b + c)/3;

        System.out.println(sum);
        System.out.println(String.format("%.1f", ave));
    }
}
