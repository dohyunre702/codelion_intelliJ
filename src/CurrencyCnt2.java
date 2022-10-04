import java.util.Scanner;

public class CurrencyCnt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("화폐 금액을 입력해주세요 >>");

        int num = sc.nextInt();
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;

        System.out.printf("5만원권 %d장 나머지 %d\n", num / curr50000, num % curr50000);
        System.out.printf("1만원권 %d장 나머지 %d\n", num / curr10000, num % curr10000);
        System.out.printf("5천원권 %d장\n", num / curr5000);
        System.out.printf("천원권 %d장\n", num / curr1000);
        System.out.printf("오백원 %d장\n", num / curr500);
        System.out.printf("백원 %d장\n", num / curr100);

    }
}
