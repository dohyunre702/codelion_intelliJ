//현금으로 돈을 받고 25000원을 거슬러주어야 한다
//5만원, 만원, 5천원짜리는 각 몇 장?

import java.util.Scanner;


public class CurrencyCnt {
    public static void main(String[] args){
        int[] price = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 0; i < price.length; i++) {
            if (num % price[i] == 0) {
                continue;
            } else {
                count = num % price[i];
                System.out.println(price[i] + "원 " + count + "매");
            }
        }


    }
}
