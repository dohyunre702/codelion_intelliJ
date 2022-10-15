package week3.practice.dateTimeFormatting;
//사용자가 올바른 형식으로 날짜를 입력할 때까지 반복해서 날짜 입력받기. while, try-catch 사용
import java.util.*;
import java.text.*;

public class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner sc = new Scanner(System.in);

        Date inDate = null;
        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2022/10/15)");

        while(sc.hasNextLine()){
            try{
                inDate = df.parse(sc.nextLine());
                break;
            } catch(Exception e){
                System.out.println("날짜를" + pattern + "의 형태로 다시 입력해주세요.(입력예:2022/10/15)");
            }
        }//while

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60*60*1000); //밀리세컨단위 계산 후 시간으로 변환
        System.out.println("입력하신 날짜는 현재와" + day + "시간 차이가 있습니다.");
    }
}
