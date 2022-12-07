package domain;

import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private RandomNumberGenerator randomNumberGenerator;

    public RacingGame(List<Car> cars, RandomNumberGenerator randomNumberGenerator) {
        this.cars = cars;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void tryMove() {
        for (int carIndex = 0; carIndex < cars.size(); carIndex++) {
            eachCarTryMove(carIndex);
        }
    }

    private void eachCarTryMove(int carIndex) {
        boolean approveMove = isApproved();
        if (approveMove) {
            Car car = cars.get(carIndex);
            car.move();
        }
    }

    private boolean isApproved() {
        final int APPROVE_LEAST_NUMBER = 4;
        int number = randomNumberGenerator.generate();
        if (number >= APPROVE_LEAST_NUMBER) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return makeGraphicsByCarList();
    }

    private String makeGraphicsByCarList() {
        StringBuilder result = new StringBuilder();
        for (int eachCar = 0; eachCar < cars.size(); eachCar++) {
            result.append(cars.get(eachCar)).append("\n");
        }
        return result.toString();
    }
}
