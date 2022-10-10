package week3.practice;

import java.io.FileReader; //문자 스트림. 문자 단위로 입출력 수행하는 클래스
import java.io.IOException;

public class FileExercise {
    private String filename;


    public String readNchars(int N) throws IOException {
        FileReader fileReader = new FileReader(this.filename); //filename을 매개변수로 하는 fileReader 클래스의 객체를 생성.
        String str = ""; //공백
        for (int i = 0; i< N; i++) {
            //-가 나올 경우 break
            int asciiCd = fileReader.read();
            if (asciiCd == -1) {
                return str;
            }
            str += (char) asciiCd;
        }
        return str;

    }
}
