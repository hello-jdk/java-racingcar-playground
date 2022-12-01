package racing;

import java.util.ArrayList;
import java.util.List;
import racing.utils.Validator;

public class RacingGame {
    private final List<Car> cars;
    private final RandomGenerator randomGenerator;

    public RacingGame(String[] names,RandomGenerator randomGenerator) {
        Validator.checkRacingGameNameSize(names);

        this.randomGenerator = randomGenerator;
        cars = new ArrayList<>();
        generateCars(names);
    }

    private void generateCars(String[] names) {
        for (String name : names) {
            cars.add(new Car(name));
        }
    }

    public void tryMove(int tryCount) {
        Validator.checkTryMoveCount(tryCount);
    }
}
