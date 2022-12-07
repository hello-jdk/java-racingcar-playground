package domain;

import DB.CarDTO;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    @Test
    void 실행() {
        //given
        CarDTO carDTO1 = new CarDTO("one", 0);
        CarDTO carDTO2 = new CarDTO("two", 0);

        Car car1 = new Car(carDTO1);
        Car car2 = new Car(carDTO2);

        RacingGame racingGame = new RacingGame(List.of(car1, car2), new RandomNumberGenerator() {
            @Override
            public int generate() {
                return 5;
            }
        });

        //when
        racingGame.tryMove();

        //then
        Assertions.assertThat(racingGame.toString()).contains("one : -").contains("two : -");
    }

    @Test
    void 승자확인_한명() {
        CarDTO carDTOWin = new CarDTO("win", 10);
        CarDTO carDTOLose = new CarDTO("loser", 2);

        Car winner = new Car(carDTOWin);
        Car loser = new Car(carDTOLose);

        RacingGame racingGame = new RacingGame(List.of(winner, loser), new RandomNumberGeneratorByRandomClass());
        Assertions.assertThat(racingGame.calculateWinner()).isEqualTo("win");
    }

    @Test
    void 승자확인_여러명() {
        CarDTO carDTOWin1 = new CarDTO("win1", 10);
        CarDTO carDTOWin2 = new CarDTO("win2", 10);
        CarDTO carDTOWin3 = new CarDTO("win3", 10);
        CarDTO carDTOLose = new CarDTO("loser", 2);

        Car winner1 = new Car(carDTOWin1);
        Car winner2 = new Car(carDTOWin2);
        Car winner3 = new Car(carDTOWin3);
        Car loser = new Car(carDTOLose);

        RacingGame racingGame = new RacingGame(List.of(winner1, winner2, winner3, loser),
                new RandomNumberGeneratorByRandomClass());
        Assertions.assertThat(racingGame.calculateWinner()).isEqualTo("win1, win2, win3");
    }
}