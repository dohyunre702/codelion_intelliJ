package week4.day3_wed;

// int형 array 선언
// 서로 다른 9개의 자연수

import java.util.Scanner;

public class Codeup2081 {
    public static void main(String[] args) {
        int arr[] = new int [9];
        int max = arr[0];
        int cnt = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;

            if (arr[i] > max) {
                max = arr[i];
                cnt = i;
            }
        }
        System.out.println(max);
        System.out.println(cnt+1);
    }
}
