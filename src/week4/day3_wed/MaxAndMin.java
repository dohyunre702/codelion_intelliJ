package week4.day3_wed;

interface Compare {
    boolean doSomething(int valueA, int valueB);
}

public class MaxAndMin {
    private int getMaxOrMin(int[] arr, Compare compare) { //콜백 : 인터페이스 자체를 넘겨버리는 것
        ////loop 구성
        int targetValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            boolean isSth = arr[i] > targetValue;
            if (isSth) {
                targetValue = arr[i];
                }
            }
        return targetValue;
    }

    public int max(int[] arr) { //인터페이스 구현체
        return getMaxOrMin(arr, new Compare() { //내부 클래스

            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,29,38,12,57,74,40,85,61};
        MaxAndMin maxandMin = new MaxAndMin();
        int maxResult = maxandMin.max(arr);
        int minResult = maxandMin.min(arr);
        System.out.println(maxResult);
        System.out.println(minResult);
    }
}
