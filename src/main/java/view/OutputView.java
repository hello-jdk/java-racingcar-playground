package view;

import domain.RacingGame;

public class OutputView {
    public void printRequestCarsNameComment() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public void printRequestTryCountComment() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public void printRacingGameResult(RacingGame racingGame) {
        System.out.println(racingGame.toString());
    }

    public void printWinner(String winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
