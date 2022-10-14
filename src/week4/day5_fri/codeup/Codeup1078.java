package week4.day5_fri.codeup;

import java.util.Scanner;

public class Codeup1078 {

    public int makesum(int a) {
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        } return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Codeup1078 result = new Codeup1078();
        System.out.printf("%s",result.makesum(n));
    }
}
