package racingcar.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Participants {

    private final List<String> participants;

    public Participants(String input) {
        this.participants = List.of(input.split(","));
    }

    public List<Car> generateParticipantsToCars() {
        return participants.stream().map(participant -> new Car(participant))
                .collect(Collectors.toList());
    }

    public List<String> getParticipants() {
        return Collections.unmodifiableList(this.participants);
    }
}
