package racingcar;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Participants;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ParticipantsTest {

    @DisplayName("참가자 split 성공 테스트")
    @Test
    void splitParticipants_EqualSize_Success() {
        //given
        Participants participants = new Participants("pobi,woni,jun");
        //when
        List<String> participantList = participants.getParticipants();
        //then
        assertThat(participantList.size()).isEqualTo(3);

    }

    @DisplayName("참가자 split 실패 테스트")
    @Test
    void splitParticipants_NotEqualSize_Success() {
        //given
        Participants participants = new Participants("pobi,woni,jun,hello");
        //when
        List<String> participantList = participants.getParticipants();
        //then
        assertThat(participantList.size()).isNotEqualTo(3);

    }


}
