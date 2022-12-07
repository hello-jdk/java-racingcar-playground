package domain;

import DB.CarDTO;
import domain.utils.Validator;

public class Car {
    private CarDTO car;

    public Car(CarDTO car) {
        Validator.checkCarName(car);
        this.car = car;
    }

    public void move() {
        final int OFFSET = 1;
        int nextDistance = car.getDistanse() + OFFSET;
        this.car = new CarDTO(car.getCarName(), nextDistance);
    }

    @Override
    public String toString() {
        String distanceGraphics = makeGraphicsByDistance();
        return car.getCarName() + " : " + distanceGraphics;
    }

    private String makeGraphicsByDistance() {
        StringBuilder result = new StringBuilder();
        for (int distance = 0; distance < car.getDistanse(); distance++) {
            result.append("-");
        }
        return result.toString();
    }
}
