package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    @DisplayName("생성시 최소 2개 이상의 자동차가 있어야한다.")
    @Test
    void racingConstructor() {
        String[] names = {"name1"};
        Assertions.assertThatThrownBy(() -> {
            RacingGame racingGame = new RacingGame(names);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}