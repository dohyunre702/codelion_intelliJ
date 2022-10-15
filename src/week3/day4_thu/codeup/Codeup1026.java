package week3.day4_thu.codeup;


import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // string 시:분:초 형태로 입력된다.
        // split 사용. string을 ":"를 기준으로 나누어 배열로 return
        // index[1] 값을 출력

        String timenow = sc.nextLine();
        String[] arr = timenow.split(":");
        System.out.printf(arr[1]);
    }

}
