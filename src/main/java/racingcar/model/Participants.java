package racingcar.model;

import java.util.Collections;
import java.util.List;

public class Participants {

    private final List<String> participants;

    public Participants(String input) {
        this.participants = List.of(input.split(","));
    }

    public List<String> getParticipants() {
        return Collections.unmodifiableList(participants);
    }
}
