package week3.practice.dateTimeFormatting;


import java.util.*;
import java.text.*;

public class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            //simpleDateFormat의 parse(String source) 활용해 문자열 source를 날짜date 인스턴스로 변환
            //parse() 선언 : public Number parse(String source) throws ParseException >> 예외처리 필요
            Date d = df.parse("2015년 11월 22일");
            System.out.println(df2.format(d));
        } catch (Exception e) {}
    }
}
