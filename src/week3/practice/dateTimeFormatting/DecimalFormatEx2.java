package week3.practice.dateTimeFormatting;

import java.text.*;

public class DecimalFormatEx2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567,89");
            //number 클래스는 integer,double과 같은 숫자를 저장하는 wrapper 클래스의 조상.
            //parse메소드로 기호, 문자가 푸함된 문자열을 숫자로 변환 ***parseInt메소드는 불가.
            System.out.print("1,234,567.89" + "->");

            double d = num.doubleValue(); //doubleValue() : Number에 저장된 값을 double형의 값으로 변환해 반환
            System.out.print(d + "->");

            System.out.println(df2.format(num));
        } catch (Exception e) {}
    }//main
}
