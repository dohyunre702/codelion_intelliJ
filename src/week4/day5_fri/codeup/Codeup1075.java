package week4.day5_fri.codeup;

import java.util.Scanner;

public class Codeup1075 {

    private int a;

    public Codeup1075() {
        this.a = a;
    }

    public void countdown(int a) {
        for(int i = a-1; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Codeup1075 try1075 = new Codeup1075();
        try1075.countdown(num);
    }
}
