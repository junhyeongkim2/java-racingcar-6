package racingcar;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.model.Participants;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameTest {

    @DisplayName("전체 자동차 전진 테스트")
    @Test
    void moveForwardAllCars_EqualDistance_Success() {
        //given
        Participants participants = new Participants("pobi,jun,king");
        Cars cars = new Cars(participants);
        Game game = new Game(cars, 5);
        //when
        List<Car> carPositions = game.moveForwardAllCars();
        //then
        carPositions.stream().forEach(carPosition-> assertThat(carPosition.getPosition()).isEqualTo(1));

    }

}
