package week4;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sol(num);
    }

    //접근 방법 : static 메소드, 재귀
    public static void sol(int n) {
        int result = 0;
        int sum = 0;

        while (n > 0) {
            result = n % 10;
            sum += result;
            n = n / 10; //다시 while 문으로 들어가야 하는 n
            }
        if (sum >= 10) {
            sol(sum);
        } else {
            System.out.println(sum);
        }
    }
}