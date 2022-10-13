package week4.day4_thu.codeup;

import java.util.Scanner;

public class Codeup1067 {

    public void condition1(int n) {
        if (n%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public void condition2(int n) {
        if (n > 0) {
            System.out.println("plus");
            condition1(n);
        } else if (n < 0) {
            System.out.println("minus");
            condition1(n);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Codeup1067 try2 = new Codeup1067();
        try2.condition2(a);

    }

}
