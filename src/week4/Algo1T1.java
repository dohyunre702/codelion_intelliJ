package week4;

public class Algo1T1 { //풀이
    // string > int > string 가는 건 좋은 생각이 아니다.
    public int solution1(int n) {
        String str = String.valueOf(n);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
            //string을 loop돌면서 pareInt 후 더한다.
        }
        return result;
    }


    // 같은 아이디어라도.. 어떻게 코드를 짜는지에 따라 달라진다.
    // 경험 문제임. 꾸준히 풀자
    // 한줄짜리 코드 ㄴㄴ 공동작업할 때 가독성 안좋아. 단계별로 접근하자.

    // %연산 이용 몫, 나머지
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
