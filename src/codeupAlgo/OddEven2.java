package codeupAlgo;

import java.util.Scanner;
// 다른 방법1. 삼항연산자
// 다른 방법2. 함수 활용해 보기
public class OddEven2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //앞 숫자 홀짝 판별
        if (num1 % 2 == 0) {
            System.out.print("짝수+");
        } else {
            System.out.print("홀수+");
        }
        //뒷 숫자 홀짝 판별
        if (num2 % 2 == 0) {
            System.out.print("짝수=");
        } else {
            System.out.print("홀수=");
        }
        //합 숫자 판별
        if ((num1+num2) % 2 ==0) {
            System.out.print("짝수");
        } else {
            System.out.print("홀수");
        }
    }
}
