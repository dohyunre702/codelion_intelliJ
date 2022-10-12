package week4.day3_wed.babylion;

import java.util.Scanner;

public class GuGudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i < 10; i++) {
            int num = sc.nextInt();
            int result = num * i;
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}
