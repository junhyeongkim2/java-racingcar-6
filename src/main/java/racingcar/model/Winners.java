package racingcar.model;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    private final List<String> winners;

    public Winners(Cars cars) {
        this.winners = judgeWinners(cars);
    }

    public List<String> judgeWinners(Cars cars) {
        return cars.getCars().stream()
                .map(car -> car.getPosition())
                .max(Integer::compare)
                .map(maxPosition -> cars.getCars().stream()
                        .filter(car -> car.getPosition() == maxPosition)
                        .map(Car::getName)
                        .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }

    public List<String> getWinners() {
        return Collections.unmodifiableList(this.winners);
    }


}
