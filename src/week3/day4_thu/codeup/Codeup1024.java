package week3.day4_thu.codeup;

import java.util.Scanner;

// 시도2. charAt(int index) 사용.
// 문제 : 컴파일 에러. String valueOf로 charAt을 감싸주어야 함
// 원인 : str과 char 사이의 포맷이 맞지 않아서 발생
// 해결2. : str을 char 타입으로 변경

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char ch;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            System.out.println(ch);
        }
    }
}
