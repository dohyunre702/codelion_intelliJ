package week3.practice.dateTimeFormatting;

import java.text.*;

public class DecimalFormatEx1 {
    public static void main(String[] args) throws Exception{
        double number = 1234567.89;
        String [] pattern = {
         //10진수
         "0",
         "#",
         "0.0",
         "#.#",
         "0000000000.0000",
         "##########.####",
         "#.#-",
         "-#.#",
         "#,###.##",
         "#,####.##",
         //지수기호
         "#E0",
         "0E0",
         "##E0",
         "00E0",
         "####E0",
         "0000E0",
         "#.#E0",
         "0.0E0",
         "0.000000000E0",
         "00.00000000E0",
         "000.0000000E0",
         "#.#########E0",
         "##.########E0",
         "###.#######E0",
         //
         "#,###.##+;#,###.##-", //; 패턴 구분자
         "#.#%", //% 퍼센트
         "#.#\u2030", // 퍼밀(퍼센트 * 10)
         "\u00A4 #,###", //통화
         //escape cod
         "'#'#,###",
         "''#,###",
        };
        for (int i = 0; i< pattern.length; i++) {
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n", pattern[i], df.format(number));
        }
    }//main

}
