package week3.day3_wed.codeup;

import java.util.Scanner;

public class Codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //문자열로 받아서 . 기준으로 나누기
        String[] time = sc.next().split("\\.");
        int a = Integer.parseInt(time[0]);
        int b = Integer.parseInt(time[1]);
        int c = Integer.parseInt(time[2]);
        System.out.printf("%04d.%02d.%02d", a, b, c);
        sc.close();
    }
}
