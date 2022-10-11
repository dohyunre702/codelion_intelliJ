package week4;
//프로그래머스 자릿수더하기

import java.util.*;

// string > int > string
//런타임 에러
public class Algo1 {
    public int solution1(int n) {
        int answer = 0;
        // 숫자를 문자열로 변환
        String str = Integer.toString(n);
        // 문자열의 각 자리 숫자를 분해해서 더하기
        String a = str.substring(0,1);
        String b = str.substring(1,2);
        String c = str.substring(2,3);

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int num3 = Integer.parseInt(c);

        answer = num1 + num2 + num3;
        return answer;
    }

    //새 풀이 (내가 푼 것)
    public int solution2(int n) {
        int result = 0;
        int sum = 0;

        while(n > 0) {
            result = n % 10;
            sum += result;
            n = n / 10; //다시 while 문으로 들어가야 하는 n
        }
        return sum;
    }

}