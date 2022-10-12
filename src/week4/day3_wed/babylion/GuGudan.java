package week4.day3_wed.babylion;

import java.util.Scanner;

//메소드, 파라미터 적용 > 다형성 적용 필요
public class GuGudan {

    public void makegugudan (int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
        }
    }

    public void makeplusdan (int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n + "+" + i + "=" + n+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        GuGudan gugudan = new GuGudan();
        gugudan.makegugudan(num);
        gugudan.makeplusdan(num);
     }
    }
