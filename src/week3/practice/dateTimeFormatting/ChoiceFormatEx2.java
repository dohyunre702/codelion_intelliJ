package week3.practice.dateTimeFormatting;

import java.text.*;

//choiceformatex1에서 패턴 사용함. limit#value의 형태
//패턴 1. # : 경계값을 범위에 포함 (이상/이하)
//패턴 2. < : 경계값을 범위에 포함하지 않음 (초과/미만)
public class ChoiceFormatEx2 {
    public static void main(String[] args) {
        String pattern = "60#D|70#C|80#B|90#A";
        int[] scores = {91, 90, 80, 88, 70, 52, 60};

        ChoiceFormat form = new ChoiceFormat(pattern);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }
    }
}
