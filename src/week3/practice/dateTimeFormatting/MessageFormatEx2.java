package week3.practice.dateTimeFormatting;
//반복문으로 하나 이상의 데이터 집합 출력
// 다수의 데이터를 db에 저장하기 위한 insert문으로 변환할 때 사용하면 좋다

import java.text.MessageFormat;

public class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        String msg = "INSERT INTO" + tableName + "VALUES (''{0}'', ''{1}'', ''{2}'',''{3}'');";

        Object[] [] arguments = {
                {"이자바", "02-234-1234", "27", "07-09"},
                {"김프로", "032-333-1234", "33", "10-07"},
        };

        for(int i=0; i< arguments.length; i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
