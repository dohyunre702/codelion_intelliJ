package week4.day4_thu.codeup;

import java.util.Scanner;

public class Codeup1065 {

    public void condition(int n) {
        if (n%2==0) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Codeup1065 try1 = new Codeup1065();
        try1.condition(a);
        try1.condition(b);
        try1.condition(c);

    }

}
