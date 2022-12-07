import view.ConsoleView;
import view.InputView;
import view.OutputView;

public class Application {
    public static void maina(String[] args) {
        ConsoleView consoleView = new ConsoleView(new InputView(), new OutputView());

        String[] carsName = consoleView.requestCarsName();
        int tryCount = consoleView.requestTryCount();
    }
}
