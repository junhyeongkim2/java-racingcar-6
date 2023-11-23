package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Cars;
import racingcar.model.Participants;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class CarsTest {

    @DisplayName("자동차 이름 할당 성공 테스트")
    @Test
    void Cars_EqualName_Success() {
        //given
        Participants participants = new Participants("pobi,jun,king");
        //when
        Cars cars = new Cars(participants.getParticipants());
        //then
        assertThat(cars.getCars().size()).isEqualTo(3);
        assertThat(cars.getCars().get(0).getName()).isEqualTo("pobi");
        assertThat(cars.getCars().get(1).getName()).isEqualTo("jun");
        assertThat(cars.getCars().get(2).getName()).isEqualTo("king");
    }


}
