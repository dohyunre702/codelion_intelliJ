package week4.day4_thu;

import java.util.Arrays;

/*실습2. 오름차순 정렬하기
조건
1. static method는 main 말고는 쓰지 말기
2. int형 array를 return하고 int형 array를 받는 sort() 메소드 만들기
 */
public class BubbleSort2 {

    //시도 1.i를 파라미터로 넘겨보기
    public int[] sort(int[] arr, int i) {
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{7,2,3,9,28,11};

        BubbleSort2 try2 = new BubbleSort2();
        int[] result = try2.sort(arr1, 0);
        result = try2.sort(new int[]{2,7,3,9,28,11}, 0);
        System.out.println(Arrays.toString(result));

        /* = Arrays.toString(result));
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+",");
        }
        */
    }
}
