package week3.collection.thu;

import week3.calculator1.NumberCreator;

public class RandomNumWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for (int i =0; i < 50; i++) {
            int r = randomNumberGenerator.generate(10);
            System.out.println(r);
        }
    }
}
