package codeupAlgo;
//codeup1161_2
import java.util.Scanner;

class TakeNum {
    public String getEvenOdd(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }

    public void printEvenOdd(int first, int second) {
        System.out.printf("%s+%s = %s", getEvenOdd(first), getEvenOdd(second), getEvenOdd(first+second));
    }

}
public class OddEven2Refactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        TakeNum eop = new TakeNum();
        eop.printEvenOdd(num1, num2);
    }
}
