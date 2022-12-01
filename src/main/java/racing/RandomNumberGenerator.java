package racing;

import java.util.Random;

public class RandomNumberGenerator implements RandomGenerator{
    @Override
    public int generate() {
        return new Random().nextInt(10);
    }
}
