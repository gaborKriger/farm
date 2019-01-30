package Util;

import java.util.Random;

public class MyRandom {

    private static final Random RANDOM = new Random();

    public MyRandom() {
    }

    public static boolean eventWithChance(int chance) {
        return RANDOM.nextInt(100) < chance;
    }
}
