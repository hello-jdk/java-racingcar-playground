package domain;

import DB.CarDTO;
import utils.Validator;

public class Car {
    private CarDTO car;

    public Car(CarDTO car) {
        Validator.checkCarName(car);
        this.car = car;
    }
}
