package week3.practice.dateTimeFormatting;

import java.text.*;
/*
    ChoiceFormat : 특정 범위에 속하는 값을 문자열로 변환
        //조건 1. 경계값(limits)의 경우 (1)double형 (2)반드시 오름차순 정렬
        //조건 2. 치환될 문자열 개수(grades)는 경계값(limits)개수와 같아야 한다.
        //조건 2 미충족시 > IllegalArgumentException 발생
 */
public class ChoiceFormatEx1 {
    public static void main(String[] args) {

        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};

        int[] scores = {100, 95, 88, 70, 52, 60, 70};
        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }
    }
}
