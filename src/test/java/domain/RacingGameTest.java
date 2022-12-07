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

}