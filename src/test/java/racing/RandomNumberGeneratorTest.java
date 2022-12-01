package racing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class RandomNumberGeneratorTest {
    @DisplayName("항상 0이상 9이하의 숫자를 반환한다.")
    @RepeatedTest(100)
    void repeatTest() {
        RandomGenerator randomGenerator = new RandomNumberGenerator();
        int randNum = randomGenerator.generate();

        assertThat(randNum)
                .isGreaterThan(-1)
                .isLessThan(10);
    }
}