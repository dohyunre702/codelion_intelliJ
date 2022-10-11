package week4;
//프로그래머스 자릿수더하기

import java.util.*;

//런타임 에러
public class Algo1 {
    public int solution(int n) {
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
}