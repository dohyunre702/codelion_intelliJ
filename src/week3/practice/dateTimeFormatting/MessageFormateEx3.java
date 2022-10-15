package week3.practice.dateTimeFormatting;
//parse(String source) 활용
import java.text.*;

public class MessageFormateEx3 {
    public static void main(String[] args) throws Exception { //parse 메소드 사용하므올 예외 던져줌
        String[] data = {
                "INSERT INTO CUST_INFO VALUES('이자바','02-234-1234',27,'07-09');",
                "INSERT INTO CUST_INFO VALUES('김프로','032-333-1234',33,'10-07');"
        };

        String pattern = "INSERT INTO CUST_INFO VALUES({0},{1},{2},{3});";
        MessageFormat mf = new MessageFormat(pattern);

            for (int i = 0; i < data.length; i++) {
                Object[] objs = mf.parse(data[i]); //parse
                for (int j = 0; j < objs.length; j++) {
                    System.out.print(objs[j] + ",");
                }
                System.out.println();
            }
    }//main
}
