package domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import DB.CarDTO;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 자동차의_이름은_0자이상_5자이하이다() {
        Car car1 = new Car(new CarDTO("Name"));

        assertThatThrownBy(() -> {
            Car car2 = new Car(new CarDTO(""));
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            Car car3 = new Car(new CarDTO("NameName"));
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차의_이동() {
        Car car = new Car(new CarDTO("Name"));
        car.tryMove();
    }
}