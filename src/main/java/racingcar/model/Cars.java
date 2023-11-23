package racingcar.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(Participants participants) {
        this.cars = participants.generateParticipantsToCars();
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }

    public List<Car> moveForwardAll() {
        return cars.stream().peek(car -> car.moveForward(Generator.generateRandomNumber()))
                .collect(Collectors.toList());
    }


}
