package codeupAlgo;
//7의 배수
//어떤 정수가 입력되면 그 수가 7의 배수인지 확인하기
import java.util.Scanner;

public class Codeup1155 {
    public static void sevenMultipleTest(int a) {
        if (a % 7 == 0) {
            System.out.print("multiple");
        } else {
            System.out.print("not multiple");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        sevenMultipleTest(number);
    }
}
