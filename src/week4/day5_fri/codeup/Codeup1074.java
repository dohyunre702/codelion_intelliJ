package week4.day5_fri.codeup;

import java.util.Scanner;

public class Codeup1074 {
    private int a;

    public Codeup1074() {
        this.a = a;
    }

    public void countdown(int a) {
        while (a > 0) {
            System.out.println(a);
            a--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Codeup1074 try1074 = new Codeup1074();
        try1074.countdown(num);
        }
    }

