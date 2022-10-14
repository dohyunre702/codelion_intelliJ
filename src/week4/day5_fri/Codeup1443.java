package week4.day5_fri;

import java.util.Scanner;

public class Codeup1443 {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr; //[5, 8, 6, 2, 4]
    }

    public static void main(String[] args) {
        //배열 원소 입력
        Scanner sc = new Scanner(System.in);
        int numCnt = sc.nextInt();
        int[] arr = new int[numCnt];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Codeup1443 is = new Codeup1443();
        int[] result = is.sort(arr);

        for (int i = 0;i < arr.length; i++){
            System.out.println(result[i]);
        }

    }
}
