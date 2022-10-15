package week3.day4_thu.codeup;

import java.util.Scanner;

// 시도2. charAt(int index) 사용.
// 문제 : 컴파일 에러. String valueOf로 charAt을 감싸주어야 함
// 왜? : charAt은 char, 내가 str 타입을 string으로 지정해 주어서.

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String str = "";
        for (int i = 0; i < input.length(); i++) {
            str = String.valueOf(input.charAt(i));
        }
    }
}
