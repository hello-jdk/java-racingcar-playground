package domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.RepeatedTest;

class RandomNumberGeneratorByRandomClassTest {

    @RepeatedTest(100)
    void 랜덤한번호는0부터9까지이다() {
        RandomNumberGeneratorByRandomClass rng = new RandomNumberGeneratorByRandomClass();
        int result = rng.generate();
        assertThat(result)
                .isGreaterThan(-1)
                .isLessThan(10);
    }

}