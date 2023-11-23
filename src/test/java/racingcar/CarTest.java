package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {


    @DisplayName("자동차 전진 성공 테스트")
    @Test
    void moveForward_EqualDistance_Success() {

        //given
        Car car = new Car("jun");
        //when
        int position = car.moveForward(4);
        //then
        assertThat(position).isEqualTo(1);
    }

    @DisplayName("자동차 전진 실패 테스트")
    @Test
    void moveForward_EqualZeroDistance_Success() {

        //given
        Car car = new Car("jun");
        //when
        int position = car.moveForward(3);
        //then
        assertThat(position).isEqualTo(0);
    }



}
