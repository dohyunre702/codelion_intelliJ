package week4.day2_tue.codeup;

import java.util.Scanner;
//char, string의 아스키코드 변환
public class Codeup1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        int inputAscii = (int) input;

        int outputAscii = inputAscii + 1;
        char output = (char) outputAscii;

        System.out.println(output);
    }

}
