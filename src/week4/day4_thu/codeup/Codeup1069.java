package week4.day4_thu.codeup;

import java.util.Scanner;

public class Codeup1069 {

    public void condition1(String a) {
        switch(a) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        Codeup1069 try1 = new Codeup1069();
        try1.condition1(a);

    }
}
