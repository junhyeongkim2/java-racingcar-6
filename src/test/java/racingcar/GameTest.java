package racingcar;

import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.Game;
import racingcar.model.Participants;
import racingcar.model.Winners;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class GameTest {

    @DisplayName("전체 자동차 전진 테스트")
    @Test
    void moveForwardAllCars_EqualDistance_Success() {
        //given
        String participants = "pobi,jun,king";
        Cars cars = new Cars(participants);
        Game game = new Game(participants);
        //when
        List<Car> carPositions = cars.getCars().stream().peek(car -> car.moveForward(5)).collect(Collectors.toList());

        //then
        carPositions.stream().forEach(carPosition -> assertThat(carPosition.getPosition()).isEqualTo(1));
    }

    @DisplayName("우승자 계산 성공 테스트")
    @Test
    void judgeWinners_EqualWinners_Success() {
        //given
        Game game = new Game("pobi,jun,king");
        Cars cars = new Cars("pobi,jun,king");

        //when
        cars.getCars().stream().map(car -> car.moveForward(5));
        Winners winners = game.judgeWinners();
        //then
        assertThat(winners.getWinners().size()).isEqualTo(3);
        assertThat(winners.getWinners().get(0)).isEqualTo("pobi");
        assertThat(winners.getWinners().get(1)).isEqualTo("jun");
        assertThat(winners.getWinners().get(2)).isEqualTo("king");
    }


}
