package utils;

import DB.CarDTO;

public class Validator {
    public static void checkCarName(CarDTO car) {
        String carName = car.getCarName();
        if (carName == null || carName.isEmpty()) {
            throw new IllegalArgumentException("자동차의 이름은 공백일 수 없습니다.");
        }
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        }
    }
}
