public class Main {
    public static void main(String[] args) {
        //alt shift f10;
        int [] array = new int[10];

        for(int i =0; i < array.length; i++ ) {
            array[i] = i;
        }

        for(int i =0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}