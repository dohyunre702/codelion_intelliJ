package week4.day4_thu.codeup;

import java.util.Scanner;

public class Codeup1068 {
    public void condition(int n) {
        if (n <= 39) {
            System.out.println("D");
        } else if (n<=69) {
            System.out.println("C");
        } else if (n<=89) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Codeup1068 try1 = new Codeup1068();
        try1.condition(a);

    }
}
