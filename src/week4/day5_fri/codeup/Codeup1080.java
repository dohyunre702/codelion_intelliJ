package week4.day5_fri.codeup;
import java.util.Scanner;

public class Codeup1080 {
    public void sumuntil(int n) {
        int sum = 0;
        int i = 1;
        do {
            // System.out.println(sum); sum 먼저 추출
            sum = sum + i;
            i++;
        } while(sum < n);
        System.out.println(i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Codeup1080 result = new Codeup1080();
        result.sumuntil(a);
    }
}