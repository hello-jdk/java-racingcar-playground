import DB.CarDTO;
import domain.Car;
import domain.RacingGame;
import domain.RandomNumberGeneratorByRandomClass;
import java.util.ArrayList;
import java.util.List;
import view.ConsoleView;
import view.InputView;
import view.OutputView;

public class Application {
    public static void main(String[] args) {
        ConsoleView consoleView = new ConsoleView(new InputView(), new OutputView());
        RacingGame racingGame = makeRacingGame(consoleView);
        racingGameStart(consoleView, racingGame);
        consoleView.printResult(racingGame.calculateWinner());
    }

    private static RacingGame makeRacingGame(ConsoleView consoleView) {
        String[] carsName = consoleView.requestCarsName();
        List<Car> carList = makeStringArrToCarList(carsName);
        return new RacingGame(carList, new RandomNumberGeneratorByRandomClass());
    }

    private static List<Car> makeStringArrToCarList(String[] carsName) {
        List<Car> carList = new ArrayList<>();
        for (int eachCarIndex = 0; eachCarIndex < carsName.length; eachCarIndex++) {
            Car car = makeCarByCarName(carsName[eachCarIndex]);
            carList.add(car);
        }
        return carList;
    }

    private static Car makeCarByCarName(String carName) {
        final int INITIAL_DISTANCE = 0;
        CarDTO carDTO = new CarDTO(carName, INITIAL_DISTANCE);
        return new Car(carDTO);
    }

    private static void racingGameStart(ConsoleView consoleView, RacingGame racingGame) {
        int tryCount = consoleView.requestTryCount();
        for (int tryCountIndex = 0; tryCountIndex < tryCount; tryCountIndex++) {
            racingGame.tryMove();
            consoleView.printTryResult(racingGame);
        }
    }


}
