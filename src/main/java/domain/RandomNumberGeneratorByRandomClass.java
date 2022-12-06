package domain;

import java.util.Random;

public class RandomNumberGeneratorByRandomClass implements RandomNumberGenerator {
    @Override
    public int generate() {
        return new Random().nextInt(10);
    }
}
