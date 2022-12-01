package racing;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    @DisplayName("Car 객체는 1자 이상 5글자 이하의 이름을 가지고 있다.")
    @Test
    void CarName() {
        assertThatThrownBy(() -> {
            Car userCar = new Car("");
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            Car userCar = new Car("123456");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}