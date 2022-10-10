package week3.day3_wed.codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //문자열로 받아서 : 기준으로 나누기
        String[] time = sc.next().split(":");
        System.out.printf("%s:%s",time[0], time[1]);
        sc.close();
    }
}
