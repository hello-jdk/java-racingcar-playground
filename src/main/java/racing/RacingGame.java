package racing;

import java.util.ArrayList;
import java.util.List;
import racing.utils.Validator;

public class RacingGame {
    private final List<Car> cars;

    public RacingGame(String[] names) {
        cars = new ArrayList<>();
        Validator.checkRacingGameNameSize(names);
        generateCars(names);
    }

    private void generateCars(String[] names) {
        for (String name : names) {
            cars.add(new Car(name));
        }
    }
}
