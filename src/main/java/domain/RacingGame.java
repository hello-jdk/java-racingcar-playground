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

    public String calculateWinner() {
        StringBuilder winner = new StringBuilder();
        int highScore = 0;
        for (int car = 0; car < cars.size(); car++) {
            int score = calculateScore(car);
            winner = updateWinner(winner, highScore, car, score);
            highScore = updateHighScore(highScore, score);
        }
        return winner.toString();
    }

    private int calculateScore(int car) {
        int firstIndex = cars.get(car).toString().indexOf('-');
        int lastIndex = cars.get(car).toString().lastIndexOf('-');
        return lastIndex - firstIndex;
    }


    private StringBuilder updateWinner(StringBuilder winner, int highScore, int car, int score) {
        if (score > highScore) {
            winner = new StringBuilder(makeCarsName(car));
        }
        if (score == highScore) {
            winner.append(", ").append(makeCarsName(car));
        }
        return winner;
    }

    private String makeCarsName(int car) {
        int lastIndex = cars.get(car).toString().indexOf(" ");
        return cars.get(car).toString().substring(0, lastIndex);
    }

    private int updateHighScore(int highScore, int score) {
        if (score > highScore) {
            return score;
        }
        return highScore;
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
