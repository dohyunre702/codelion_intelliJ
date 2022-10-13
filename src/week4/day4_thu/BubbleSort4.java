package week4.day4_thu;

import java.util.Arrays;

/*실습2. 오름차순 정렬하기
조건
1. static method는 main 말고는 쓰지 말기
2. int형 array를 return하고 int형 array를 받는 sort() 메소드 만들기
 */
public class BubbleSort4 {

    //시도 3. 이중 for문
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{7,2,3,9,28,11};

        BubbleSort4 try4 = new BubbleSort4();
        int[] result = try4.sort(arr1);
        System.out.println(Arrays.toString(result));
    }
}
