package week4.day5_fri;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr) {
        int i = 1;
        int tmp = 0;
        if (arr[i] < arr[i-1]) {//arr[1] vs arr[0]
            //swap
            tmp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = tmp;
        }
        return arr; //[5, 8, 6, 2, 4]

    }

    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};

        InsertionSort01 is = new InsertionSort01();
        int[] result = is.sort(arr);
        System.out.println(Arrays.toString(result));
    }

}
