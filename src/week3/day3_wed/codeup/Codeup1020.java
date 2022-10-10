package week3.day3_wed.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //문자열로 받아서 - 기준으로 나누기
        String[] num = sc.next().split("-");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        System.out.printf("%06d%07d", a, b);
        sc.close();
    }
}
