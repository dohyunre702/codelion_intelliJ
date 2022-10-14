package week4.day5_fri;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr, int i) {
        //1. i = 1일 때 arr[1] j vs arr[0]
        //2-1. i = 2일 때 arr[2] j vs arr[1]
        //2-2. i = 2일 때 arr[1] j vs arr[0]?
        int j = i;
        if (arr[j] < arr[j-1]) {
            //swap
            int tmp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = tmp;
        }
        return arr; //[5, 8, 6, 2, 4]

    }

    public static void main(String[] args) {
        int[] arr = {8,5,6,2,4};

        InsertionSort01 is = new InsertionSort01();
        arr = new int[]{5,8,6,2,4};
        int[] result = is.sort(arr, 2);
        System.out.println(Arrays.toString(result));
    }

}
