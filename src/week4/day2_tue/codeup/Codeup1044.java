package week4.day2_tue.codeup;

import java.util.Scanner;
//int > long 형변환과 증감연산자

public class Codeup1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long c = ++a;
        System.out.printf("%d", c);
    }
}