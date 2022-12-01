package racing;

import racing.utils.Validator;

public class Car {
    private final String name;
    private int distance;

    public Car(String name) {
        Validator.checkCarName(name);
        this.name = name;
        this.distance = 0;
    }

    public void move() {
        this.distance++;
    }
}
