package week4.day3_wed;

public class Codeup2081_Explanation {
    public int getMax(int[] arr) {
        // int maxValue = 0; //arr 원소가 모두 음수일 때는 max가 0이 됨
        int maxValue = arr[0];
        for (int i = 1; i<arr.length;i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,29,38,12,57,74,40,85,61};
        Codeup2081_Explanation max02 = new Codeup2081_Explanation();
        int result = max02.getMax(arr);
        if (result == 85) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패입니다. result:" + result);
        }
    }
}

