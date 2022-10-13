package week4.day4_thu.codeup;

import java.util.Scanner;

public class Codeup1070 {

    public void condition1(int a) {
        switch(a) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Codeup1070 try1 = new Codeup1070();
        try1.condition1(a);

    }
}
