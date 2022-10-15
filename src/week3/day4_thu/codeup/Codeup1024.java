package week3.day4_thu.codeup;

import java.util.Scanner;

// 시도2. charAt(int index) 사용.
// 문제 : 컴파일 에러. String valueOf로 charAt을 감싸주어야 함
// 해결1. : charAt(i)를 string 타입으로 변경

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String str = "";
        for (int i = 0; i < input.length(); i++) {
            str = String.valueOf(input.charAt(i));
            System.out.println(str);
        }
    }
}
