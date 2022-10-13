package week4.day4_thu.codeup;

import java.util.Scanner;
//프로그래밍언어의 밑바닥 기초, 세세한 처리 과정에 대한 이해,
//컴파일러의 소스코드 해석과 변환 등에 대한 경험과 지식이 필요하다.
public class Codeup1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = (a < b ? a : b) < c ? (a<b?a:b) : c;
        System.out.printf("%d", d);

    }
}
