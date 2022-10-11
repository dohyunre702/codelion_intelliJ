package week4;
import java.util.Scanner;
//오류체크 필요
public class Codeup1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Calculate code = new Calculate(num);
        System.out.println(code.count);
    }
}
// 접근 방법 : 클래스 활용
class Calculate {
    private int a;

    public Calculate(int a) {
        this.a = a;
        this.count=count;
    }
    //main 함수의 num 변수를 받아와서 solve 메소드의 매개변수에 넣는다.
    int count = 0;
    public int solve(int num) {
        while (num > 0) {
            num = num / 10; //다시 while 문으로 들어가야 하는 n
            count = count + 1;
        }
        return count;
    }
}