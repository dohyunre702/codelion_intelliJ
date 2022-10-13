package week4.day4_thu;

import java.util.Arrays;

/*실습2. 오름차순 정렬하기
조건
1. static method는 main 말고는 쓰지 말기
2. int형 array를 return하고 int형 array를 받는 sort() 메소드 만들기
 */
public class BubbleSort3 {

    //시도 1.i를 파라미터로 넘겨보기 + 반복 > 반복문 필요
    public int[] sort(int[] arr, int i) {
        for (int j = i; j < arr.length; j++) {
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

        BubbleSort3 try3 = new BubbleSort3();
        int[] result = try3.sort(arr1, 0);
        result = try3.sort(new int[]{2,7,3,9,28,11}, 1);
        System.out.println(Arrays.toString(result));
        result = try3.sort(new int[]{2,3,7,9,28,11}, 2);
        System.out.println(Arrays.toString(result));
        result = try3.sort(new int[]{2,3,7,9,28,11}, 3);
        System.out.println(Arrays.toString(result));
        result = try3.sort(new int[]{2,3,7,9,28,11}, 4);
        System.out.println(Arrays.toString(result));

    }
}
