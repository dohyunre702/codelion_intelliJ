package week4.day5_fri;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr) {
        //루프 i 적용
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
//              System.out.printf("i:%d j:%d j-1:%d\n", i, j, j-1);
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr; //[5, 8, 6, 2, 4]
    }


    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};

        InsertionSort01 is = new InsertionSort01();
        arr = new int[]{5,8,6,2,4};
        int[] result = is.sort(arr);
        System.out.println(Arrays.toString(result));
    }

}
