package racing;

import racing.utils.Validator;

public class Car {
    final String name;
    final int distense;

    public Car(String name) {
        Validator.checkCarName(name);
        this.name = name;
        this.distense = 0;
    }
}
