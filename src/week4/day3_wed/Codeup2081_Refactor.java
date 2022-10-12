package week4.day3_wed;

public class Codeup2081_Refactor {

    //값 받아서 배열에 저장하기
    public int[] getMax(int[] arr) {
        //loop
        int maxIdx = 0;
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public int[] getMin(int[] arr){
        int minIdx = 0;
        int minValue = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
                minIdx = i;
            }
        }
        return new int[]{minValue, minIdx};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,29,38,12,57,74,40,85,61};

        Codeup2081_Refactor getValue = new Codeup2081_Refactor();
        int[] result = getValue.getMax(arr);
        if (result[0] == -3 && result[1] == 0) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패" + result);
        }

    }
}
