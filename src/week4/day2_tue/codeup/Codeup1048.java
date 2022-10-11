package week4.day2_tue.codeup;

//시프트연산자 : a의 b제곱

import java.util.Scanner;

public class Codeup1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d",a<<b);

    }
}
