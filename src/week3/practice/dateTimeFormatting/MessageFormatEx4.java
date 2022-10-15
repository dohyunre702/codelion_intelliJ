package week3.practice.dateTimeFormatting;
//객체배열에 초기화하지 않고 Scanner를 통해 파일로부터 데이터를 라인별로 읽어서 처리하도록 변경
import java.text.*;
import java.util.Scanner;

public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception { //parse 메소드 사용하므올 예외 던져줌
        String tableName = "CUST_INFO";
        String fileName = "data4.txt";
        String msg = "INSERT INTO" + tableName + "VALUES({0},{1},{2},{3});";

        Scanner sc = new Scanner(System.in);
        String pattern = "{0},{1},{2},{3}";
        MessageFormat mf = new MessageFormat(pattern);

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            Object[] objs = mf.parse(line);
            System.out.println(MessageFormat.format(msg, objs));
        }
        sc.close();//scanner 파일 닫기
        } //main
    }
