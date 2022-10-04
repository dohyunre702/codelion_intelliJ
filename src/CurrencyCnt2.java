import java.util.Scanner;
//현금으로 돈을 받고 25000원 거슬러 주기
//5만원짜리는 몇 장, 만원짜리는 몇 장, 오천원짜리는 몇 장 거슬러주어야 하나요?
public class CurrencyCnt2 {
    public static void main(String[] args) {

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;

        int num = 25000; //25000원이라면 만원짜리 2장, 5000원짜리 1장
        //25,000원을 5만원으로 나누었을 때 몫, 나머지
        //25,000원을 각 화폐단위로 나누었을 때 나머지를 출력하는 코드
        //각 화폐 단위는 각각 변수 선언해 주기
        System.out.printf("5만원권 %d장 나머지 %d\n", num / curr50000, num % curr50000);
        System.out.printf("1만원권 %d장 나머지 %d\n", num / curr10000, num % curr10000);
    }
}
