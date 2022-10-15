package week3.day4_thu.codeup;

import java.util.Scanner;

// 시도 1. substring 함수 사용.
// 문제. 배열 길이를 넘어가므로 out of range 에러 발생.
public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String str = "";

        for (int i = 0; i < input.length(); i++) {
            str = input.substring(i, i);
            System.out.println(str);
        }
    }
}
