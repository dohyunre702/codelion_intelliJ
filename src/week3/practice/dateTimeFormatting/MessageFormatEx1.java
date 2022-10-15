package week3.practice.dateTimeFormatting;

import java.text.*;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday{3}";
        //msg의 형태로 데이터 출력. {#} 데이터가 출력될 자리
        //{#}의 #은 꼭 순차적일 필요 없고, 반복 입력도 가능

        Object[] arguments = {"이자바", "02-234-1234", "27", "07-09"};
        //객체배열

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
