package week4.day3_wed.babylion;

public class Practice01 {
    public static void main(String[] args) {
        String[] arr = new String[7];
        arr[0] = "A1120837";
        arr[1] = "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114로";
        arr[2] = "서울특별시 금천구";
        arr[3] = "C";
        arr[4] = "2";

        //클래스 사용
        Hospital hospital = new Hospital(
                "A1120837",
                "서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114로",
                "C",
                2,
                "365병원",
                null
        );
        System.out.println(hospital.getDistrict());

    }
}

