package racing;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    @DisplayName("생성시 최소 2개 이상의 자동차가 있어야한다.")
    @Test
    void racingConstructor() {
        String[] names = {"name1"};
        assertThatThrownBy(() -> {
            RacingGame racingGame = new RacingGame(names,new RandomNumberGenerator());
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("시도할 횟수는 최소 1번 이상이다.")
    @Test
    void racingTry() {
        String[] names = {"name1", "name2"};
        RacingGame racingGame = new RacingGame(names, new RandomNumberGenerator());

        assertThatThrownBy(() -> {
            racingGame.tryMove(0);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}