package view;

import domain.RacingGame;

public class ConsoleView {
    private final InputView inputView;
    private final OutputView outputView;

    public ConsoleView(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public String[] requestCarsName() {
        outputView.printRequestCarsNameComment();
        return inputView.requestCarsName();
    }

    public int requestTryCount() {
        outputView.printRequestTryCountComment();
        return inputView.requestTryCount();
    }

    public void printTryResult(RacingGame racingGame) {
        outputView.printRacingGameResult(racingGame);
    }

    public void printResult(String winners) {
        outputView.printWinner(winners);
    }
}
