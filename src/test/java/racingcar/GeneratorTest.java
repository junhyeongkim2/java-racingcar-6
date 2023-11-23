package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Generator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.setRemoveAssertJRelatedElementsFromStackTrace;

public class GeneratorTest {

    @DisplayName("랜덤 번호 생성 정상 작동 테스트")
    @Test
    void generateRandomNumber_EqualResult_Success() {
        //given
        int randomNumber;
        //when
        randomNumber = Generator.generateRandomNumber();
        //then
        assertThat(randomNumber).isNotEqualTo(0);
        assertThat(randomNumber).isLessThanOrEqualTo(9).isGreaterThanOrEqualTo(0);
    }
}
