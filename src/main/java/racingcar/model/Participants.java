package racingcar.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import net.bytebuddy.pool.TypePool.Resolution.Illegal;

public class Participants {

    private static final String INVALID_INPUT_ERROR_MESSAGE = "[ERROR] 잘못된 값이 입력되었습니다.";

    private final List<String> participants;

    public Participants(String input) {
        this.participants = validateIsFiveUnderName(List.of(input.split(",")));
    }

    public static List<String> validateIsFiveUnderName(List<String> names) {
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException(INVALID_INPUT_ERROR_MESSAGE);
            }
        }
        return names;
    }

    public List<Car> generateParticipantsToCars() {
        return participants.stream().map(participant -> new Car(participant))
                .collect(Collectors.toList());
    }

    public List<String> getParticipants() {
        return Collections.unmodifiableList(this.participants);
    }
}
