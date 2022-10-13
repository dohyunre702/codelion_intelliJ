package week4.day4_thu;
/*실습1. 배열에서 가장 작은 수를 0번째자리에 놓기
조건
1. static method는 main 말고는 쓰지 말기
2. int형 array를 return하고 int형 array를 받는 sort() 메소드 만들기
 */
public class BubbleSort1 {

    public int[] sort(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                tmp = arr[0];
                arr[0] = arr[i];
                arr[i] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{7,2,3,9,28,11};
        BubbleSort1 try1 = new BubbleSort1();

        try1.sort(arr1);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+",");
        }
    }
}
